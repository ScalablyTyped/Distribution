package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentTypeInfo extends js.Object {
  /**
    * The version of the model used to detect segments.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  /**
    * The type of a segment (technical cue or shot detection).
    */
  var Type: js.UndefOr[SegmentType] = js.native
}

object SegmentTypeInfo {
  @scala.inline
  def apply(ModelVersion: String = null, Type: SegmentType = null): SegmentTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentTypeInfo]
  }
}

