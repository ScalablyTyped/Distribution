package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensitiveDataItem extends js.Object {
  /**
    * The category of sensitive data that was detected. For example: FINANCIAL_INFORMATION, for financial information such as credit card numbers; PERSONAL_INFORMATION, for personally identifiable information such as full names and mailing addresses; or, CUSTOM_IDENTIFIER, for data that was detected by a custom data identifier.
    */
  var category: js.UndefOr[SensitiveDataItemCategory] = js.native
  /**
    * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of occurrences of a specific type of sensitive data that was detected.
    */
  var detections: js.UndefOr[DefaultDetections] = js.native
  /**
    * The total number of occurrences of the sensitive data that was detected.
    */
  var totalCount: js.UndefOr[long] = js.native
}

object SensitiveDataItem {
  @scala.inline
  def apply(
    category: SensitiveDataItemCategory = null,
    detections: DefaultDetections = null,
    totalCount: js.UndefOr[long] = js.undefined
  ): SensitiveDataItem = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (detections != null) __obj.updateDynamic("detections")(detections.asInstanceOf[js.Any])
    if (!js.isUndefined(totalCount)) __obj.updateDynamic("totalCount")(totalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensitiveDataItem]
  }
}

