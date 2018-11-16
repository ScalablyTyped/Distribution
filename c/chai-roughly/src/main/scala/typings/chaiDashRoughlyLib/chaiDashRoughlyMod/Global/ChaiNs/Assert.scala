package typings
package chaiDashRoughlyLib.chaiDashRoughlyMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For Assert APIs
@js.native
trait Assert extends js.Object {
  @JSName("roughly")
  var roughly_Original: Roughly = js.native
  def roughly(): Assertion = js.native
  def roughly(tolerance: scala.Double): Assertion = js.native
  def roughly(`type`: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
  def roughly(`type`: java.lang.String, message: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
}

