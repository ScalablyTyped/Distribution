package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tape extends StObject {
  
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  /**
    * The date that the tape enters a custom tape pool.
    */
  var PoolEntryDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
    */
  var PoolId: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolId] = js.undefined
  
  /**
    * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete. Range: 0 (not started) to 100 (complete).
    */
  var Progress: js.UndefOr[DoubleObject] = js.undefined
  
  /**
    * The date that the tape is first archived with tape retention lock enabled.
    */
  var RetentionStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.undefined
  
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeBarcode] = js.undefined
  
  /**
    * The date the virtual tape was created.
    */
  var TapeCreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The size, in bytes, of the virtual tape capacity.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
  
  /**
    * The current state of the virtual tape.
    */
  var TapeStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeStatus] = js.undefined
  
  /**
    * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
    */
  var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
  
  /**
    * The virtual tape library (VTL) device that the virtual tape is associated with.
    */
  var VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined
  
  /**
    * If the tape is archived as write-once-read-many (WORM), this value is true.
    */
  var Worm: js.UndefOr[scala.Boolean] = js.undefined
}
object Tape {
  
  inline def apply(): Tape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tape]
  }
  
  extension [Self <: Tape](x: Self) {
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setPoolEntryDate(value: js.Date): Self = StObject.set(x, "PoolEntryDate", value.asInstanceOf[js.Any])
    
    inline def setPoolEntryDateUndefined: Self = StObject.set(x, "PoolEntryDate", js.undefined)
    
    inline def setPoolId(value: PoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setProgress(value: DoubleObject): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setRetentionStartDate(value: js.Date): Self = StObject.set(x, "RetentionStartDate", value.asInstanceOf[js.Any])
    
    inline def setRetentionStartDateUndefined: Self = StObject.set(x, "RetentionStartDate", js.undefined)
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
    
    inline def setTapeBarcode(value: TapeBarcode): Self = StObject.set(x, "TapeBarcode", value.asInstanceOf[js.Any])
    
    inline def setTapeBarcodeUndefined: Self = StObject.set(x, "TapeBarcode", js.undefined)
    
    inline def setTapeCreatedDate(value: js.Date): Self = StObject.set(x, "TapeCreatedDate", value.asInstanceOf[js.Any])
    
    inline def setTapeCreatedDateUndefined: Self = StObject.set(x, "TapeCreatedDate", js.undefined)
    
    inline def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setTapeSizeInBytesUndefined: Self = StObject.set(x, "TapeSizeInBytes", js.undefined)
    
    inline def setTapeStatus(value: TapeStatus): Self = StObject.set(x, "TapeStatus", value.asInstanceOf[js.Any])
    
    inline def setTapeStatusUndefined: Self = StObject.set(x, "TapeStatus", js.undefined)
    
    inline def setTapeUsedInBytes(value: TapeUsage): Self = StObject.set(x, "TapeUsedInBytes", value.asInstanceOf[js.Any])
    
    inline def setTapeUsedInBytesUndefined: Self = StObject.set(x, "TapeUsedInBytes", js.undefined)
    
    inline def setVTLDevice(value: VTLDeviceARN): Self = StObject.set(x, "VTLDevice", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceUndefined: Self = StObject.set(x, "VTLDevice", js.undefined)
    
    inline def setWorm(value: scala.Boolean): Self = StObject.set(x, "Worm", value.asInstanceOf[js.Any])
    
    inline def setWormUndefined: Self = StObject.set(x, "Worm", js.undefined)
  }
}
