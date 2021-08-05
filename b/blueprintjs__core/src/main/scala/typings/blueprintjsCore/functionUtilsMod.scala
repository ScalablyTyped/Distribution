package typings.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/functionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def safeInvoke[R](): js.UndefOr[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")().asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, R](func: js.Function1[/* arg1 */ A, R], arg1: A): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, R](func: Unit, arg1: A): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, B, R](func: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, B, R](func: Unit, arg1: A, arg2: B): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, B, C, R](func: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, B, C, R](func: Unit, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, B, C, D, R](
    func: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def safeInvoke[A, B, C, D, R](func: Unit, arg1: A, arg2: B, arg3: C, arg4: D): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvoke")(func.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  
  inline def safeInvokeOrValue[R](): R = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")().asInstanceOf[R]
  inline def safeInvokeOrValue[R](funcOrValue: R): R = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def safeInvokeOrValue[A, R](funcOrValue: R, arg1: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, R](funcOrValue: js.Function1[/* arg1 */ A, R], arg1: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, R](funcOrValue: Unit, arg1: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, R](funcOrValue: R, arg1: A, arg2: B): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, R](funcOrValue: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, R](funcOrValue: Unit, arg1: A, arg2: B): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, C, R](funcOrValue: R, arg1: A, arg2: B, arg3: C): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, C, R](funcOrValue: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, C, R](funcOrValue: Unit, arg1: A, arg2: B, arg3: C): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, C, D, R](funcOrValue: R, arg1: A, arg2: B, arg3: C, arg4: D): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, C, D, R](
    funcOrValue: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def safeInvokeOrValue[A, B, C, D, R](funcOrValue: Unit, arg1: A, arg2: B, arg3: C, arg4: D): R = (^.asInstanceOf[js.Dynamic].applyDynamic("safeInvokeOrValue")(funcOrValue.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[R]
}
