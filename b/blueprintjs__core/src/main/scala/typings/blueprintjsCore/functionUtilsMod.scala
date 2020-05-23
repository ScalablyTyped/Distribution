package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/functionUtils", JSImport.Namespace)
@js.native
object functionUtilsMod extends js.Object {
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def safeInvoke[R](): js.UndefOr[R] = js.native
  def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = js.native
  def safeInvoke[A, R](func: js.UndefOr[js.Function1[/* arg1 */ A, R]], arg1: A): js.UndefOr[R] = js.native
  def safeInvoke[A, B, R](func: js.UndefOr[js.Function2[/* arg1 */ A, /* arg2 */ B, R]], arg1: A, arg2: B): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, R](
    func: js.UndefOr[js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R]],
    arg1: A,
    arg2: B,
    arg3: C
  ): js.UndefOr[R] = js.native
  def safeInvoke[A, B, C, D, R](
    func: js.UndefOr[js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R]],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): js.UndefOr[R] = js.native
  def safeInvokeOrValue[R](): R = js.native
  def safeInvokeOrValue[R](funcOrValue: R): R = js.native
  def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = js.native
  def safeInvokeOrValue[A, R](funcOrValue: js.UndefOr[(js.Function1[/* arg1 */ A, R]) | R], arg1: A): R = js.native
  def safeInvokeOrValue[A, B, R](funcOrValue: js.UndefOr[(js.Function2[/* arg1 */ A, /* arg2 */ B, R]) | R], arg1: A, arg2: B): R = js.native
  def safeInvokeOrValue[A, B, C, R](
    funcOrValue: js.UndefOr[(js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R]) | R],
    arg1: A,
    arg2: B,
    arg3: C
  ): R = js.native
  def safeInvokeOrValue[A, B, C, D, R](
    funcOrValue: js.UndefOr[(js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R]) | R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): R = js.native
}

