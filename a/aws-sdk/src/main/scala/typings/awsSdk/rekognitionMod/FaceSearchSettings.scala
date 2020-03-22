package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceSearchSettings extends js.Object {
  /**
    * The ID of a collection that contains faces that you want to search for.
    */
  var CollectionId: js.UndefOr[typings.awsSdk.rekognitionMod.CollectionId] = js.native
  /**
    * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 80. 0 is the lowest confidence. 100 is the highest confidence.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
}

object FaceSearchSettings {
  @scala.inline
  def apply(CollectionId: CollectionId = null, FaceMatchThreshold: Int | Double = null): FaceSearchSettings = {
    val __obj = js.Dynamic.literal()
    if (CollectionId != null) __obj.updateDynamic("CollectionId")(CollectionId.asInstanceOf[js.Any])
    if (FaceMatchThreshold != null) __obj.updateDynamic("FaceMatchThreshold")(FaceMatchThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceSearchSettings]
  }
}

