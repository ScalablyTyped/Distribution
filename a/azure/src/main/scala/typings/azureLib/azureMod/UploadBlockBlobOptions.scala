package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBlockBlobOptions extends UploadBlobOptions {
  var blockIdPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object UploadBlockBlobOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    blockIdPrefix: java.lang.String = null,
    cacheControl: java.lang.String = null,
    contentDisposition: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentMD5: java.lang.String = null,
    contentType: java.lang.String = null,
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    metadata: StorageMetadata = null,
    parallelOperationThreadCount: scala.Int | scala.Double = null,
    speedSummary: SpeedSummary = null,
    storeBlobContentMD5: js.UndefOr[scala.Boolean] = js.undefined,
    timeoutIntervalInMs: scala.Int | scala.Double = null,
    useTransactionalMD5: js.UndefOr[scala.Boolean] = js.undefined
  ): UploadBlockBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (blockIdPrefix != null) __obj.updateDynamic("blockIdPrefix")(blockIdPrefix)
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
    __obj.asInstanceOf[UploadBlockBlobOptions]
  }
}

