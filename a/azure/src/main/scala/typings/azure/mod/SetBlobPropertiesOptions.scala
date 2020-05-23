package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBlobPropertiesOptions extends LeaseAccessConditionsOptions {
  var cacheControl: js.UndefOr[String] = js.undefined
  var contentDisposition: js.UndefOr[String] = js.undefined
  var contentEncoding: js.UndefOr[String] = js.undefined
  var contentLanguage: js.UndefOr[String] = js.undefined
  var contentMD5: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
}

object SetBlobPropertiesOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentMD5: String = null,
    contentType: String = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): SetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentMD5 != null) __obj.updateDynamic("contentMD5")(contentMD5.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlobPropertiesOptions]
  }
}

