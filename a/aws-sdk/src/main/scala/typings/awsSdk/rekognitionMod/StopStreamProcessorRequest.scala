package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopStreamProcessorRequest extends js.Object {
  /**
    * The name of a stream processor created by CreateStreamProcessor.
    */
  var Name: StreamProcessorName = js.native
}

object StopStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): StopStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamProcessorRequest]
  }
}

