package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparedFace extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Level of confidence that what the bounding box contains is a face.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * An array of facial landmarks.
    */
  var Landmarks: js.UndefOr[typings.awsSdk.rekognitionMod.Landmarks] = js.native
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  var Pose: js.UndefOr[typings.awsSdk.rekognitionMod.Pose] = js.native
  /**
    * Identifies face image brightness and sharpness. 
    */
  var Quality: js.UndefOr[ImageQuality] = js.native
}

object ComparedFace {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: Int | Double = null,
    Landmarks: Landmarks = null,
    Pose: Pose = null,
    Quality: ImageQuality = null
  ): ComparedFace = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Landmarks != null) __obj.updateDynamic("Landmarks")(Landmarks.asInstanceOf[js.Any])
    if (Pose != null) __obj.updateDynamic("Pose")(Pose.asInstanceOf[js.Any])
    if (Quality != null) __obj.updateDynamic("Quality")(Quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparedFace]
  }
}

