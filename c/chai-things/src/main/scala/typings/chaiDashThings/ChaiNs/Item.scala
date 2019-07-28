package typings.chaiDashThings.ChaiNs

import typings.chai.ChaiNs.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  @JSName("item")
  var item_Original: Something = js.native
  @JSName("thing")
  var thing_Original: Something = js.native
  def item(): js.Any = js.native
  def item(`type`: String): Assertion = js.native
  def item(`type`: String, message: String): Assertion = js.native
  def thing(): js.Any = js.native
  def thing(`type`: String): Assertion = js.native
  def thing(`type`: String, message: String): Assertion = js.native
}

