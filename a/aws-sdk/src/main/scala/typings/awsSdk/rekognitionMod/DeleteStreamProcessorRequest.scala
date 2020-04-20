package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStreamProcessorRequest extends js.Object {
  /**
    * The name of the stream processor you want to delete.
    */
  var Name: StreamProcessorName = js.native
}

object DeleteStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): DeleteStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamProcessorRequest]
  }
}

