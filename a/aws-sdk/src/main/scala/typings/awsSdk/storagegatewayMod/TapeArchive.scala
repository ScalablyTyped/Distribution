package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeArchive extends js.Object {
  /**
    * The time that the archiving of the virtual tape was completed. The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var CompletionTime: js.UndefOr[Time] = js.native
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class that is associated with the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to. The virtual tape is retrieved from the virtual tape shelf (VTS).
    */
  var RetrievedTo: js.UndefOr[GatewayARN] = js.native
  /**
    * The Amazon Resource Name (ARN) of an archived virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The barcode that identifies the archived virtual tape.
    */
  var TapeBarcode: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeBarcode] = js.native
  /**
    * The date the virtual tape was created.
    */
  var TapeCreatedDate: js.UndefOr[Time] = js.native
  /**
    * The size, in bytes, of the archived virtual tape.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The current state of the archived virtual tape.
    */
  var TapeStatus: js.UndefOr[TapeArchiveStatus] = js.native
  /**
    * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
    */
  var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.native
}

object TapeArchive {
  @scala.inline
  def apply(
    CompletionTime: Time = null,
    KMSKey: KMSKey = null,
    PoolId: PoolId = null,
    RetrievedTo: GatewayARN = null,
    TapeARN: TapeARN = null,
    TapeBarcode: TapeBarcode = null,
    TapeCreatedDate: Time = null,
    TapeSizeInBytes: Int | Double = null,
    TapeStatus: TapeArchiveStatus = null,
    TapeUsedInBytes: Int | Double = null
  ): TapeArchive = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime.asInstanceOf[js.Any])
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey.asInstanceOf[js.Any])
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId.asInstanceOf[js.Any])
    if (RetrievedTo != null) __obj.updateDynamic("RetrievedTo")(RetrievedTo.asInstanceOf[js.Any])
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    if (TapeBarcode != null) __obj.updateDynamic("TapeBarcode")(TapeBarcode.asInstanceOf[js.Any])
    if (TapeCreatedDate != null) __obj.updateDynamic("TapeCreatedDate")(TapeCreatedDate.asInstanceOf[js.Any])
    if (TapeSizeInBytes != null) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes.asInstanceOf[js.Any])
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus.asInstanceOf[js.Any])
    if (TapeUsedInBytes != null) __obj.updateDynamic("TapeUsedInBytes")(TapeUsedInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapeArchive]
  }
}

