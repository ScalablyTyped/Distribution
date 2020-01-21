package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the session for which you want to delete remote access.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteRemoteAccessSessionRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRemoteAccessSessionRequest]
  }
}

