package typings.cypress.typesLodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightCurriedFunction2[T1, T2, R] extends js.Object {
  def apply(): RightCurriedFunction2[T1, T2, R] = js.native
  def apply(t1: T1, t2: T2): R = js.native
  def apply(t1: T1, t2: __): RightCurriedFunction1[T2, R] = js.native
  def apply(t2: T2): RightCurriedFunction1[T1, R] = js.native
}

