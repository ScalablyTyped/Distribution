package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tape extends js.Object {
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete. Range: 0 (not started) to 100 (complete).
    */
  var Progress: js.UndefOr[DoubleObject] = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeBarcode] = js.native
  /**
    * The date the virtual tape was created.
    */
  var TapeCreatedDate: js.UndefOr[Time] = js.native
  /**
    * The size, in bytes, of the virtual tape capacity.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The current state of the virtual tape.
    */
  var TapeStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeStatus] = js.native
  /**
    * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
    */
  var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.native
  /**
    * The virtual tape library (VTL) device that the virtual tape is associated with.
    */
  var VTLDevice: js.UndefOr[VTLDeviceARN] = js.native
}

object Tape {
  @scala.inline
  def apply(
    KMSKey: KMSKey = null,
    PoolId: PoolId = null,
    Progress: Int | Double = null,
    TapeARN: TapeARN = null,
    TapeBarcode: TapeBarcode = null,
    TapeCreatedDate: Time = null,
    TapeSizeInBytes: Int | Double = null,
    TapeStatus: TapeStatus = null,
    TapeUsedInBytes: Int | Double = null,
    VTLDevice: VTLDeviceARN = null
  ): Tape = {
    val __obj = js.Dynamic.literal()
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey.asInstanceOf[js.Any])
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    if (TapeBarcode != null) __obj.updateDynamic("TapeBarcode")(TapeBarcode.asInstanceOf[js.Any])
    if (TapeCreatedDate != null) __obj.updateDynamic("TapeCreatedDate")(TapeCreatedDate.asInstanceOf[js.Any])
    if (TapeSizeInBytes != null) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes.asInstanceOf[js.Any])
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus.asInstanceOf[js.Any])
    if (TapeUsedInBytes != null) __obj.updateDynamic("TapeUsedInBytes")(TapeUsedInBytes.asInstanceOf[js.Any])
    if (VTLDevice != null) __obj.updateDynamic("VTLDevice")(VTLDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tape]
  }
}

