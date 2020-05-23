package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelDetection extends js.Object {
  /**
    * Details about the detected label.
    */
  var Label: js.UndefOr[typings.awsSdk.rekognitionMod.Label] = js.native
  /**
    * Time, in milliseconds from the start of the video, that the label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object LabelDetection {
  @scala.inline
  def apply(Label: Label = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): LabelDetection = {
    val __obj = js.Dynamic.literal()
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDetection]
  }
}

