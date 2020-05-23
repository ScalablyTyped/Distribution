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
  def apply(
    customDataIdentifiers: CustomDataIdentifiers = null,
    mimeType: string = null,
    sensitiveData: SensitiveData = null,
    sizeClassified: js.UndefOr[long] = js.undefined,
    status: ClassificationResultStatus = null
  ): ClassificationResult = {
    val __obj = js.Dynamic.literal()
    if (customDataIdentifiers != null) __obj.updateDynamic("customDataIdentifiers")(customDataIdentifiers.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (sensitiveData != null) __obj.updateDynamic("sensitiveData")(sensitiveData.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeClassified)) __obj.updateDynamic("sizeClassified")(sizeClassified.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationResult]
  }
}

