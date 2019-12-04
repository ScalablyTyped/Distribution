package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Many
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlow extends js.Object {
  def apply(funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply[R1, R2](f1: js.Function0[R1], f2: js.Function1[/* a */ R1, R2]): js.Function0[R2] = js.native
  def apply[R1, R2, R3](f1: js.Function0[R1], f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): js.Function0[R3] = js.native
  def apply[A1, R1, R2](f1: js.Function1[/* a1 */ A1, R1], f2: js.Function1[/* a */ R1, R2]): js.Function1[/* a1 */ A1, R2] = js.native
  def apply[R1, R2, R3, R4](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function0[R4] = js.native
  def apply[A1, R1, R2, R3](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function1[/* a1 */ A1, R3] = js.native
  def apply[A1, A2, R1, R2](f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1], f2: js.Function1[/* a */ R1, R2]): js.Function2[/* a1 */ A1, /* a2 */ A2, R2] = js.native
  def apply[R1, R2, R3, R4, R5](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function0[R5] = js.native
  def apply[A1, R1, R2, R3, R4](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function1[/* a1 */ A1, R4] = js.native
  def apply[A1, A2, R1, R2, R3](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R3] = js.native
  def apply[A1, A2, A3, R1, R2](f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1], f2: js.Function1[/* a */ R1, R2]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2] = js.native
  def apply[R1, R2, R3, R4, R5, R6](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function0[R6] = js.native
  def apply[A1, R1, R2, R3, R4, R5](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function1[/* a1 */ A1, R5] = js.native
  def apply[A1, A2, R1, R2, R3, R4](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R4] = js.native
  def apply[A1, A2, A3, R1, R2, R3](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3] = js.native
  def apply[A1, A2, A3, A4, R1, R2](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2] = js.native
  def apply[A1, A2, A3, A4, R1, R2](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R2] = js.native
  def apply[R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function0[R7] = js.native
  def apply[R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function0[_] = js.native
  def apply[A1, R1, R2, R3, R4, R5, R6](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function1[/* a1 */ A1, R6] = js.native
  def apply[A1, A2, R1, R2, R3, R4, R5](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R5] = js.native
  def apply[A1, A2, A3, R1, R2, R3, R4](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R3] = js.native
  def apply[A1, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function1[/* a1 */ A1, R7] = js.native
  def apply[A1, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function1[/* a1 */ A1, _] = js.native
  def apply[A1, A2, R1, R2, R3, R4, R5, R6](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R6] = js.native
  def apply[A1, A2, A3, R1, R2, R3, R4, R5](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R4] = js.native
  def apply[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R7] = js.native
  def apply[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, _] = js.native
  def apply[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R5] = js.native
  def apply[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7] = js.native
  def apply[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R6] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R7] = js.native
  def apply[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, _] = js.native
}

