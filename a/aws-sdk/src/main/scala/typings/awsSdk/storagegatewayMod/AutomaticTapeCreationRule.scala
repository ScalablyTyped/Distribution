package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticTapeCreationRule extends js.Object {
  
  /**
    * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on the gateway goes below this value, the gateway creates as many new tapes as are needed to have MinimumNumTapes on the gateway. For more information about automatic tape creation, see Creating Tapes Automatically.
    */
  var MinimumNumTapes: typings.awsSdk.storagegatewayMod.MinimumNumTapes = js.native
  
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
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
  
  /**
    * Set to true to indicate that tapes are to be archived as write-once-read-many (WORM). Set to false when WORM is not enabled for tapes.
    */
  var Worm: js.UndefOr[scala.Boolean] = js.native
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
  
  @scala.inline
  implicit class AutomaticTapeCreationRuleOps[Self <: AutomaticTapeCreationRule] (val x: Self) extends AnyVal {
    
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
    def setMinimumNumTapes(value: MinimumNumTapes): Self = this.set("MinimumNumTapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: PoolId): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeBarcodePrefix(value: TapeBarcodePrefix): Self = this.set("TapeBarcodePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = this.set("TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorm(value: scala.Boolean): Self = this.set("Worm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorm: Self = this.set("Worm", js.undefined)
  }
}
