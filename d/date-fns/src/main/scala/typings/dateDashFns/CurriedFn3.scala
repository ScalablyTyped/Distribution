package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFn3[A, B, C, R] extends js.Object {
  def apply(a: A): CurriedFn2[B, C, R] = js.native
  def apply(a: A, b: B): CurriedFn1[C, R] = js.native
  def apply(a: A, b: B, c: C): R = js.native
}

