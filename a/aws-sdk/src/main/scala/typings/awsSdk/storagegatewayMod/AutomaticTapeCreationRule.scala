package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomaticTapeCreationRule extends js.Object {
  /**
    * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on the gateway goes below this value, the gateway creates as many new tapes as are needed to have MinimumNumTapes on the gateway.
    */
  var MinimumNumTapes: typings.awsSdk.storagegatewayMod.MinimumNumTapes = js.native
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: typings.awsSdk.storagegatewayMod.PoolId = js.native
  /**
    * A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the barcode unique.  The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z. 
    */
  var TapeBarcodePrefix: typings.awsSdk.storagegatewayMod.TapeBarcodePrefix = js.native
  /**
    * The size, in bytes, of the virtual tape capacity.
    */
  var TapeSizeInBytes: TapeSize = js.native
}

object AutomaticTapeCreationRule {
  @scala.inline
  def apply(
    MinimumNumTapes: MinimumNumTapes,
    PoolId: PoolId,
    TapeBarcodePrefix: TapeBarcodePrefix,
    TapeSizeInBytes: TapeSize
  ): AutomaticTapeCreationRule = {
    val __obj = js.Dynamic.literal(MinimumNumTapes = MinimumNumTapes.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any], TapeBarcodePrefix = TapeBarcodePrefix.asInstanceOf[js.Any], TapeSizeInBytes = TapeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticTapeCreationRule]
  }
}

