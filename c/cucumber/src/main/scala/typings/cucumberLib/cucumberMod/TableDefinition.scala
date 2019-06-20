package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[java.lang.String]]
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[java.lang.String]]
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object TableDefinition {
  @scala.inline
  def apply(
    hashes: () => js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    raw: () => js.Array[js.Array[java.lang.String]],
    rows: () => js.Array[js.Array[java.lang.String]],
    rowsHash: () => org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): TableDefinition = {
    val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
  
    __obj.asInstanceOf[TableDefinition]
  }
}

