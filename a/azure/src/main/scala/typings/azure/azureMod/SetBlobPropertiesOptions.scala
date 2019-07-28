package typings.azure.azureMod

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
    maximumExecutionTimeInMs: Int | Double = null,
    timeoutIntervalInMs: Int | Double = null
  ): SetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentMD5 != null) __obj.updateDynamic("contentMD5")(contentMD5)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlobPropertiesOptions]
  }
}

