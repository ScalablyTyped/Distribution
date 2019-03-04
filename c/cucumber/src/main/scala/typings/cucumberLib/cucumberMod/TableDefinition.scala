package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  def hashes(): js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  def raw(): js.Array[js.Array[java.lang.String]]
  def rows(): js.Array[js.Array[java.lang.String]]
  def rowsHash(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object TableDefinition {
  @scala.inline
  def apply(
    hashes: js.Function0[js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]],
    raw: js.Function0[js.Array[js.Array[java.lang.String]]],
    rows: js.Function0[js.Array[js.Array[java.lang.String]]],
    rowsHash: js.Function0[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ): TableDefinition = {
    val __obj = js.Dynamic.literal(hashes = hashes, raw = raw, rows = rows, rowsHash = rowsHash)
  
    __obj.asInstanceOf[TableDefinition]
  }
}

