package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessor extends js.Object {
  /**
    * Name of the Amazon Rekognition stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.native
  /**
    * Current status of the Amazon Rekognition stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.native
}

object StreamProcessor {
  @scala.inline
  def apply(Name: StreamProcessorName = null, Status: StreamProcessorStatus = null): StreamProcessor = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessor]
  }
}

