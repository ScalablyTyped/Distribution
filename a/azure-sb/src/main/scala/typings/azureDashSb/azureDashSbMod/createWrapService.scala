package typings.azureDashSb.azureDashSbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb", "createWrapService")
@js.native
object createWrapService extends js.Object {
  def apply(acsHost: String): WrapService = js.native
  def apply(acsHost: String, issuer: String): WrapService = js.native
  def apply(acsHost: String, issuer: String, accessKey: String): WrapService = js.native
}

