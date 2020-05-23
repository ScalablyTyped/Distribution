package typings.azure.mod

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
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    metadata: StorageMetadata = null,
    parallelOperationThreadCount: js.UndefOr[Double] = js.undefined,
    speedSummary: SpeedSummary = null,
    storeBlobContentMD5: js.UndefOr[Boolean] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined,
    useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
  ): UploadBlobOptions = {
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
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelOperationThreadCount)) __obj.updateDynamic("parallelOperationThreadCount")(parallelOperationThreadCount.get.asInstanceOf[js.Any])
    if (speedSummary != null) __obj.updateDynamic("speedSummary")(speedSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(storeBlobContentMD5)) __obj.updateDynamic("storeBlobContentMD5")(storeBlobContentMD5.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBlobOptions]
  }
}

