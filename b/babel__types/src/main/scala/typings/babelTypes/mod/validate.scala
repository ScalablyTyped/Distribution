package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "validate")
@js.native
object validate extends js.Object {
  def apply(n: Node, key: String, value: js.Any): Unit = js.native
  def apply[T /* <: Node */, K /* <: /* keyof T */ String */](
    n: js.UndefOr[Node],
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
  def apply[T /* <: Node */, K /* <: /* keyof T */ String */](
    n: Null,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
}

