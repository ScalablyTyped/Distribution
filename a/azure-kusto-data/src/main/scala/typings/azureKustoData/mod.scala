package typings.azureKustoData

import org.scalablytyped.runtime.TopLevel
import typings.adalNode.mod.UserCodeInfo
import typings.azureKustoData.anon.Mgmt
import typings.azureKustoData.mod.Client.KustoResponseDataSetV2
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[js.Any], Unit]
    ): js.Any = js.native
    def execute(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[js.Any], Unit],
      properties: js.Any
    ): js.Any = js.native
    
    def executeMgmt(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[js.Any], Unit],
      properties: js.Any
    ): js.Any = js.native
    
    def executeQuery(
      db: js.Any,
      query: js.Any,
      callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[js.Any], Unit],
      properties: js.Any
    ): js.Any = js.native
  }
  object Client {
    
    trait KustoResponseDataSet[T] extends StObject {
      
      var primaryResults: js.Array[KustoResultTable[T]]
      
      var statusTable: KustoResultTable[T]
      
      var tableNames: js.Array[String]
      
      var tables: js.Array[KustoResultTable[T]]
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
      implicit class KustoResponseDataSetMutableBuilder[Self <: KustoResponseDataSet[?], T] (val x: Self & KustoResponseDataSet[T]) extends AnyVal {
        
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
    
    trait KustoResponseDataSetV2[T]
      extends StObject
         with KustoResponseDataSet[T] {
      
      def getCridColumn(): String
      
      def getErrorColumn(): String
      
      def getStatusColumn(): String
      
      var version: String
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
      implicit class KustoResponseDataSetV2MutableBuilder[Self <: KustoResponseDataSetV2[?], T] (val x: Self & KustoResponseDataSetV2[T]) extends AnyVal {
        
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
      */ typings.azureKustoData.azureKustoDataStrings.KustoResultRow & TopLevel[T]
    
    trait KustoResultTable[T] extends StObject {
      
      var columns: js.Array[js.Any]
      
      var id: String
      
      var kind: String
      
      var name: String
      
      def rows(): IterableIterator[KustoResultRow[T]]
      
      def toJson(): js.Any
    }
    object KustoResultTable {
      
      @scala.inline
      def apply[T](
        columns: js.Array[js.Any],
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
      implicit class KustoResultTableMutableBuilder[Self <: KustoResultTable[?], T] (val x: Self & KustoResultTable[T]) extends AnyVal {
        
        @scala.inline
        def setColumns(value: js.Array[js.Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
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
    def this(options: js.Any, parameters: js.Any) = this()
    def this(options: Unit, parameters: js.Any) = this()
    
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
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      certificate: String,
      thumbprint: String,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], thumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    @scala.inline
    def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    @scala.inline
    def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    @scala.inline
    def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      authCallback: js.Function1[/* tokenReponse */ UserCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], authCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    @scala.inline
    def withAadManagedIdentities(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    @scala.inline
    def withAadManagedIdentities(connectionString: String, msiEndpoint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiEndpoint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    @scala.inline
    def withAadManagedIdentities(connectionString: String, msiEndpoint: String, clientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiEndpoint.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    @scala.inline
    def withAadManagedIdentities(connectionString: String, msiEndpoint: Unit, clientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiEndpoint.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    @scala.inline
    def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    @scala.inline
    def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: js.Any): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
}
