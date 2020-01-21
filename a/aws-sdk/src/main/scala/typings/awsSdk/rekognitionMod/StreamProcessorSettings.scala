package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessorSettings extends js.Object {
  /**
    * Face search settings to use on a streaming video. 
    */
  var FaceSearch: js.UndefOr[FaceSearchSettings] = js.native
}

object StreamProcessorSettings {
  @scala.inline
  def apply(FaceSearch: FaceSearchSettings = null): StreamProcessorSettings = {
    val __obj = js.Dynamic.literal()
    if (FaceSearch != null) __obj.updateDynamic("FaceSearch")(FaceSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessorSettings]
  }
}

