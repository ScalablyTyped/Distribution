package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLocation extends js.Object {
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.native
  /**
    * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI) depending on the output type. For example, a RTMP destination should have a uri simliar to: "rtmp://fmsserver/live".
    */
  var Uri: string = js.native
  /**
    * Documentation update needed
    */
  var Username: js.UndefOr[string] = js.native
}

object InputLocation {
  @scala.inline
  def apply(Uri: string): InputLocation = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLocation]
  }
  @scala.inline
  implicit class InputLocationOps[Self <: InputLocation] (val x: Self) extends AnyVal {
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
    def setUri(value: string): Self = this.set("Uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordParam(value: string): Self = this.set("PasswordParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordParam: Self = this.set("PasswordParam", js.undefined)
    @scala.inline
    def setUsername(value: string): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

