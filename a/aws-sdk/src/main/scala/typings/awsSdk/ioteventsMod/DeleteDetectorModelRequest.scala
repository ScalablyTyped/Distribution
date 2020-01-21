package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDetectorModelRequest extends js.Object {
  /**
    * The name of the detector model to be deleted.
    */
  var detectorModelName: DetectorModelName = js.native
}

object DeleteDetectorModelRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DeleteDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDetectorModelRequest]
  }
}

