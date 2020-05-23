package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Smile extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Boolean value that indicates whether the face is smiling or not.
    */
  var Value: js.UndefOr[Boolean] = js.native
}

object Smile {
  @scala.inline
  def apply(Confidence: js.UndefOr[Percent] = js.undefined, Value: js.UndefOr[Boolean] = js.undefined): Smile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Smile]
  }
}

