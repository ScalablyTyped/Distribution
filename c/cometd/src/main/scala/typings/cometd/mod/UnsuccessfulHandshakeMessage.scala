package typings.cometd.mod

import typings.cometd.cometdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulHandshakeMessage
  extends BaseMessage
     with HandshakeMessage {
  @JSName("error")
  var error_UnsuccessfulHandshakeMessage: String = js.native
  var reestablish: js.UndefOr[scala.Nothing] = js.native
  @JSName("successful")
  var successful_UnsuccessfulHandshakeMessage: `false` = js.native
  var supportedConnectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
}

object UnsuccessfulHandshakeMessage {
  @scala.inline
  def apply(channel: String, error: String, successful: `false`): UnsuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsuccessfulHandshakeMessage]
  }
  @scala.inline
  implicit class UnsuccessfulHandshakeMessageOps[Self <: UnsuccessfulHandshakeMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessful(value: `false`): Self = this.set("successful", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedConnectionTypesVarargs(value: ConnectionType*): Self = this.set("supportedConnectionTypes", js.Array(value :_*))
    @scala.inline
    def setSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = this.set("supportedConnectionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedConnectionTypes: Self = this.set("supportedConnectionTypes", js.undefined)
  }
  
}

