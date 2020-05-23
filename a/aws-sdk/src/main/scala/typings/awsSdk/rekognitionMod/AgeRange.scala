package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgeRange extends js.Object {
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.native
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.native
}

object AgeRange {
  @scala.inline
  def apply(High: js.UndefOr[UInteger] = js.undefined, Low: js.UndefOr[UInteger] = js.undefined): AgeRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(High)) __obj.updateDynamic("High")(High.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Low)) __obj.updateDynamic("Low")(Low.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgeRange]
  }
}

