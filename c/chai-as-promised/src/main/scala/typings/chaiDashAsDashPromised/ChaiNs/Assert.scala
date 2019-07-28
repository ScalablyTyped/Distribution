package typings.chaiDashAsDashPromised.ChaiNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For Assert API
@js.native
trait Assert extends js.Object {
  var eventually: PromisedAssert = js.native
  def becomes(promise: js.Thenable[_], expected: js.Any): js.Thenable[Unit] = js.native
  def becomes(promise: js.Thenable[_], expected: js.Any, message: String): js.Thenable[Unit] = js.native
  def doesNotBecome(promise: js.Thenable[_], expected: js.Any): js.Thenable[Unit] = js.native
  def doesNotBecome(promise: js.Thenable[_], expected: js.Any, message: String): js.Thenable[Unit] = js.native
  def isFulfilled(promise: js.Thenable[_]): js.Thenable[Unit] = js.native
  def isFulfilled(promise: js.Thenable[_], message: String): js.Thenable[Unit] = js.native
  def isRejected(promise: js.Thenable[_]): js.Thenable[Unit] = js.native
  def isRejected(promise: js.Thenable[_], expected: js.Any): js.Thenable[Unit] = js.native
  def isRejected(promise: js.Thenable[_], expected: js.Any, message: String): js.Thenable[Unit] = js.native
  def isRejected(promise: js.Thenable[_], `match`: RegExp): js.Thenable[Unit] = js.native
  def isRejected(promise: js.Thenable[_], `match`: RegExp, message: String): js.Thenable[Unit] = js.native
  def isRejected(promise: js.Thenable[_], message: String): js.Thenable[Unit] = js.native
  def notify(fn: js.Function): js.Thenable[Unit] = js.native
}

