package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDestinationSettings extends js.Object {
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.native
  /**
    * Stream name for RTMP destinations (URLs of type rtmp://)
    */
  var StreamName: js.UndefOr[string] = js.native
  /**
    * A URL specifying a destination
    */
  var Url: js.UndefOr[string] = js.native
  /**
    * username for destination
    */
  var Username: js.UndefOr[string] = js.native
}

object OutputDestinationSettings {
  @scala.inline
  def apply(): OutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDestinationSettings]
  }
  @scala.inline
  implicit class OutputDestinationSettingsOps[Self <: OutputDestinationSettings] (val x: Self) extends AnyVal {
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
    def setPasswordParam(value: string): Self = this.set("PasswordParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordParam: Self = this.set("PasswordParam", js.undefined)
    @scala.inline
    def setStreamName(value: string): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    @scala.inline
    def setUsername(value: string): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

