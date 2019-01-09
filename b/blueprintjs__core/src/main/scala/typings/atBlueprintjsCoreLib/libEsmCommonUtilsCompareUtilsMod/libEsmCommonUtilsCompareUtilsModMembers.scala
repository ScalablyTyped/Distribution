package typings
package atBlueprintjsCoreLib.libEsmCommonUtilsCompareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", JSImport.Namespace)
@js.native
object libEsmCommonUtilsCompareUtilsModMembers extends js.Object {
  def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): scala.Boolean = js.native
  def arraysEqual(
    arrA: js.Array[_],
    arrB: js.Array[_],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  ): scala.Boolean = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any): scala.Boolean = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[java.lang.String]): scala.Boolean = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[atBlueprintjsCoreLib.Anon_KeyValueA[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[atBlueprintjsCoreLib.Anon_KeyValueA[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[atBlueprintjsCoreLib.Anon_KeyValueA[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[java.lang.String]): js.Array[atBlueprintjsCoreLib.Anon_KeyValueA[T]] = js.native
  def getShallowUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[atBlueprintjsCoreLib.Anon_Key] = js.native
  def getShallowUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: IKeyBlacklist[T]): js.Array[atBlueprintjsCoreLib.Anon_Key] = js.native
  def getShallowUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: IKeyWhitelist[T]): js.Array[atBlueprintjsCoreLib.Anon_Key] = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): scala.Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyBlacklist[T]): scala.Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyWhitelist[T]): scala.Boolean = js.native
}

