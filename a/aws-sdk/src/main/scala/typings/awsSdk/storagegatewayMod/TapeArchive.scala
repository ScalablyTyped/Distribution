package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapeArchive extends StObject {
  
  /**
    * The time that the archiving of the virtual tape was completed. The default timestamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var CompletionTime: js.UndefOr[Time] = js.native
  
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  
  /**
    * The time that the tape entered the custom tape pool. The default timestamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var PoolEntryDate: js.UndefOr[Time] = js.native
  
  /**
    * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class that is associated with the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
    */
  var PoolId: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolId] = js.native
  
  /**
    * If the archived tape is subject to tape retention lock, the date that the archived tape started being retained.
    */
  var RetentionStartDate: js.UndefOr[Time] = js.native
  
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
  
  /**
    * Set to true if the archived tape is stored as write-once-read-many (WORM).
    */
  var Worm: js.UndefOr[scala.Boolean] = js.native
}
object TapeArchive {
  
  @scala.inline
  def apply(): TapeArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeArchive]
  }
  
  @scala.inline
  implicit class TapeArchiveMutableBuilder[Self <: TapeArchive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: Time): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setPoolEntryDate(value: Time): Self = StObject.set(x, "PoolEntryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolEntryDateUndefined: Self = StObject.set(x, "PoolEntryDate", js.undefined)
    
    @scala.inline
    def setPoolId(value: PoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    @scala.inline
    def setRetentionStartDate(value: Time): Self = StObject.set(x, "RetentionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionStartDateUndefined: Self = StObject.set(x, "RetentionStartDate", js.undefined)
    
    @scala.inline
    def setRetrievedTo(value: GatewayARN): Self = StObject.set(x, "RetrievedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievedToUndefined: Self = StObject.set(x, "RetrievedTo", js.undefined)
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
    
    @scala.inline
    def setTapeBarcode(value: TapeBarcode): Self = StObject.set(x, "TapeBarcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeBarcodeUndefined: Self = StObject.set(x, "TapeBarcode", js.undefined)
    
    @scala.inline
    def setTapeCreatedDate(value: Time): Self = StObject.set(x, "TapeCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeCreatedDateUndefined: Self = StObject.set(x, "TapeCreatedDate", js.undefined)
    
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeSizeInBytesUndefined: Self = StObject.set(x, "TapeSizeInBytes", js.undefined)
    
    @scala.inline
    def setTapeStatus(value: TapeArchiveStatus): Self = StObject.set(x, "TapeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeStatusUndefined: Self = StObject.set(x, "TapeStatus", js.undefined)
    
    @scala.inline
    def setTapeUsedInBytes(value: TapeUsage): Self = StObject.set(x, "TapeUsedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeUsedInBytesUndefined: Self = StObject.set(x, "TapeUsedInBytes", js.undefined)
    
    @scala.inline
    def setWorm(value: scala.Boolean): Self = StObject.set(x, "Worm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWormUndefined: Self = StObject.set(x, "Worm", js.undefined)
  }
}
