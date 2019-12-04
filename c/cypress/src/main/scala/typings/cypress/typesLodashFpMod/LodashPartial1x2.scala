package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Function0
import typings.cypress.typesLodashMod.Function1
import typings.cypress.typesLodashMod.Function2
import typings.cypress.typesLodashMod.Function3
import typings.cypress.typesLodashMod.Function4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial1x2[T1] extends js.Object {
  def apply[R](func: Function1[T1, R]): Function0[R] = js.native
  def apply[T2, R](func: Function2[T1, T2, R]): Function1[T2, R] = js.native
  def apply[T2, T3, R](func: Function3[T1, T2, T3, R]): Function2[T2, T3, R] = js.native
  def apply[T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): Function3[T2, T3, T4, R] = js.native
}

