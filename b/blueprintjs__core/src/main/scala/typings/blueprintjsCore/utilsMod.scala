package typings.blueprintjsCore

import typings.blueprintjsCore.anon.Key
import typings.blueprintjsCore.compareUtilsMod.KeyAllowlist
import typings.blueprintjsCore.compareUtilsMod.KeyDenylist
import typings.blueprintjsCore.domUtilsMod.IThrottledReactEventOptions
import typings.blueprintjsCore.reactUtilsMod.INamed
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.GetRootNodeOptions
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def approxEqual(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approxEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approxEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayLengthCompare(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")().asInstanceOf[Double]
  inline def arrayLengthCompare(a: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def arrayLengthCompare(a: js.Array[Any], b: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayLengthCompare(a: Unit, b: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def arraysEqual(arrA: js.Array[Any], arrB: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(arrA: js.Array[Any], arrB: js.Array[Any], compare: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clamp(`val`: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def countDecimalPlaces(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countDecimalPlaces")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def deepCompareKeys(objA: Any, objB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def deepCompareKeys(objA: Any, objB: Any, keys: js.Array[String | Double | js.Symbol]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementIsOrContains")(element.asInstanceOf[js.Any], testElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ensureElement(): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")().asInstanceOf[js.UndefOr[ReactElement]]
  inline def ensureElement(
    child: Unit,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  inline def ensureElement(child: ReactNode): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReactElement]]
  inline def ensureElement(
    child: ReactNode,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  
  inline def getActiveElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[Element | Null]
  inline def getActiveElement(element: Null, options: GetRootNodeOptions): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getActiveElement(element: Unit, options: GetRootNodeOptions): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getActiveElement(element: HTMLElement): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def getActiveElement(element: HTMLElement, options: GetRootNodeOptions): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")().asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  
  inline def getDisplayName(ComponentClass: INamed): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDisplayName(ComponentClass: ComponentType[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRef[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[T | Null]
  inline def getRef[T](ref: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def getRef[T](ref: RefObject[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def isDarkTheme(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDarkTheme")().asInstanceOf[Boolean]
  inline def isDarkTheme(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDarkTheme")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDarkTheme(element: Text): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDarkTheme")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElementOfType[P](element: Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], ComponentType.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNodeEnv(env: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")(env.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isReactNodeEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")().asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: Unit, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: ReactNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: ReactNode, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setRef[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")().asInstanceOf[Unit]
  inline def setRef[T](refTarget: Unit, ref: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(refTarget.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](refTarget: Ref[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(refTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](refTarget: Ref[T], ref: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(refTarget.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shallowCompareKeys[T /* <: js.Object */](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")().asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Null, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Null, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Unit, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Unit, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: T, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: T, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Null, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Null, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Unit, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Unit, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: T, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: T, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Null, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Null, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Unit, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Unit, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def throttle[T /* <: js.Function */](method: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(method.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Event, Unit]]
  
  inline def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](callback: js.Function2[/* event */ E, /* repeated */ Any, Any]): js.Function1[/* event2 */ E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  inline def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](
    callback: js.Function2[/* event */ E, /* repeated */ Any, Any],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ E, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  
  inline def uniqueId(namespace: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(namespace.asInstanceOf[js.Any]).asInstanceOf[String]
}
