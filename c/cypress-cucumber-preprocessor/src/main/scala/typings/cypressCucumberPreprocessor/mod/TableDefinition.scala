package typings.cypressCucumberPreprocessor.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDefinition extends js.Object {
  
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[StringDictionary[String]] = js.native
  
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[String]] = js.native
  
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[String]] = js.native
  
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): StringDictionary[String] = js.native
}
object TableDefinition {
  
  @scala.inline
  def apply(
    hashes: () => js.Array[StringDictionary[String]],
    raw: () => js.Array[js.Array[String]],
    rows: () => js.Array[js.Array[String]],
    rowsHash: () => StringDictionary[String]
  ): TableDefinition = {
    val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
    __obj.asInstanceOf[TableDefinition]
  }
  
  @scala.inline
  implicit class TableDefinitionOps[Self <: TableDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHashes(value: () => js.Array[StringDictionary[String]]): Self = this.set("hashes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRaw(value: () => js.Array[js.Array[String]]): Self = this.set("raw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRows(value: () => js.Array[js.Array[String]]): Self = this.set("rows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowsHash(value: () => StringDictionary[String]): Self = this.set("rowsHash", js.Any.fromFunction0(value))
  }
}
