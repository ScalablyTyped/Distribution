package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallToRemoteAccessSessionRequest extends js.Object {
  /**
    * The ARN of the app about which you are requesting information.
    */
  var appArn: AmazonResourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
    */
  var remoteAccessSessionArn: AmazonResourceName = js.native
}

object InstallToRemoteAccessSessionRequest {
  @scala.inline
  def apply(appArn: AmazonResourceName, remoteAccessSessionArn: AmazonResourceName): InstallToRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], remoteAccessSessionArn = remoteAccessSessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallToRemoteAccessSessionRequest]
  }
  @scala.inline
  implicit class InstallToRemoteAccessSessionRequestOps[Self <: InstallToRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppArn(value: AmazonResourceName): Self = this.set("appArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAccessSessionArn(value: AmazonResourceName): Self = this.set("remoteAccessSessionArn", value.asInstanceOf[js.Any])
  }
  
}

