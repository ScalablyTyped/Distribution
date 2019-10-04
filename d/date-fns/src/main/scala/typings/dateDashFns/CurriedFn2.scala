package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFn2[A, B, R] extends js.Object {
  def apply(a: A): CurriedFn1[B, R] = js.native
  def apply(a: A, b: B): R = js.native
}

