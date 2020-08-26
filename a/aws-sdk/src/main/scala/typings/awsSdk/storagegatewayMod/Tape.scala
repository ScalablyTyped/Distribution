package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tape extends js.Object {
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
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
  def apply(): Tape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tape]
  }
  @scala.inline
  implicit class TapeOps[Self <: Tape] (val x: Self) extends AnyVal {
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
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
    @scala.inline
    def setPoolId(value: PoolId): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolId: Self = this.set("PoolId", js.undefined)
    @scala.inline
    def setProgress(value: DoubleObject): Self = this.set("Progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    @scala.inline
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeARN: Self = this.set("TapeARN", js.undefined)
    @scala.inline
    def setTapeBarcode(value: TapeBarcode): Self = this.set("TapeBarcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeBarcode: Self = this.set("TapeBarcode", js.undefined)
    @scala.inline
    def setTapeCreatedDate(value: Time): Self = this.set("TapeCreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeCreatedDate: Self = this.set("TapeCreatedDate", js.undefined)
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = this.set("TapeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeSizeInBytes: Self = this.set("TapeSizeInBytes", js.undefined)
    @scala.inline
    def setTapeStatus(value: TapeStatus): Self = this.set("TapeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeStatus: Self = this.set("TapeStatus", js.undefined)
    @scala.inline
    def setTapeUsedInBytes(value: TapeUsage): Self = this.set("TapeUsedInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeUsedInBytes: Self = this.set("TapeUsedInBytes", js.undefined)
    @scala.inline
    def setVTLDevice(value: VTLDeviceARN): Self = this.set("VTLDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVTLDevice: Self = this.set("VTLDevice", js.undefined)
  }
  
}

