package typings.cypress.fpMod

import typings.cypress.lodashMod.Function0
import typings.cypress.lodashMod.Function1
import typings.cypress.lodashMod.Function2
import typings.cypress.lodashMod.Function3
import typings.cypress.lodashMod.Function4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial4x2[T1, T2] extends js.Object {
  def apply[R](func: Function2[T1, T2, R]): Function0[R] = js.native
  def apply[T3, R](func: Function3[T1, T2, T3, R]): Function1[T3, R] = js.native
  def apply[T3, T4, R](func: Function4[T1, T2, T3, T4, R]): Function2[T3, T4, R] = js.native
}

