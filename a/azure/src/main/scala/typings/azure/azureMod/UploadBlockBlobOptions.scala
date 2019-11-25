package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBlockBlobOptions extends UploadBlobOptions {
  var blockIdPrefix: js.UndefOr[String] = js.undefined
}

object UploadBlockBlobOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    blockIdPrefix: String = null,
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
  ): UploadBlockBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (blockIdPrefix != null) __obj.updateDynamic("blockIdPrefix")(blockIdPrefix.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentMD5 != null) __obj.updateDynamic("contentMD5")(contentMD5.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parallelOperationThreadCount != null) __obj.updateDynamic("parallelOperationThreadCount")(parallelOperationThreadCount.asInstanceOf[js.Any])
    if (speedSummary != null) __obj.updateDynamic("speedSummary")(speedSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(storeBlobContentMD5)) __obj.updateDynamic("storeBlobContentMD5")(storeBlobContentMD5.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBlockBlobOptions]
  }
}

