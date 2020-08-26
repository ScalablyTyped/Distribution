package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMessage extends js.Object {
  /**
    * The default body of the message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The default message variables to use in the message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}

object DefaultMessage {
  @scala.inline
  def apply(): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMessage]
  }
  @scala.inline
  implicit class DefaultMessageOps[Self <: DefaultMessage] (val x: Self) extends AnyVal {
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
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
  
}

