package typings.azureSb.wrapserviceMod

import typings.azureSb.anon.SignRequest
import typings.azureSb.mod.Azure.ServiceBus.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapService extends js.Object {
  
  var accessKey: js.UndefOr[String] = js.native
  
  var authenticationProvider: SignRequest = js.native
  
  var issuer: js.UndefOr[String] = js.native
  
  var strictSSL: Boolean = js.native
  
  def wrapAccessToken(uri: String, callback: ResponseCallback): Unit = js.native
  def wrapAccessToken(uri: String, options: js.Object, callback: ResponseCallback): Unit = js.native
}
