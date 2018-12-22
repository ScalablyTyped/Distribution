package typings
package chaiDashAlmostLib.chaiDashAlmostMod.Global.ChaiNs.ChaiAlmostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Almost extends DeepAlmost {
  @JSName("eql")
  var eql_Original: chaiLib.ChaiNs.Equal = js.native
  @JSName("eqls")
  var eqls_Original: chaiLib.ChaiNs.Equal = js.native
  def eql(value: js.Any): chaiLib.ChaiNs.Assertion = js.native
  def eql(value: js.Any, message: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
  def eqls(value: js.Any): chaiLib.ChaiNs.Assertion = js.native
  def eqls(value: js.Any, message: java.lang.String): chaiLib.ChaiNs.Assertion = js.native
}

