package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBiGetSet[T, R, V] extends js.Object {
  def apply(): T = js.native
  def apply(t: T): V = js.native
  def apply(t: T, r: R): V = js.native
}

