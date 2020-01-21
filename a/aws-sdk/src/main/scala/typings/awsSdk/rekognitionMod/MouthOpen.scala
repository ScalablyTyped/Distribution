package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouthOpen extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Boolean value that indicates whether the mouth on the face is open or not.
    */
  var Value: js.UndefOr[Boolean] = js.native
}

object MouthOpen {
  @scala.inline
  def apply(Confidence: Int | Double = null, Value: js.UndefOr[scala.Boolean] = js.undefined): MouthOpen = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouthOpen]
  }
}

