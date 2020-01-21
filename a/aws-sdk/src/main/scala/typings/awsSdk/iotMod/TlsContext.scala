package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsContext extends js.Object {
  /**
    * The value of the serverName key in a TLS authorization request.
    */
  var serverName: js.UndefOr[ServerName] = js.native
}

object TlsContext {
  @scala.inline
  def apply(serverName: ServerName = null): TlsContext = {
    val __obj = js.Dynamic.literal()
    if (serverName != null) __obj.updateDynamic("serverName")(serverName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsContext]
  }
}

