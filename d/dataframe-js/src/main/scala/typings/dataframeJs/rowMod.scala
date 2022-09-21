package typings.dataframeJs

import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowMod {
  
  /**
    * Row data structure used into the dataframe-js.
    */
  @JSImport("dataframe-js/row", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Row {
    /**
      * Create a new Row.
      * @param data The data of the Row.
      * @param columns The DataFrame column names.
      * @example
      * new Row({
      *      'column1': 3,
      *      'column2': 6,
      * })
      *
      * new Row([3, 6], ['column1', 'column2'])
      *
      * new Row(Row, ['column1', 'column3'])
      */
    def this(data: js.Array[Any], columns: js.Array[Any]) = this()
    def this(data: Row, columns: js.Array[Any]) = this()
    def this(data: Record[String, Any], columns: js.Array[Any]) = this()
  }
  
  /**
    * Row data structure used into the dataframe-js.
    */
  @js.native
  trait Row extends StObject {
    
    def __newInstance__(data: Any, columns: Any): Any = js.native
    
    def _build(data: Any): Any = js.native
    
    def _fromArray(array: Any): Any = js.native
    
    def _fromObject(`object`: Any): Any = js.native
    
    /**
      * Delete a Row value by its column.
      * @param columnToDel The column value to delete.
      * @returns A new Row without the deleted value.
      * @example
      * row.delete('column1')
      */
    def delete(columnToDel: String): Row = js.native
    
    /**
      * Get a Row value by its column.
      * @param columnToGet The column value to get.
      * @returns The selected value.
      * @example
      * row.get('column1')
      */
    def get(columnToGet: String): Any = js.native
    
    /**
      * Check if row contains a column.
      * @param columnName The column to check.
      * @returns The presence or not of the column.
      * @example
      * row.has('column1')
      */
    def has(columnName: String): Boolean = js.native
    
    /**
      * Get the Row hash code.
      * @returns The Row hash unique code.
      * @example
      * row.hash()
      */
    def hash(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[Any, Any, Any]] = js.native
    
    /**
      * Select columns into the Row.
      * @param columnNames The columns to select.
      * @returns A new Row containing only the selected columns.
      * @example
      * row.select('column1', 'column2')
      */
    def select(columnNames: String*): Row = js.native
    
    /**
      * Set a Row value by its column, or create a new value if column doesn't exist.
      * @param columnToSet The column value to set.
      * @returns A new Row with the modified / new value.
      * @example
      * row.set('column1', 6)
      */
    def set(columnToSet: String, value: Any): Row = js.native
    
    /**
      * Get the Row size.
      * @returns The Row length.
      * @example
      * row.size()
      */
    def size(): Any = js.native
    
    /**
      * Convert Row into Array, loosing column names.
      * @returns The Row values converted into Array.
      * @example
      * row.toArray()
      */
    def toArray(): js.Array[Any] = js.native
    
    /**
      * Convert Row into dict / hash / object.
      * @returns The Row converted into dict.
      * @example
      * row.toDict()
      */
    def toDict(): Any = js.native
  }
}
