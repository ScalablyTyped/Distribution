package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For Assert API
@js.native
trait Assert extends js.Object {
  var eventually: PromisedAssert = js.native
  def becomes(promise: js.Thenable[_], expected: js.Any): js.Thenable[scala.Unit] = js.native
  def becomes(promise: js.Thenable[_], expected: js.Any, message: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotBecome(promise: js.Thenable[_], expected: js.Any): js.Thenable[scala.Unit] = js.native
  def doesNotBecome(promise: js.Thenable[_], expected: js.Any, message: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isFulfilled(promise: js.Thenable[_]): js.Thenable[scala.Unit] = js.native
  def isFulfilled(promise: js.Thenable[_], message: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isRejected(promise: js.Thenable[_]): js.Thenable[scala.Unit] = js.native
  def isRejected(promise: js.Thenable[_], expected: js.Any): js.Thenable[scala.Unit] = js.native
  def isRejected(promise: js.Thenable[_], expected: js.Any, message: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isRejected(promise: js.Thenable[_], `match`: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def isRejected(promise: js.Thenable[_], `match`: stdLib.RegExp, message: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isRejected(promise: js.Thenable[_], message: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notify(fn: js.Function): js.Thenable[scala.Unit] = js.native
}

