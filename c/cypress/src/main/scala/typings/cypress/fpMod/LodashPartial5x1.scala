package typings.cypress.fpMod

import typings.cypress.lodashMod.Function0
import typings.cypress.lodashMod.Function1
import typings.cypress.lodashMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial5x1[T1, T2, T3, R] extends js.Object {
  def apply(arg1: js.Array[T1]): Function2[T2, T3, R] = js.native
  def apply(arg1: js.Tuple2[T1, T2]): Function1[T3, R] = js.native
  def apply(arg1: js.Tuple3[T1, T2, T3]): Function0[R] = js.native
}

