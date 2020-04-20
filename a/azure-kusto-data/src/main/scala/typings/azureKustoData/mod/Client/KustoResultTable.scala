package typings.azureKustoData.mod.Client

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
    toJson: () => js.Any
  ): KustoResultTable[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rows = js.Any.fromFunction0(rows), toJson = js.Any.fromFunction0(toJson))
    __obj.asInstanceOf[KustoResultTable[T]]
  }
}

