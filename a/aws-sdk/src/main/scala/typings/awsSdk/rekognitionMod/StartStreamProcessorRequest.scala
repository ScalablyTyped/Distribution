package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartStreamProcessorRequest extends js.Object {
  /**
    * The name of the stream processor to start processing.
    */
  var Name: StreamProcessorName = js.native
}

object StartStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): StartStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStreamProcessorRequest]
  }
}

