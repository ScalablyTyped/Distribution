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
    * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class that is associated with the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
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
  def apply(): TapeArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeArchive]
  }
  @scala.inline
  implicit class TapeArchiveOps[Self <: TapeArchive] (val x: Self) extends AnyVal {
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
    def setCompletionTime(value: Time): Self = this.set("CompletionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionTime: Self = this.set("CompletionTime", js.undefined)
    @scala.inline
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
    @scala.inline
    def setPoolId(value: PoolId): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolId: Self = this.set("PoolId", js.undefined)
    @scala.inline
    def setRetrievedTo(value: GatewayARN): Self = this.set("RetrievedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrievedTo: Self = this.set("RetrievedTo", js.undefined)
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
    def setTapeStatus(value: TapeArchiveStatus): Self = this.set("TapeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeStatus: Self = this.set("TapeStatus", js.undefined)
    @scala.inline
    def setTapeUsedInBytes(value: TapeUsage): Self = this.set("TapeUsedInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeUsedInBytes: Self = this.set("TapeUsedInBytes", js.undefined)
  }
  
}

