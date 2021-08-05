package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  /**
    * The current number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typings.awsSdk.s3Mod.BytesProcessed] = js.undefined
  
  /**
    * The current number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typings.awsSdk.s3Mod.BytesReturned] = js.undefined
  
  /**
    * The current number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typings.awsSdk.s3Mod.BytesScanned] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setBytesProcessed(value: BytesProcessed): Self = StObject.set(x, "BytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setBytesProcessedUndefined: Self = StObject.set(x, "BytesProcessed", js.undefined)
    
    inline def setBytesReturned(value: BytesReturned): Self = StObject.set(x, "BytesReturned", value.asInstanceOf[js.Any])
    
    inline def setBytesReturnedUndefined: Self = StObject.set(x, "BytesReturned", js.undefined)
    
    inline def setBytesScanned(value: BytesScanned): Self = StObject.set(x, "BytesScanned", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedUndefined: Self = StObject.set(x, "BytesScanned", js.undefined)
  }
}
