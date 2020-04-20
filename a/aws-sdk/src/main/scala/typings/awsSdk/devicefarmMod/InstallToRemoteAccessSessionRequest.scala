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
}

