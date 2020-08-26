package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationResult extends js.Object {
  /**
    * The number of occurrences of the data that produced the finding, and the custom data identifiers that detected the data.
    */
  var customDataIdentifiers: js.UndefOr[CustomDataIdentifiers] = js.native
  /**
    * The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip, for a GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
    */
  var mimeType: js.UndefOr[string] = js.native
  /**
    * The category and number of occurrences of the sensitive data that produced the finding.
    */
  var sensitiveData: js.UndefOr[SensitiveData] = js.native
  /**
    * The total size, in bytes, of the data that the finding applies to.
    */
  var sizeClassified: js.UndefOr[long] = js.native
  /**
    * The status of the finding.
    */
  var status: js.UndefOr[ClassificationResultStatus] = js.native
}

object ClassificationResult {
  @scala.inline
  def apply(): ClassificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationResult]
  }
  @scala.inline
  implicit class ClassificationResultOps[Self <: ClassificationResult] (val x: Self) extends AnyVal {
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
    def setCustomDataIdentifiers(value: CustomDataIdentifiers): Self = this.set("customDataIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDataIdentifiers: Self = this.set("customDataIdentifiers", js.undefined)
    @scala.inline
    def setMimeType(value: string): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setSensitiveDataVarargs(value: SensitiveDataItem*): Self = this.set("sensitiveData", js.Array(value :_*))
    @scala.inline
    def setSensitiveData(value: SensitiveData): Self = this.set("sensitiveData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitiveData: Self = this.set("sensitiveData", js.undefined)
    @scala.inline
    def setSizeClassified(value: long): Self = this.set("sizeClassified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeClassified: Self = this.set("sizeClassified", js.undefined)
    @scala.inline
    def setStatus(value: ClassificationResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

