package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBlobOptions extends SetBlobPropertiesOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
  var parallelOperationThreadCount: js.UndefOr[Double] = js.undefined
  var speedSummary: js.UndefOr[SpeedSummary] = js.undefined
  var storeBlobContentMD5: js.UndefOr[Boolean] = js.undefined
  var useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
}

object UploadBlobOptions {
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
    metadata: StorageMetadata = null,
    parallelOperationThreadCount: Int | Double = null,
    speedSummary: SpeedSummary = null,
    storeBlobContentMD5: js.UndefOr[Boolean] = js.undefined,
    timeoutIntervalInMs: Int | Double = null,
    useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
  ): UploadBlobOptions = {
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
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (parallelOperationThreadCount != null) __obj.updateDynamic("parallelOperationThreadCount")(parallelOperationThreadCount.asInstanceOf[js.Any])
    if (speedSummary != null) __obj.updateDynamic("speedSummary")(speedSummary)
    if (!js.isUndefined(storeBlobContentMD5)) __obj.updateDynamic("storeBlobContentMD5")(storeBlobContentMD5)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5)
    __obj.asInstanceOf[UploadBlobOptions]
  }
}

