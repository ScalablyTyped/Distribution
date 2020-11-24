package typings.blueprintjsCore.compareUtilsMod

import typings.blueprintjsCore.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
@js.native
object getDeepUnequalKeyValues extends js.Object {
  
  def apply[T /* <: js.Object */](): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T, objB: js.UndefOr[scala.Nothing], keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](
    objA: js.UndefOr[scala.Nothing],
    objB: js.UndefOr[scala.Nothing],
    keys: js.Array[/* keyof T */ String]
  ): js.Array[Key[T]] = js.native
}
