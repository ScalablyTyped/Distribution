package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
    */
  var PoolId: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * The Amazon Resource Name (ARN) of a virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeBarcode] = js.native
  /**
    * The size, in bytes, of a virtual tape.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The status of the tape.
    */
  var TapeStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeStatus] = js.native
}

object TapeInfo {
  @scala.inline
  def apply(): TapeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeInfo]
  }
  @scala.inline
  implicit class TapeInfoOps[Self <: TapeInfo] (val x: Self) extends AnyVal {
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    @scala.inline
    def setPoolId(value: PoolId): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolId: Self = this.set("PoolId", js.undefined)
    @scala.inline
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeARN: Self = this.set("TapeARN", js.undefined)
    @scala.inline
    def setTapeBarcode(value: TapeBarcode): Self = this.set("TapeBarcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeBarcode: Self = this.set("TapeBarcode", js.undefined)
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = this.set("TapeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeSizeInBytes: Self = this.set("TapeSizeInBytes", js.undefined)
    @scala.inline
    def setTapeStatus(value: TapeStatus): Self = this.set("TapeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeStatus: Self = this.set("TapeStatus", js.undefined)
  }
  
}

