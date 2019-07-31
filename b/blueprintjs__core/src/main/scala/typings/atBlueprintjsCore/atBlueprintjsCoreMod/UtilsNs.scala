package typings.atBlueprintjsCore.atBlueprintjsCoreMod

import typings.atBlueprintjsCore.Anon_Key
import typings.atBlueprintjsCore.libEsmCommonUtilsCompareUtilsMod.IKeyBlacklist
import typings.atBlueprintjsCore.libEsmCommonUtilsCompareUtilsMod.IKeyWhitelist
import typings.atBlueprintjsCore.libEsmCommonUtilsMod.INamed
import typings.atBlueprintjsCore.libEsmCommonUtilsMod.IThrottledReactEventOptions
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Utils")
@js.native
object UtilsNs extends js.Object {
  def approxEqual(a: Double, b: Double): Boolean = js.native
  def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = js.native
  def arrayLengthCompare(): Double = js.native
  def arrayLengthCompare(a: js.Array[_]): Double = js.native
  def arrayLengthCompare(a: js.Array[_], b: js.Array[_]): Double = js.native
  def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): Boolean = js.native
  def arraysEqual(
    arrA: js.Array[_],
    arrB: js.Array[_],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): Boolean = js.native
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  def countDecimalPlaces(num: Double): Double = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = js.native
  def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = js.native
  def ensureElement(): ReactElement = js.native
  def ensureElement(
    child: js.UndefOr[ReactNode],
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 174 */ js.Any
  ): ReactElement = js.native
  def ensureElement(child: ReactNode): ReactElement = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Anon_Key[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Anon_Key[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Anon_Key[T]] = js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[String]): js.Array[Anon_Key[T]] = js.native
  def getDisplayName(ComponentClass: INamed): String = js.native
  def getDisplayName(ComponentClass: ComponentType[js.Object]): String = js.native
  def isElementOfType[P](element: js.Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def isNodeEnv(env: String): Boolean = js.native
  def isReactElement[T](child: ReactNode): /* is react.react.ReactElement */ Boolean = js.native
  def isReactNodeEmpty(): Boolean = js.native
  def isReactNodeEmpty(node: ReactNode): Boolean = js.native
  def isReactNodeEmpty(node: ReactNode, skipArray: Boolean): Boolean = js.native
  def safeInvoke[R](): js.UndefOr[R] = js.native
  def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = js.native
  def safeInvoke[A, R](func: js.UndefOr[scala.Nothing], arg1: A): js.UndefOr[R] = js.native
  def safeInvoke[A, R](func: js.Function1[/* arg1 */ A, R], arg1: A): js.UndefOr[R] = js.native
  def safeInvoke[A, B, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvoke[A, B, R](func: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, R](func: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, D, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, D, R](
    func: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, R](obj: T, key: K): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, R](obj: js.UndefOr[scala.Nothing], key: K): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, A, R](obj: T, key: K, arg1: A): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, A, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, A, B, R](obj: T, key: K, arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, A, B, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B, c : C): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, A, B, C, R](obj: T, key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
  def safeInvokeMember[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B, c : C): R}
    */ typings.atBlueprintjsCore.atBlueprintjsCoreStrings.safeInvokeMember with js.Any */, K /* <: String */, A, B, C, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
  def safeInvokeOrValue[R](): R = js.native
  def safeInvokeOrValue[R](funcOrValue: R): R = js.native
  def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: R, arg1: A): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: js.Function1[/* arg1 */ A, R], arg1: A): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: R, arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, C, R](funcOrValue: R, arg1: A, arg2: B, arg3: C): R = js.native
  def safeInvokeOrValue[A, B, C, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): R = js.native
  def safeInvokeOrValue[A, B, C, R](funcOrValue: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](funcOrValue: R, arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](
    funcOrValue: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): R = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyBlacklist[T]): Boolean = js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyWhitelist[T]): Boolean = js.native
  def throttle[T /* <: js.Function */](method: T): T = js.native
  def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = js.native
  def throttleReactEventCallback(
    callback: js.Function2[/* event */ SyntheticEvent[_, typings.react.Event], /* repeated */ js.Any, _]
  ): js.Function1[/* event2 */ SyntheticEvent[_, Event], Unit] = js.native
  def throttleReactEventCallback(
    callback: js.Function2[/* event */ SyntheticEvent[_, typings.react.Event], /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ SyntheticEvent[_, Event], Unit] = js.native
}

