package typings.azureDashSb.libWrapserviceMod

import typings.azureDashSb.Anon_Callback
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapService extends js.Object {
  var accessKey: js.UndefOr[String] = js.native
  var authenticationProvider: Anon_Callback = js.native
  var issuer: js.UndefOr[String] = js.native
  var strictSSL: Boolean = js.native
  def wrapAccessToken(uri: String, callback: ResponseCallback): Unit = js.native
  def wrapAccessToken(uri: String, options: js.Object, callback: ResponseCallback): Unit = js.native
}

