package typings.azureDashKustoDashData.azureDashKustoDashDataMod.ClientNs

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KustoResultTable[T] extends js.Object {
  var columns: js.Array[_]
  var id: String
  var kind: String
  var name: String
  def rows(): IterableIterator[KustoResultRow[T]]
  def toJson(): js.Any
}

object KustoResultTable {
  @scala.inline
  def apply[T](
    columns: js.Array[_],
    id: String,
    kind: String,
    name: String,
    rows: () => IterableIterator[KustoResultRow[T]],
    toJson: () => js.Any,
    toString: () => String
  ): KustoResultTable[T] = {
    val __obj = js.Dynamic.literal(columns = columns, id = id, kind = kind, name = name, rows = js.Any.fromFunction0(rows), toJson = js.Any.fromFunction0(toJson), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[KustoResultTable[T]]
  }
}

