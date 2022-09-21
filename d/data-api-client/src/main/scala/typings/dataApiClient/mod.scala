package typings.dataApiClient

import typings.awsSdk.rdsdataserviceMod.BeginTransactionResponse
import typings.awsSdk.rdsdataserviceMod.ClientConfiguration
import typings.dataApiClient.anon.Database
import typings.dataApiClient.anon.DeserializeDate
import typings.dataApiClient.anon.HydrateColumnNames
import typings.dataApiClient.anon.InsertId
import typings.dataApiClient.anon.OmitBatchExecuteStatement
import typings.dataApiClient.anon.OmitCommitTransactionRequ
import typings.dataApiClient.anon.OmitExecuteStatementReque
import typings.dataApiClient.anon.OmitRollbackTransactionRe
import typings.dataApiClient.dataApiClientStrings.mysql
import typings.dataApiClient.dataApiClientStrings.pg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(params: iParams): iDataAPIClient = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[iDataAPIClient]
  
  @JSImport("data-api-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.dataApiClient.dataApiClientStrings.database
    - typings.dataApiClient.dataApiClientStrings.resourceArn
    - typings.dataApiClient.dataApiClientStrings.secretArn
    - typings.dataApiClient.dataApiClientStrings.schema
  */
  trait OmittedValues extends StObject
  object OmittedValues {
    
    inline def database: typings.dataApiClient.dataApiClientStrings.database = "database".asInstanceOf[typings.dataApiClient.dataApiClientStrings.database]
    
    inline def resourceArn: typings.dataApiClient.dataApiClientStrings.resourceArn = "resourceArn".asInstanceOf[typings.dataApiClient.dataApiClientStrings.resourceArn]
    
    inline def schema: typings.dataApiClient.dataApiClientStrings.schema = "schema".asInstanceOf[typings.dataApiClient.dataApiClientStrings.schema]
    
    inline def secretArn: typings.dataApiClient.dataApiClientStrings.secretArn = "secretArn".asInstanceOf[typings.dataApiClient.dataApiClientStrings.secretArn]
  }
  
  @js.native
  trait Transaction extends StObject {
    
    def commit(): js.Promise[Unit] = js.native
    
    def query(obj: js.Function1[/* prevResult */ InsertId, Any]): Transaction = js.native
    // params can be [] or {};
    def query(obj: Database): Transaction = js.native
    def query(sql: String): Transaction = js.native
    def query(sql: String, params: js.Array[Any]): Transaction = js.native
    def query(sql: String, params: Any): Transaction = js.native
    
    def rollback(cb: js.Function2[/* error */ js.Error, /* status */ Any, Unit]): Transaction = js.native
  }
  
  @js.native
  trait iDataAPIClient extends StObject {
    
    // needs to return an interface with
    // promisified versions of the RDSDataService methods
    def batchExecuteStatement(params: OmitBatchExecuteStatement): js.Promise[Any] = js.native
    
    def beginTransaction(): js.Promise[BeginTransactionResponse] = js.native
    
    def commitTransaction(params: OmitCommitTransactionRequ): js.Promise[Any] = js.native
    
    def executeStatement(params: OmitExecuteStatementReque): js.Promise[Any] = js.native
    
    // params can be [] or {};
    def query[T](obj: HydrateColumnNames): js.Promise[iDataAPIQueryResult[T]] = js.native
    /* tslint:disable:no-unnecessary-generics */
    def query[T](sql: String): js.Promise[iDataAPIQueryResult[T]] = js.native
    def query[T](sql: String, params: js.Array[Any]): js.Promise[iDataAPIQueryResult[T]] = js.native
    def query[T](sql: String, params: Any): js.Promise[iDataAPIQueryResult[T]] = js.native
    
    def rollbackTransaction(params: OmitRollbackTransactionRe): js.Promise[Any] = js.native
    
    def transaction(): Transaction = js.native
  }
  
  trait iDataAPIQueryResult[T] extends StObject {
    
    var records: js.Array[T]
  }
  object iDataAPIQueryResult {
    
    inline def apply[T](records: js.Array[T]): iDataAPIQueryResult[T] = {
      val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[iDataAPIQueryResult[T]]
    }
    
    extension [Self <: iDataAPIQueryResult[?], T](x: Self & iDataAPIQueryResult[T]) {
      
      inline def setRecords(value: js.Array[T]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: T*): Self = StObject.set(x, "records", js.Array(value*))
    }
  }
  
  trait iParams extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var engine: js.UndefOr[mysql | pg] = js.undefined
    
    var formatOptions: js.UndefOr[DeserializeDate] = js.undefined
    
    var hydrateColumnNames: js.UndefOr[Boolean] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[ClientConfiguration] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var resourceArn: String
    
    var secretArn: String
    
    var sslEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object iParams {
    
    inline def apply(resourceArn: String, secretArn: String): iParams = {
      val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[iParams]
    }
    
    extension [Self <: iParams](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setEngine(value: mysql | pg): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setFormatOptions(value: DeserializeDate): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setHydrateColumnNames(value: Boolean): Self = StObject.set(x, "hydrateColumnNames", value.asInstanceOf[js.Any])
      
      inline def setHydrateColumnNamesUndefined: Self = StObject.set(x, "hydrateColumnNames", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setOptions(value: ClientConfiguration): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      inline def setSecretArn(value: String): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
      
      inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    }
  }
}
