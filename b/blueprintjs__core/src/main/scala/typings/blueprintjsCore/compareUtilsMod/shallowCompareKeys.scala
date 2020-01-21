package typings.blueprintjsCore.compareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "shallowCompareKeys")
@js.native
object shallowCompareKeys extends js.Object {
  def apply[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: IKeyBlacklist[T]): Boolean = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: IKeyWhitelist[T]): Boolean = js.native
}

