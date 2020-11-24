package typings.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseAuthenticationResult extends js.Object {
  
  def `then`(doneCallBack: js.Function1[/* context */ AuthenticationResult, _]): js.Any = js.native
  def `then`(
    doneCallBack: js.Function1[/* context */ AuthenticationResult, _],
    failCallBack: js.Function1[/* message */ String, _]
  ): js.Any = js.native
}
