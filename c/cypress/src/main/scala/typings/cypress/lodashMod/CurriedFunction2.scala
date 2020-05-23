package typings.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFunction2[T1, T2, R] extends js.Object {
  def apply(): CurriedFunction2[T1, T2, R] = js.native
  def apply(t1: T1): CurriedFunction1[T2, R] = js.native
  def apply(t1: T1, t2: T2): R = js.native
  def apply(t1: __, t2: T2): CurriedFunction1[T1, R] = js.native
}

