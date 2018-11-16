package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For Assert API
@js.native
trait Assert extends js.Object {
  var eventually: PromisedAssert = js.native
  def becomes(promise: stdLib.PromiseLike[_], expected: js.Any): stdLib.PromiseLike[scala.Unit] = js.native
  def becomes(promise: stdLib.PromiseLike[_], expected: js.Any, message: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  def doesNotBecome(promise: stdLib.PromiseLike[_], expected: js.Any): stdLib.PromiseLike[scala.Unit] = js.native
  def doesNotBecome(promise: stdLib.PromiseLike[_], expected: js.Any, message: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  def isFulfilled(promise: stdLib.PromiseLike[_]): stdLib.PromiseLike[scala.Unit] = js.native
  def isFulfilled(promise: stdLib.PromiseLike[_], message: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  def isRejected(promise: stdLib.PromiseLike[_]): stdLib.PromiseLike[scala.Unit] = js.native
  def isRejected(promise: stdLib.PromiseLike[_], expected: js.Any): stdLib.PromiseLike[scala.Unit] = js.native
  def isRejected(promise: stdLib.PromiseLike[_], expected: js.Any, message: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  def isRejected(promise: stdLib.PromiseLike[_], `match`: stdLib.RegExp): stdLib.PromiseLike[scala.Unit] = js.native
  def isRejected(promise: stdLib.PromiseLike[_], `match`: stdLib.RegExp, message: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  def isRejected(promise: stdLib.PromiseLike[_], message: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  def notify(fn: js.Function): stdLib.PromiseLike[scala.Unit] = js.native
}

