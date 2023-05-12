package typings.azureKustoData

import org.scalablytyped.runtime.StringDictionary
import typings.azureKustoData.anon.Errors
import typings.azureKustoData.anon.HasErrors
import typings.azureKustoData.azureKustoDataStrings.DataSetCompletion
import typings.azureKustoData.azureKustoDataStrings.DataSetHeader
import typings.azureKustoData.azureKustoDataStrings.DataTable
import typings.azureKustoData.typesSrcModelsMod.KustoResultTable
import typings.azureKustoData.typesSrcModelsMod.Table
import typings.azureKustoData.typesSrcModelsMod.WellKnownDataSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcResponseMod {
  
  /* note: abstract class */ @JSImport("azure-kusto-data/types/src/response", "KustoResponseDataSet")
  @js.native
  open class KustoResponseDataSet protected () extends StObject {
    /* protected */ def this(tables: js.Array[Table]) = this()
    
    var dataSetCompletion: HasErrors | Null = js.native
    
    def getCridColumn(): String = js.native
    
    def getErrorColumn(): String = js.native
    
    /* private */ var getErrorsByLevel: Any = js.native
    
    def getErrorsCount(): Errors = js.native
    
    def getExceptions(): js.Array[String] = js.native
    
    def getStatusColumn(): String = js.native
    
    def getWarnings(): js.Array[String] = js.native
    
    var primaryResults: js.Array[KustoResultTable] = js.native
    
    var statusTable: js.UndefOr[KustoResultTable] = js.native
    
    var tableNames: js.Array[String] = js.native
    
    var tables: js.Array[KustoResultTable] = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/response", "KustoResponseDataSetV1")
  @js.native
  open class KustoResponseDataSetV1 protected () extends KustoResponseDataSet {
    def this(data: V1) = this()
    
    @JSName("dataSetCompletion")
    var dataSetCompletion_KustoResponseDataSetV1: Null = js.native
    
    var version: String = js.native
  }
  /* static members */
  object KustoResponseDataSetV1 {
    
    @JSImport("azure-kusto-data/types/src/response", "KustoResponseDataSetV1")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getTablesKinds(): StringDictionary[WellKnownDataSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTablesKinds")().asInstanceOf[StringDictionary[WellKnownDataSet]]
  }
  
  @JSImport("azure-kusto-data/types/src/response", "KustoResponseDataSetV2")
  @js.native
  open class KustoResponseDataSetV2 protected () extends KustoResponseDataSet {
    def this(data: V2Frames) = this()
    
    @JSName("dataSetCompletion")
    var dataSetCompletion_KustoResponseDataSetV2: V2DataSetCompletionFrame | Null = js.native
    
    var dataSetHeader: V2DataSetHeaderFrame | Null = js.native
    
    var version: String = js.native
  }
  
  trait Column extends StObject {
    
    var ColumnName: String
    
    var ColumnType: String
  }
  object Column {
    
    inline def apply(ColumnName: String, ColumnType: String): Column = {
      val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumnName(value: String): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
      
      inline def setColumnType(value: String): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
    }
  }
  
  trait V1 extends StObject {
    
    var Tables: js.Array[Table]
  }
  object V1 {
    
    inline def apply(Tables: js.Array[Table]): V1 = {
      val __obj = js.Dynamic.literal(Tables = Tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[V1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V1] (val x: Self) extends AnyVal {
      
      inline def setTables(value: js.Array[Table]): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
      
      inline def setTablesVarargs(value: Table*): Self = StObject.set(x, "Tables", js.Array(value*))
    }
  }
  
  trait V2DataSetCompletionFrame extends StObject {
    
    var Cancelled: Boolean
    
    var FrameType: DataSetCompletion
    
    var HasErrors: Boolean
  }
  object V2DataSetCompletionFrame {
    
    inline def apply(Cancelled: Boolean, HasErrors: Boolean): V2DataSetCompletionFrame = {
      val __obj = js.Dynamic.literal(Cancelled = Cancelled.asInstanceOf[js.Any], FrameType = "DataSetCompletion", HasErrors = HasErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[V2DataSetCompletionFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V2DataSetCompletionFrame] (val x: Self) extends AnyVal {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "Cancelled", value.asInstanceOf[js.Any])
      
      inline def setFrameType(value: DataSetCompletion): Self = StObject.set(x, "FrameType", value.asInstanceOf[js.Any])
      
      inline def setHasErrors(value: Boolean): Self = StObject.set(x, "HasErrors", value.asInstanceOf[js.Any])
    }
  }
  
  trait V2DataSetHeaderFrame extends StObject {
    
    var FrameType: DataSetHeader
    
    var IsProgressive: Boolean
    
    var Version: String
  }
  object V2DataSetHeaderFrame {
    
    inline def apply(IsProgressive: Boolean, Version: String): V2DataSetHeaderFrame = {
      val __obj = js.Dynamic.literal(FrameType = "DataSetHeader", IsProgressive = IsProgressive.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[V2DataSetHeaderFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V2DataSetHeaderFrame] (val x: Self) extends AnyVal {
      
      inline def setFrameType(value: DataSetHeader): Self = StObject.set(x, "FrameType", value.asInstanceOf[js.Any])
      
      inline def setIsProgressive(value: Boolean): Self = StObject.set(x, "IsProgressive", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait V2DataSetTableFrame
    extends StObject
       with Table {
    
    @JSName("Columns")
    var Columns_V2DataSetTableFrame: js.Array[Column]
    
    var FrameType: DataTable
    
    @JSName("TableId")
    var TableId_V2DataSetTableFrame: Double
    
    @JSName("TableKind")
    var TableKind_V2DataSetTableFrame: String
  }
  object V2DataSetTableFrame {
    
    inline def apply(
      Columns: js.Array[Column],
      Rows: js.Array[js.Array[Any]],
      TableId: Double,
      TableKind: String,
      TableName: String
    ): V2DataSetTableFrame = {
      val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], FrameType = "DataTable", Rows = Rows.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableKind = TableKind.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[V2DataSetTableFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V2DataSetTableFrame] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value*))
      
      inline def setFrameType(value: DataTable): Self = StObject.set(x, "FrameType", value.asInstanceOf[js.Any])
      
      inline def setTableId(value: Double): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableKind(value: String): Self = StObject.set(x, "TableKind", value.asInstanceOf[js.Any])
    }
  }
  
  type V2Frames = js.Array[V2DataSetHeaderFrame | V2DataSetTableFrame | V2DataSetCompletionFrame]
}
