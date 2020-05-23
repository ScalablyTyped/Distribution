package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDataIdentifiers extends js.Object {
  /**
    * The names of the custom data identifiers that detected the data, and the number of occurrences of the data that each identifier detected.
    */
  var detections: js.UndefOr[CustomDetections] = js.native
  /**
    * The total number of occurrences of the data that was detected by the custom data identifiers and produced the finding.
    */
  var totalCount: js.UndefOr[long] = js.native
}

object CustomDataIdentifiers {
  @scala.inline
  def apply(detections: CustomDetections = null, totalCount: js.UndefOr[long] = js.undefined): CustomDataIdentifiers = {
    val __obj = js.Dynamic.literal()
    if (detections != null) __obj.updateDynamic("detections")(detections.asInstanceOf[js.Any])
    if (!js.isUndefined(totalCount)) __obj.updateDynamic("totalCount")(totalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataIdentifiers]
  }
}

