package typings
package depdLib.depdMod.depdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deprecate extends js.Object {
  def apply(message: java.lang.String): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  def function[T /* <: js.Function */](fn: T): T = js.native
  def function[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  def property[T /* <: js.Object */](obj: T, prop: java.lang.String, message: java.lang.String): scala.Unit = js.native
}

