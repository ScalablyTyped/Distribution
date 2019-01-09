package typings
package azureDashSbLib.libWrapserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapService extends js.Object {
  var accessKey: js.UndefOr[java.lang.String] = js.native
  var authenticationProvider: azureDashSbLib.Anon_Callback = js.native
  var issuer: js.UndefOr[java.lang.String] = js.native
  var strictSSL: scala.Boolean = js.native
  def wrapAccessToken(
    uri: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def wrapAccessToken(
    uri: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
}

