package typings.azureKustoData

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.azureKustoData.anon.ColumnName
import typings.azureKustoData.anon.Data
import typings.azureKustoData.anon.Name
import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcModelsMod {
  
  @JSImport("azure-kusto-data/types/src/models", "KustoResultColumn")
  @js.native
  open class KustoResultColumn protected () extends StObject {
    def this(columnObj: ColumnName, ordinal: Double) = this()
    
    var name: String | Null = js.native
    
    var ordinal: Double = js.native
    
    var `type`: String | Null = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/models", "KustoResultRow")
  @js.native
  open class KustoResultRow protected ()
    extends StObject
       with /* column */ StringDictionary[Any] {
    def this(columns: js.Array[KustoResultColumn], row: NumberDictionary[Any]) = this()
    def this(columns: js.Array[KustoResultColumn], row: NumberDictionary[Any], dateTimeParser: DateTimeParser) = this()
    def this(
      columns: js.Array[KustoResultColumn],
      row: NumberDictionary[Any],
      dateTimeParser: Unit,
      timeSpanParser: TimeSpanParser
    ) = this()
    def this(
      columns: js.Array[KustoResultColumn],
      row: NumberDictionary[Any],
      dateTimeParser: DateTimeParser,
      timeSpanParser: TimeSpanParser
    ) = this()
    
    var columns: js.Array[KustoResultColumn] = js.native
    
    def getValueAt(index: Double): Any = js.native
    
    var raw: NumberDictionary[Any] = js.native
    
    def toJSON[T](): T = js.native
    
    /**
      * @deprecated use the compliant toJSON() instead
      */
    def toJson(): Record[String, Any] = js.native
    
    def values(): Generator[Any, Unit, Any] = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/models", "KustoResultTable")
  @js.native
  open class KustoResultTable protected ()
    extends StObject
       with /* row */ NumberDictionary[Any] {
    def this(tableObj: Table) = this()
    
    /* private */ var _dateTimeParser: Any = js.native
    
    val _rows: js.Array[Any] = js.native
    
    /* private */ var _timeSpanParser: Any = js.native
    
    var columns: js.Array[KustoResultColumn] = js.native
    
    def dateTimeParser: DateTimeParser = js.native
    def dateTimeParser_=(value: DateTimeParser): Unit = js.native
    
    var id: js.UndefOr[Double] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    def rows(): Generator[KustoResultRow, Unit, Any] = js.native
    
    def timeSpanParser: TimeSpanParser = js.native
    def timeSpanParser_=(value: TimeSpanParser): Unit = js.native
    
    def toJSON[T](): Name[T] = js.native
    
    /**
      * @deprecated use the compliant toJSON() instead
      */
    def toJson(): Data = js.native
  }
  
  @js.native
  sealed trait WellKnownDataSet extends StObject
  @JSImport("azure-kusto-data/types/src/models", "WellKnownDataSet")
  @js.native
  object WellKnownDataSet extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WellKnownDataSet & String] = js.native
    
    @js.native
    sealed trait PrimaryResult
      extends StObject
         with WellKnownDataSet
    /* "PrimaryResult" */ val PrimaryResult: typings.azureKustoData.typesSrcModelsMod.WellKnownDataSet.PrimaryResult & String = js.native
    
    @js.native
    sealed trait QueryCompletionInformation
      extends StObject
         with WellKnownDataSet
    /* "QueryCompletionInformation" */ val QueryCompletionInformation: typings.azureKustoData.typesSrcModelsMod.WellKnownDataSet.QueryCompletionInformation & String = js.native
    
    @js.native
    sealed trait QueryProperties
      extends StObject
         with WellKnownDataSet
    /* "QueryProperties" */ val QueryProperties: typings.azureKustoData.typesSrcModelsMod.WellKnownDataSet.QueryProperties & String = js.native
    
    @js.native
    sealed trait TableOfContents
      extends StObject
         with WellKnownDataSet
    /* "TableOfContents" */ val TableOfContents: typings.azureKustoData.typesSrcModelsMod.WellKnownDataSet.TableOfContents & String = js.native
  }
  
  trait Column extends StObject {
    
    var ColumnName: String
    
    var ColumnType: js.UndefOr[String] = js.undefined
    
    var DateType: js.UndefOr[String] = js.undefined
  }
  object Column {
    
    inline def apply(ColumnName: String): Column = {
      val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumnName(value: String): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
      
      inline def setColumnType(value: String): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
      
      inline def setColumnTypeUndefined: Self = StObject.set(x, "ColumnType", js.undefined)
      
      inline def setDateType(value: String): Self = StObject.set(x, "DateType", value.asInstanceOf[js.Any])
      
      inline def setDateTypeUndefined: Self = StObject.set(x, "DateType", js.undefined)
    }
  }
  
  type DateTimeParser = js.Function1[/* value */ String, Any]
  
  trait Table extends StObject {
    
    var Columns: js.Array[Column]
    
    var Rows: js.Array[js.Array[Any]]
    
    var TableId: js.UndefOr[Double] = js.undefined
    
    var TableKind: js.UndefOr[String] = js.undefined
    
    var TableName: String
  }
  object Table {
    
    inline def apply(Columns: js.Array[Column], Rows: js.Array[js.Array[Any]], TableName: String): Table = {
      val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value*))
      
      inline def setRows(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "Rows", js.Array(value*))
      
      inline def setTableId(value: Double): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      inline def setTableKind(value: String): Self = StObject.set(x, "TableKind", value.asInstanceOf[js.Any])
      
      inline def setTableKindUndefined: Self = StObject.set(x, "TableKind", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeSpanParser = js.Function1[/* value */ String, Any]
}
