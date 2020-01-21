package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you want to get session information.
    */
  var arn: AmazonResourceName = js.native
}

object GetRemoteAccessSessionRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRemoteAccessSessionRequest]
  }
}

