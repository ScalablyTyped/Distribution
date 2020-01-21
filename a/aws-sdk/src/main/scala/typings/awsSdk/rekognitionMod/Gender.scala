package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gender extends js.Object {
  /**
    * Level of confidence in the prediction.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The predicted gender of the face.
    */
  var Value: js.UndefOr[GenderType] = js.native
}

object Gender {
  @scala.inline
  def apply(Confidence: Int | Double = null, Value: GenderType = null): Gender = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gender]
  }
}

