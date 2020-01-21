package typings.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[StringDictionary[String]]
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[String]]
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[String]]
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): StringDictionary[String]
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
}

