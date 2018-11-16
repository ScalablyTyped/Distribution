package typings
package atBlueprintjsCoreLib.libEsmCommonUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", JSImport.Namespace)
@js.native
object libEsmCommonUtilsModMembers extends js.Object {
  def approxEqual(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def approxEqual(a: scala.Double, b: scala.Double, tolerance: scala.Double): scala.Boolean = js.native
  def arrayLengthCompare(): scala.Double = js.native
  def arrayLengthCompare(a: js.Array[_]): scala.Double = js.native
  def arrayLengthCompare(a: js.Array[_], b: js.Array[_]): scala.Double = js.native
  def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): scala.Boolean = js.native
  def arraysEqual(
    arrA: js.Array[_],
    arrB: js.Array[_],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  ): scala.Boolean = js.native
  def clamp(`val`: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def countDecimalPlaces(num: scala.Double): scala.Double = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any): scala.Boolean = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[java.lang.String]): scala.Boolean = js.native
  def elementIsOrContains(element: reactLib.HTMLElement, testElement: reactLib.HTMLElement): scala.Boolean = js.native
  def ensureElement(): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def ensureElement(
    child: reactLib.reactMod.ReactNs.ReactChild | js.UndefOr[scala.Nothing],
    tagName: /* LimitUnionLength: was union type with length 170 */java.lang.String
  ): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def ensureElement(child: reactLib.reactMod.ReactNs.ReactChild): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[atBlueprintjsCoreLib.Anon_ValueAKey[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[atBlueprintjsCoreLib.Anon_ValueAKey[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[atBlueprintjsCoreLib.Anon_ValueAKey[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[java.lang.String]): js.Array[atBlueprintjsCoreLib.Anon_ValueAKey[T]] = js.native
  def getDisplayName(ComponentClass: INamed): java.lang.String = js.native
  def getDisplayName(ComponentClass: reactLib.reactMod.ReactNs.ComponentType[js.Object]): java.lang.String = js.native
  def getShallowUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[atBlueprintjsCoreLib.Anon_ValueA] = js.native
  def getShallowUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: atBlueprintjsCoreLib.libEsmCommonUtilsCompareUtilsMod.IKeyBlacklist[T]): js.Array[atBlueprintjsCoreLib.Anon_ValueA] = js.native
  def getShallowUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: atBlueprintjsCoreLib.libEsmCommonUtilsCompareUtilsMod.IKeyWhitelist[T]): js.Array[atBlueprintjsCoreLib.Anon_ValueA] = js.native
  def isElementOfType[P](element: js.Any, ComponentType: reactLib.reactMod.ReactNs.ComponentType[P]): /* is ReactElement */scala.Boolean = js.native
  def isFunction(value: js.Any): /* is Function */scala.Boolean = js.native
  def isNodeEnv(env: java.lang.String): scala.Boolean = js.native
  def isReactNodeEmpty(): scala.Boolean = js.native
  def isReactNodeEmpty(node: reactLib.reactMod.ReactNs.ReactNode): scala.Boolean = js.native
  def isReactNodeEmpty(node: reactLib.reactMod.ReactNs.ReactNode, skipArray: scala.Boolean): scala.Boolean = js.native
  def safeInvoke[R](): js.UndefOr[R] = js.native
  def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = js.native
  def safeInvoke[A, R](func: js.Function1[/* arg1 */ A, R], arg1: A): js.UndefOr[R] = js.native
  def safeInvoke[A, R](func: js.UndefOr[scala.Nothing], arg1: A): js.UndefOr[R] = js.native
  def safeInvoke[A, B, R](func: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvoke[A, B, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, R](func: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, D, R](
    func: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, D, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): js.UndefOr[R] = js.native
  def safeInvokeOrValue[R](): R = js.native
  def safeInvokeOrValue[R](funcOrValue: R): R = js.native
  def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: R, arg1: A): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: js.Function1[/* arg1 */ A, R], arg1: A): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: R, arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, C, R](funcOrValue: R, arg1: A, arg2: B, arg3: C): R = js.native
  def safeInvokeOrValue[A, B, C, R](funcOrValue: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): R = js.native
  def safeInvokeOrValue[A, B, C, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](funcOrValue: R, arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](
    funcOrValue: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): scala.Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: atBlueprintjsCoreLib.libEsmCommonUtilsCompareUtilsMod.IKeyBlacklist[T]): scala.Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: atBlueprintjsCoreLib.libEsmCommonUtilsCompareUtilsMod.IKeyWhitelist[T]): scala.Boolean = js.native
  def throttle[T /* <: js.Function */](method: T): T = js.native
  def throttleEvent(target: reactLib.EventTarget, eventName: java.lang.String, newEventName: java.lang.String): js.Function1[/* event */ reactLib.Event, scala.Unit] = js.native
  def throttleReactEventCallback(
    callback: js.Function2[/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[_], /* repeated */js.Any, _]
  ): js.Function1[/* event2 */ reactLib.reactMod.ReactNs.SyntheticEvent[_], scala.Unit] = js.native
  def throttleReactEventCallback(
    callback: js.Function2[/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[_], /* repeated */js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ reactLib.reactMod.ReactNs.SyntheticEvent[_], scala.Unit] = js.native
}

