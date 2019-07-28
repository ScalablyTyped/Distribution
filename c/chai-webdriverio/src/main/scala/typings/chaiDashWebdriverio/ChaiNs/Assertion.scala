package typings.chaiDashWebdriverio.ChaiNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  var immediately: Assertion = js.native
  def count(count: Double): Unit = js.native
  def focus(): Unit = js.native
  def text(expected: String): Unit = js.native
  def text(expected: Double): Unit = js.native
  def text(expected: RegExp): Unit = js.native
  def there(): Unit = js.native
  def value(expected: String): Unit = js.native
  def value(expected: Double): Unit = js.native
  def value(expected: RegExp): Unit = js.native
  def visible(): Unit = js.native
}

