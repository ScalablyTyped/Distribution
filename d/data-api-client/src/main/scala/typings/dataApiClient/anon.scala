package typings.dataApiClient

import typings.awsSdk.rdsdataserviceMod.Id
import typings.awsSdk.rdsdataserviceMod.RecordsFormatType
import typings.awsSdk.rdsdataserviceMod.ResultSetOptions
import typings.awsSdk.rdsdataserviceMod.SqlParameter
import typings.awsSdk.rdsdataserviceMod.SqlParameterSets
import typings.awsSdk.rdsdataserviceMod.SqlParametersList
import typings.awsSdk.rdsdataserviceMod.SqlStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Database extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var hydrateColumnNames: js.UndefOr[Boolean] = js.undefined
    
    var parameters: js.Array[Any] | Any
    
    var sql: String
  }
  object Database {
    
    inline def apply(parameters: js.Array[Any] | Any, sql: String): Database = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Database]
    }
    
    extension [Self <: Database](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHydrateColumnNames(value: Boolean): Self = StObject.set(x, "hydrateColumnNames", value.asInstanceOf[js.Any])
      
      inline def setHydrateColumnNamesUndefined: Self = StObject.set(x, "hydrateColumnNames", js.undefined)
      
      inline def setParameters(value: js.Array[Any] | Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeserializeDate extends StObject {
    
    var deserializeDate: js.UndefOr[Boolean] = js.undefined
    
    var treatAsLocalDate: js.UndefOr[Boolean] = js.undefined
  }
  object DeserializeDate {
    
    inline def apply(): DeserializeDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializeDate]
    }
    
    extension [Self <: DeserializeDate](x: Self) {
      
      inline def setDeserializeDate(value: Boolean): Self = StObject.set(x, "deserializeDate", value.asInstanceOf[js.Any])
      
      inline def setDeserializeDateUndefined: Self = StObject.set(x, "deserializeDate", js.undefined)
      
      inline def setTreatAsLocalDate(value: Boolean): Self = StObject.set(x, "treatAsLocalDate", value.asInstanceOf[js.Any])
      
      inline def setTreatAsLocalDateUndefined: Self = StObject.set(x, "treatAsLocalDate", js.undefined)
    }
  }
  
  trait HydrateColumnNames extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var hydrateColumnNames: js.UndefOr[Boolean] = js.undefined
    
    var parameters: js.UndefOr[js.Array[Any] | Any] = js.undefined
    
    var sql: String
    
    var transactionId: js.UndefOr[String] = js.undefined
  }
  object HydrateColumnNames {
    
    inline def apply(sql: String): HydrateColumnNames = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[HydrateColumnNames]
    }
    
    extension [Self <: HydrateColumnNames](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHydrateColumnNames(value: Boolean): Self = StObject.set(x, "hydrateColumnNames", value.asInstanceOf[js.Any])
      
      inline def setHydrateColumnNamesUndefined: Self = StObject.set(x, "hydrateColumnNames", js.undefined)
      
      inline def setParameters(value: js.Array[Any] | Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    }
  }
  
  trait InsertId extends StObject {
    
    var insertId: js.UndefOr[Any] = js.undefined
  }
  object InsertId {
    
    inline def apply(): InsertId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertId]
    }
    
    extension [Self <: InsertId](x: Self) {
      
      inline def setInsertId(value: Any): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    }
  }
  
  /* Inlined std.Omit<aws-sdk.aws-sdk/clients/rdsdataservice.BatchExecuteStatementRequest, data-api-client.data-api-client.OmittedValues> */
  trait OmitBatchExecuteStatement extends StObject {
    
    var parameterSets: js.UndefOr[SqlParameterSets] = js.undefined
    
    var sql: SqlStatement
    
    var transactionId: js.UndefOr[Id] = js.undefined
  }
  object OmitBatchExecuteStatement {
    
    inline def apply(sql: SqlStatement): OmitBatchExecuteStatement = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitBatchExecuteStatement]
    }
    
    extension [Self <: OmitBatchExecuteStatement](x: Self) {
      
      inline def setParameterSets(value: SqlParameterSets): Self = StObject.set(x, "parameterSets", value.asInstanceOf[js.Any])
      
      inline def setParameterSetsUndefined: Self = StObject.set(x, "parameterSets", js.undefined)
      
      inline def setParameterSetsVarargs(value: SqlParametersList*): Self = StObject.set(x, "parameterSets", js.Array(value*))
      
      inline def setSql(value: SqlStatement): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    }
  }
  
  /* Inlined std.Omit<aws-sdk.aws-sdk/clients/rdsdataservice.CommitTransactionRequest, data-api-client.data-api-client.OmittedValues> */
  trait OmitCommitTransactionRequ extends StObject {
    
    var transactionId: Id
  }
  object OmitCommitTransactionRequ {
    
    inline def apply(transactionId: Id): OmitCommitTransactionRequ = {
      val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitCommitTransactionRequ]
    }
    
    extension [Self <: OmitCommitTransactionRequ](x: Self) {
      
      inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<aws-sdk.aws-sdk/clients/rdsdataservice.ExecuteStatementRequest, data-api-client.data-api-client.OmittedValues> */
  trait OmitExecuteStatementReque extends StObject {
    
    var continueAfterTimeout: js.UndefOr[typings.awsSdk.rdsdataserviceMod.Boolean] = js.undefined
    
    var formatRecordsAs: js.UndefOr[RecordsFormatType] = js.undefined
    
    var includeResultMetadata: js.UndefOr[typings.awsSdk.rdsdataserviceMod.Boolean] = js.undefined
    
    var parameters: js.UndefOr[SqlParametersList] = js.undefined
    
    var resultSetOptions: js.UndefOr[ResultSetOptions] = js.undefined
    
    var sql: SqlStatement
    
    var transactionId: js.UndefOr[Id] = js.undefined
  }
  object OmitExecuteStatementReque {
    
    inline def apply(sql: SqlStatement): OmitExecuteStatementReque = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitExecuteStatementReque]
    }
    
    extension [Self <: OmitExecuteStatementReque](x: Self) {
      
      inline def setContinueAfterTimeout(value: typings.awsSdk.rdsdataserviceMod.Boolean): Self = StObject.set(x, "continueAfterTimeout", value.asInstanceOf[js.Any])
      
      inline def setContinueAfterTimeoutUndefined: Self = StObject.set(x, "continueAfterTimeout", js.undefined)
      
      inline def setFormatRecordsAs(value: RecordsFormatType): Self = StObject.set(x, "formatRecordsAs", value.asInstanceOf[js.Any])
      
      inline def setFormatRecordsAsUndefined: Self = StObject.set(x, "formatRecordsAs", js.undefined)
      
      inline def setIncludeResultMetadata(value: typings.awsSdk.rdsdataserviceMod.Boolean): Self = StObject.set(x, "includeResultMetadata", value.asInstanceOf[js.Any])
      
      inline def setIncludeResultMetadataUndefined: Self = StObject.set(x, "includeResultMetadata", js.undefined)
      
      inline def setParameters(value: SqlParametersList): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: SqlParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setResultSetOptions(value: ResultSetOptions): Self = StObject.set(x, "resultSetOptions", value.asInstanceOf[js.Any])
      
      inline def setResultSetOptionsUndefined: Self = StObject.set(x, "resultSetOptions", js.undefined)
      
      inline def setSql(value: SqlStatement): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    }
  }
  
  /* Inlined std.Omit<aws-sdk.aws-sdk/clients/rdsdataservice.RollbackTransactionRequest, data-api-client.data-api-client.OmittedValues> */
  trait OmitRollbackTransactionRe extends StObject {
    
    var transactionId: Id
  }
  object OmitRollbackTransactionRe {
    
    inline def apply(transactionId: Id): OmitRollbackTransactionRe = {
      val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitRollbackTransactionRe]
    }
    
    extension [Self <: OmitRollbackTransactionRe](x: Self) {
      
      inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
}
