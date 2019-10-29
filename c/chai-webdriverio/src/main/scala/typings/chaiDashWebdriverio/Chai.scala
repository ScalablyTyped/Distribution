package typings.chaiDashWebdriverio

import typings.chaiDashWebdriverio.Chai.Assertion
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion extends js.Object {
    var immediately: Assertion = js.native
    def count(count: Double): Unit = js.native
    def displayed(): Unit = js.native
    def enabled(): Unit = js.native
    def focus(): Unit = js.native
    def text(expected: String): Unit = js.native
    def text(expected: Double): Unit = js.native
    def text(expected: RegExp): Unit = js.native
    def there(): Unit = js.native
    def value(expected: String): Unit = js.native
    def value(expected: Double): Unit = js.native
    def value(expected: RegExp): Unit = js.native
  }
  
}

