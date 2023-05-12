package typings.cucumberCucumber

import typings.cucumberMessages.mod.PickleTable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsDataTableMod {
  
  @JSImport("@cucumber/cucumber/lib/models/data_table", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataTable {
    def this(sourceTable: js.Array[js.Array[String]]) = this()
    def this(sourceTable: PickleTable) = this()
    
    /* CompleteClass */
    override def hashes(): js.Array[Record[String, String]] = js.native
    
    /* CompleteClass */
    override def raw(): js.Array[js.Array[String]] = js.native
    
    /* private */ /* CompleteClass */
    override val rawTable: Any = js.native
    
    /* CompleteClass */
    override def rows(): js.Array[js.Array[String]] = js.native
    
    /* CompleteClass */
    override def rowsHash(): Record[String, String] = js.native
    
    /* CompleteClass */
    override def transpose(): DataTable = js.native
  }
  
  trait DataTable extends StObject {
    
    def hashes(): js.Array[Record[String, String]]
    
    def raw(): js.Array[js.Array[String]]
    
    /* private */ val rawTable: Any
    
    def rows(): js.Array[js.Array[String]]
    
    def rowsHash(): Record[String, String]
    
    def transpose(): DataTable
  }
  object DataTable {
    
    inline def apply(
      hashes: () => js.Array[Record[String, String]],
      raw: () => js.Array[js.Array[String]],
      rawTable: Any,
      rows: () => js.Array[js.Array[String]],
      rowsHash: () => Record[String, String],
      transpose: () => DataTable
    ): DataTable = {
      val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rawTable = rawTable.asInstanceOf[js.Any], rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash), transpose = js.Any.fromFunction0(transpose))
      __obj.asInstanceOf[DataTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTable] (val x: Self) extends AnyVal {
      
      inline def setHashes(value: () => js.Array[Record[String, String]]): Self = StObject.set(x, "hashes", js.Any.fromFunction0(value))
      
      inline def setRaw(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setRawTable(value: Any): Self = StObject.set(x, "rawTable", value.asInstanceOf[js.Any])
      
      inline def setRows(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
      
      inline def setRowsHash(value: () => Record[String, String]): Self = StObject.set(x, "rowsHash", js.Any.fromFunction0(value))
      
      inline def setTranspose(value: () => DataTable): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
    }
  }
}
