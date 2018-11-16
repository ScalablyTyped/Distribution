package typings
package chaiDashThingsLib.ChaiNs

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
  def item(`type`: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
  def item(`type`: java.lang.String, message: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
  def thing(): js.Any = js.native
  def thing(`type`: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
  def thing(`type`: java.lang.String, message: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
}

