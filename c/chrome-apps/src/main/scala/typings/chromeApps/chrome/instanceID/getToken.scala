package typings.chromeApps.chrome.instanceID

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.instanceID.getToken")
@js.native
object getToken extends js.Object {
  /**
    * Return a token that allows the authorized entity to access the service defined by scope.
    * @param getTokenParams Parameters for getToken.
    * @param callback Function called when the retrieval completes. It should check runtime.lastError for error when token is empty.
    */
  def apply(getTokenParams: TokenParams, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
}

