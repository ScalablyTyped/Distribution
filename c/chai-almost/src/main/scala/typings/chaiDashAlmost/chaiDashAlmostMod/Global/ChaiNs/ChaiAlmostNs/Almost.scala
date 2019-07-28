package typings.chaiDashAlmost.chaiDashAlmostMod.Global.ChaiNs.ChaiAlmostNs

import typings.chai.ChaiNs.Equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Almost extends DeepAlmost {
  @JSName("eql")
  var eql_Original: Equal = js.native
  @JSName("eqls")
  var eqls_Original: Equal = js.native
  def eql(value: js.Any): typings.chai.ChaiNs.Assertion = js.native
  def eql(value: js.Any, message: String): typings.chai.ChaiNs.Assertion = js.native
  def eqls(value: js.Any): typings.chai.ChaiNs.Assertion = js.native
  def eqls(value: js.Any, message: String): typings.chai.ChaiNs.Assertion = js.native
}

