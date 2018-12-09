package typings
package deferDashPromiseLib.deferDashPromiseMod.Global.DeferPromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: js.Promise[T] = js.native
  def reject(): scala.Unit = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(`this`: Deferred[scala.Unit]): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def resolve(value: js.Thenable[T]): scala.Unit = js.native
}

