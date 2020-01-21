package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestinationRequest extends js.Object {
  /**
    * A unique name for the location the RTMP stream is being pushed
  to.
    */
  var StreamName: js.UndefOr[string] = js.native
}

object InputDestinationRequest {
  @scala.inline
  def apply(StreamName: string = null): InputDestinationRequest = {
    val __obj = js.Dynamic.literal()
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDestinationRequest]
  }
}

