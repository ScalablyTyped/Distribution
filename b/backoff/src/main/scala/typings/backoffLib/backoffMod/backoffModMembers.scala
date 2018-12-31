package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backoff", JSImport.Namespace)
@js.native
object backoffModMembers extends js.Object {
  val FunctionCall: FunctionCallConstructor = js.native
  def call(wrappedFunction: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): FunctionCallAny = js.native
  def call[E](
    wrappedFunction: js.Function1[/* cb */ js.Function1[/* err */ E, scala.Unit], scala.Unit],
    callback: js.Function1[/* err */ E, scala.Unit]
  ): TypedFunctionCall[
    js.Array[js.UndefOr[scala.Nothing]], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def call[R1, E](
    wrappedFunction: js.Function1[/* cb */ js.Function2[/* err */ E, /* r1 */ R1, scala.Unit], scala.Unit],
    callback: js.Function2[/* error */ E, /* r1 */ R1, scala.Unit]
  ): TypedFunctionCall[
    js.Array[js.UndefOr[scala.Nothing]], 
    E, 
    R1, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def call[T1, E](
    wrappedFunction: js.Function2[/* t1 */ T1, /* cb */ js.Function1[/* err */ E, scala.Unit], scala.Unit],
    t1: T1,
    callback: js.Function1[/* err */ E, scala.Unit]
  ): TypedFunctionCall[
    js.Array[T1], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def call[R1, R2, E](
    wrappedFunction: js.Function1[
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit], 
      scala.Unit
    ],
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit]
  ): TypedFunctionCall[js.Array[js.UndefOr[scala.Nothing]], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  def call[T1, R1, E](
    wrappedFunction: js.Function2[/* t1 */ T1, /* cb */ js.Function2[/* err */ E, /* r1 */ R1, scala.Unit], scala.Unit],
    t1: T1,
    callback: js.Function2[/* error */ E, /* r1 */ R1, scala.Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]] = js.native
  def call[T1, T2, E](
    wrappedFunction: js.Function3[/* t1 */ T1, /* t2 */ T2, /* cb */ js.Function1[/* err */ E, scala.Unit], scala.Unit],
    t1: T1,
    t2: T2,
    callback: js.Function1[/* err */ E, scala.Unit]
  ): TypedFunctionCall[
    js.Tuple2[T1, T2], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def call[R1, R2, R3, E](
    wrappedFunction: js.Function1[
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit], 
      scala.Unit
    ],
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit]
  ): TypedFunctionCall[js.Array[js.UndefOr[scala.Nothing]], E, R1, R2, R3] = js.native
  def call[T1, R1, R2, E](
    wrappedFunction: js.Function2[
      /* t1 */ T1, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  def call[T1, T2, R1, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function2[/* err */ E, /* r1 */ R1, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function2[/* error */ E, /* r1 */ R1, scala.Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]] = js.native
  def call[T1, T2, T3, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function1[/* err */ E, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function1[/* err */ E, scala.Unit]
  ): TypedFunctionCall[
    js.Tuple3[T1, T2, T3], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def call[T1, R1, R2, R3, E](
    wrappedFunction: js.Function2[
      /* t1 */ T1, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, R2, R3] = js.native
  def call[T1, T2, R1, R2, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  def call[T1, T2, T3, R1, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function2[/* err */ E, /* r1 */ R1, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function2[/* error */ E, /* r1 */ R1, scala.Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]] = js.native
  def call[T1, T2, R1, R2, R3, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, R3] = js.native
  def call[T1, T2, T3, R1, R2, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, scala.Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  def call[T1, T2, T3, R1, R2, R3, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit], 
      scala.Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, scala.Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, R3] = js.native
  def exponential(): Backoff = js.native
  def exponential(options: ExponentialOptions): Backoff = js.native
  def fibonacci(): Backoff = js.native
  def fibonacci(options: Options): Backoff = js.native
}

