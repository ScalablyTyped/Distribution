package typings.chaiDashOequal.ChaiNs

import typings.chai.ChaiNs.Equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For Assert APIs
@js.native
trait Assert extends js.Object {
  def oeq(act: js.Any, exp: js.Any): Equal = js.native
  def oeq(act: js.Any, exp: js.Any, method: String): Equal = js.native
  def oeql(act: js.Any, exp: js.Any): Equal = js.native
  def oeql(act: js.Any, exp: js.Any, method: String): Equal = js.native
  def oequal(act: js.Any, exp: js.Any): Equal = js.native
  def oequal(act: js.Any, exp: js.Any, method: String): Equal = js.native
}

