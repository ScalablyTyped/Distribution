package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session to stop.
    */
  var arn: AmazonResourceName = js.native
}

object StopRemoteAccessSessionRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): StopRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopRemoteAccessSessionRequest]
  }
}

