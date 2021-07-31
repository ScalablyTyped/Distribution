package typings.blueprintjsCore

import org.scalablytyped.runtime.TopLevel
import typings.blueprintjsCore.anon.Key
import typings.blueprintjsCore.compareUtilsMod.IKeyAllowlist
import typings.blueprintjsCore.compareUtilsMod.IKeyDenylist
import typings.blueprintjsCore.domUtilsMod.IThrottledReactEventOptions
import typings.blueprintjsCore.reactUtilsMod.INamed
import typings.blueprintjsCore.refsMod.IRefObject
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def approxEqual(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approxEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approxEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def arrayLengthCompare(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")().asInstanceOf[Double]
  @scala.inline
  def arrayLengthCompare(a: js.Array[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def arrayLengthCompare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def arrayLengthCompare(a: Unit, b: js.Array[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def arraysEqual(arrA: js.Array[js.Any], arrB: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def arraysEqual(
    arrA: js.Array[js.Any],
    arrB: js.Array[js.Any],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def clamp(`val`: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def countDecimalPlaces(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countDecimalPlaces")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def createReactRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactRef")().asInstanceOf[RefObject[T]]
  
  @scala.inline
  def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementIsOrContains")(element.asInstanceOf[js.Any], testElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ensureElement(): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")().asInstanceOf[js.UndefOr[ReactElement]]
  @scala.inline
  def ensureElement(
    child: Unit,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  @scala.inline
  def ensureElement(child: ReactNode): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReactElement]]
  @scala.inline
  def ensureElement(
    child: ReactNode,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")().asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  
  @scala.inline
  def getDisplayName(ComponentClass: INamed): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getDisplayName(ComponentClass: ComponentType[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getRef[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[T | Null]
  @scala.inline
  def getRef[T](ref: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  @scala.inline
  def getRef[T](ref: IRefObject[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  @scala.inline
  def isElementOfType[P](element: js.Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], ComponentType.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def isFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isNodeEnv(env: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")(env.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isReactElement[T](child: ReactNode): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactElement")(child.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def isReactNodeEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")().asInstanceOf[Boolean]
  @scala.inline
  def isReactNodeEmpty(node: Unit, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isReactNodeEmpty(node: ReactNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isReactNodeEmpty(node: ReactNode, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def safeInvoke[R](): js.UndefOr[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")().asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, R](func: js.Function1[/* arg1 */ A, R], arg1: A): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, R](func: Unit, arg1: A): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, B, R](func: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, B, R](func: Unit, arg1: A, arg2: B): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, B, C, R](func: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, B, C, R](func: Unit, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, B, C, D, R](
    func: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvoke[A, B, C, D, R](func: Unit, arg1: A, arg2: B, arg3: C, arg4: D): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, R](obj: T, key: K): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, R](obj: Unit, key: K): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, R](obj: T, key: K, arg1: A): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, R](obj: Unit, key: K, arg1: A): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, R](obj: T, key: K, arg1: A, arg2: B): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, R](obj: Unit, key: K, arg1: A, arg2: B): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B, c : C): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, C, R](obj: T, key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  @scala.inline
  def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]:? (a : A, b : B, c : C): R}
    */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember & TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, C, R](obj: Unit, key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeMember")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  
  @scala.inline
  def safeInvokeOrValue[R](): R = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")().asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[R](funcOrValue: R): R = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any]).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any]).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, R](funcOrValue: R, arg1: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, R](funcOrValue: js.Function1[/* arg1 */ A, R], arg1: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, R](funcOrValue: Unit, arg1: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, R](funcOrValue: R, arg1: A, arg2: B): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, R](funcOrValue: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, R](funcOrValue: Unit, arg1: A, arg2: B): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, C, R](funcOrValue: R, arg1: A, arg2: B, arg3: C): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, C, R](funcOrValue: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, C, R](funcOrValue: Unit, arg1: A, arg2: B, arg3: C): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, C, D, R](funcOrValue: R, arg1: A, arg2: B, arg3: C, arg4: D): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, C, D, R](
    funcOrValue: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def safeInvokeOrValue[A, B, C, D, R](funcOrValue: Unit, arg1: A, arg2: B, arg3: C, arg4: D): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @scala.inline
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def throttle[T /* <: js.Function */](method: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(method.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Event, Unit]]
  
  @scala.inline
  def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](callback: js.Function2[/* event */ E, /* repeated */ js.Any, js.Any]): js.Function1[/* event2 */ E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  @scala.inline
  def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](
    callback: js.Function2[/* event */ E, /* repeated */ js.Any, js.Any],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ E, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
}
