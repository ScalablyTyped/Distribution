package typings.blueprintjsCore.compareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "shallowCompareKeys")
@js.native
object shallowCompareKeys extends js.Object {
  def apply[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: IKeyAllowlist[T]): Boolean = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: IKeyDenylist[T]): Boolean = js.native
}

