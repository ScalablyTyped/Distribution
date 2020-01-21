package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateChannelCredentialsRequest extends js.Object {
  /**
    * The ID of the channel to update.
    */
  var Id: string = js.native
}

object RotateChannelCredentialsRequest {
  @scala.inline
  def apply(Id: string): RotateChannelCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RotateChannelCredentialsRequest]
  }
}

