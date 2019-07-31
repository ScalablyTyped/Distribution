package typings.atBlueprintjsCore.libEsmCommonUtilsCompareUtilsMod

import typings.atBlueprintjsCore.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): Boolean = js.native
  def arraysEqual(
    arrA: js.Array[_],
    arrB: js.Array[_],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): Boolean = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Anon_Key[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Anon_Key[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Anon_Key[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[String]): js.Array[Anon_Key[T]] = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyBlacklist[T]): Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyWhitelist[T]): Boolean = js.native
}

