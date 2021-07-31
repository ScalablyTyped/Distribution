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
  
  @scala.inline
  def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesProcessed(value: BytesProcessed): Self = StObject.set(x, "BytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesProcessedUndefined: Self = StObject.set(x, "BytesProcessed", js.undefined)
    
    @scala.inline
    def setBytesReturned(value: BytesReturned): Self = StObject.set(x, "BytesReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReturnedUndefined: Self = StObject.set(x, "BytesReturned", js.undefined)
    
    @scala.inline
    def setBytesScanned(value: BytesScanned): Self = StObject.set(x, "BytesScanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesScannedUndefined: Self = StObject.set(x, "BytesScanned", js.undefined)
  }
}
