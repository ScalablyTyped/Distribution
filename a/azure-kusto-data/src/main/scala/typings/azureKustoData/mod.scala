package typings.azureKustoData

import org.scalablytyped.runtime.TopLevel
import typings.adalNode.mod.UserCodeInfo
import typings.azureKustoData.anon.Mgmt
import typings.azureKustoData.mod.Client.KustoResponseDataSetV2
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("azure-kusto-data", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(kcsb: String) = this()
    def this(kcsb: KustoConnectionStringBuilder) = this()
    
    var aadHelper: js.Any = js.native
    
    var cluster: String = js.native
    
    var connectionString: KustoConnectionStringBuilder = js.native
    
    var endpoints: Mgmt = js.native
    
    def execute(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit]
    ): js.Any = js.native
    def execute(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit],
      properties: js.Any
    ): js.Any = js.native
    
    def executeMgmt(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit],
      properties: js.Any
    ): js.Any = js.native
    
    def executeQuery(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit],
      properties: js.Any
    ): js.Any = js.native
  }
  object Client {
    
    @js.native
    trait KustoResponseDataSet[T] extends StObject {
      
      var primaryResults: js.Array[KustoResultTable[T]] = js.native
      
      var statusTable: KustoResultTable[T] = js.native
      
      var tableNames: js.Array[String] = js.native
      
      var tables: js.Array[KustoResultTable[T]] = js.native
    }
    object KustoResponseDataSet {
      
      @scala.inline
      def apply[T](
        primaryResults: js.Array[KustoResultTable[T]],
        statusTable: KustoResultTable[T],
        tableNames: js.Array[String],
        tables: js.Array[KustoResultTable[T]]
      ): KustoResponseDataSet[T] = {
        val __obj = js.Dynamic.literal(primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
        __obj.asInstanceOf[KustoResponseDataSet[T]]
      }
      
      @scala.inline
      implicit class KustoResponseDataSetMutableBuilder[Self <: KustoResponseDataSet[_], T] (val x: Self with KustoResponseDataSet[T]) extends AnyVal {
        
        @scala.inline
        def setPrimaryResults(value: js.Array[KustoResultTable[T]]): Self = StObject.set(x, "primaryResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryResultsVarargs(value: KustoResultTable[T]*): Self = StObject.set(x, "primaryResults", js.Array(value :_*))
        
        @scala.inline
        def setStatusTable(value: KustoResultTable[T]): Self = StObject.set(x, "statusTable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableNames(value: js.Array[String]): Self = StObject.set(x, "tableNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableNamesVarargs(value: String*): Self = StObject.set(x, "tableNames", js.Array(value :_*))
        
        @scala.inline
        def setTables(value: js.Array[KustoResultTable[T]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTablesVarargs(value: KustoResultTable[T]*): Self = StObject.set(x, "tables", js.Array(value :_*))
      }
    }
    
    @js.native
    trait KustoResponseDataSetV2[T] extends KustoResponseDataSet[T] {
      
      def getCridColumn(): String = js.native
      
      def getErrorColumn(): String = js.native
      
      def getStatusColumn(): String = js.native
      
      var version: String = js.native
    }
    object KustoResponseDataSetV2 {
      
      @scala.inline
      def apply[T](
        getCridColumn: () => String,
        getErrorColumn: () => String,
        getStatusColumn: () => String,
        primaryResults: js.Array[KustoResultTable[T]],
        statusTable: KustoResultTable[T],
        tableNames: js.Array[String],
        tables: js.Array[KustoResultTable[T]],
        version: String
      ): KustoResponseDataSetV2[T] = {
        val __obj = js.Dynamic.literal(getCridColumn = js.Any.fromFunction0(getCridColumn), getErrorColumn = js.Any.fromFunction0(getErrorColumn), getStatusColumn = js.Any.fromFunction0(getStatusColumn), primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[KustoResponseDataSetV2[T]]
      }
      
      @scala.inline
      implicit class KustoResponseDataSetV2MutableBuilder[Self <: KustoResponseDataSetV2[_], T] (val x: Self with KustoResponseDataSetV2[T]) extends AnyVal {
        
        @scala.inline
        def setGetCridColumn(value: () => String): Self = StObject.set(x, "getCridColumn", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetErrorColumn(value: () => String): Self = StObject.set(x, "getErrorColumn", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetStatusColumn(value: () => String): Self = StObject.set(x, "getStatusColumn", js.Any.fromFunction0(value))
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    type KustoResultRow[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: T[P]}
      */ typings.azureKustoData.azureKustoDataStrings.KustoResultRow with TopLevel[T]
    
    @js.native
    trait KustoResultTable[T] extends StObject {
      
      var columns: js.Array[_] = js.native
      
      var id: String = js.native
      
      var kind: String = js.native
      
      var name: String = js.native
      
      def rows(): IterableIterator[KustoResultRow[T]] = js.native
      
      def toJson(): js.Any = js.native
    }
    object KustoResultTable {
      
      @scala.inline
      def apply[T](
        columns: js.Array[_],
        id: String,
        kind: String,
        name: String,
        rows: () => IterableIterator[KustoResultRow[T]],
        toJson: () => js.Any
      ): KustoResultTable[T] = {
        val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rows = js.Any.fromFunction0(rows), toJson = js.Any.fromFunction0(toJson))
        __obj.asInstanceOf[KustoResultTable[T]]
      }
      
      @scala.inline
      implicit class KustoResultTableMutableBuilder[Self <: KustoResultTable[_], T] (val x: Self with KustoResultTable[T]) extends AnyVal {
        
        @scala.inline
        def setColumns(value: js.Array[_]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRows(value: () => IterableIterator[KustoResultRow[T]]): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToJson(value: () => js.Any): Self = StObject.set(x, "toJson", js.Any.fromFunction0(value))
      }
    }
  }
  
  @JSImport("azure-kusto-data", "ClientRequestProperties")
  @js.native
  class ClientRequestProperties () extends StObject {
    def this(options: js.Any) = this()
    def this(options: js.UndefOr[scala.Nothing], parameters: js.Any) = this()
    def this(options: js.Any, parameters: js.Any) = this()
    
    def clearOptions(): Unit = js.native
    
    def clearParameters(): Unit = js.native
    
    def getOption(name: String, defaultValue: js.Any): js.Any = js.native
    
    def getParameter(name: String, defaultValue: js.Any): js.Any = js.native
    
    def getTimeout(): js.Any = js.native
    
    def setOption(name: String, value: js.Any): Unit = js.native
    
    def setParameter(name: String, value: js.Any): Unit = js.native
    
    def setTimeout(timeoutMillis: js.Any): Unit = js.native
    
    def toJson(): js.Any = js.native
  }
  
  @JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
  @js.native
  class KustoConnectionStringBuilder protected () extends StObject {
    def this(connectionString: String) = this()
    
    var aadUserId: js.UndefOr[String] = js.native
    
    var applicationCertificate: js.UndefOr[String] = js.native
    
    var applicationCertificateThumbprint: js.UndefOr[String] = js.native
    
    var applicationClientId: js.UndefOr[String] = js.native
    
    var applicationKey: js.UndefOr[String] = js.native
    
    var authorityId: String = js.native
    
    var dataSource: String = js.native
    
    var password: js.UndefOr[String] = js.native
  }
  /* static members */
  object KustoConnectionStringBuilder {
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadApplicationCertificateAuthentication")
    @js.native
    def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      certificate: String,
      thumbprint: String,
      authorityId: String
    ): KustoConnectionStringBuilder = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadApplicationKeyAuthentication")
    @js.native
    def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadDeviceAuthentication")
    @js.native
    def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = js.native
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadDeviceAuthentication")
    @js.native
    def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      authCallback: js.Function1[/* tokenReponse */ UserCodeInfo, Unit]
    ): KustoConnectionStringBuilder = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities(connectionString: String): KustoConnectionStringBuilder = js.native
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities(connectionString: String, msiEndpoint: js.UndefOr[scala.Nothing], clientId: String): KustoConnectionStringBuilder = js.native
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities(connectionString: String, msiEndpoint: String): KustoConnectionStringBuilder = js.native
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities(connectionString: String, msiEndpoint: String, clientId: String): KustoConnectionStringBuilder = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadUserPasswordAuthentication")
    @js.native
    def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = js.native
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadUserPasswordAuthentication")
    @js.native
    def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: js.Any): KustoConnectionStringBuilder = js.native
  }
}
