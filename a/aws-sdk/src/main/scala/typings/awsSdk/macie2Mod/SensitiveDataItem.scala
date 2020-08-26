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
  def apply(): SensitiveDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveDataItem]
  }
  @scala.inline
  implicit class SensitiveDataItemOps[Self <: SensitiveDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategory(value: SensitiveDataItemCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDetectionsVarargs(value: DefaultDetection*): Self = this.set("detections", js.Array(value :_*))
    @scala.inline
    def setDetections(value: DefaultDetections): Self = this.set("detections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetections: Self = this.set("detections", js.undefined)
    @scala.inline
    def setTotalCount(value: long): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
  
}

