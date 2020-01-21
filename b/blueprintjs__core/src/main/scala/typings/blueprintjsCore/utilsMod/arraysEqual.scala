package typings.blueprintjsCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "arraysEqual")
@js.native
object arraysEqual extends js.Object {
  def apply(arrA: js.Array[_], arrB: js.Array[_]): Boolean = js.native
  def apply(
    arrA: js.Array[_],
    arrB: js.Array[_],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): Boolean = js.native
}

