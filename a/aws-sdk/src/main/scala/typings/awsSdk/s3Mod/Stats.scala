package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends StObject {
  
  /**
    * The total number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typings.awsSdk.s3Mod.BytesProcessed] = js.native
  
  /**
    * The total number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typings.awsSdk.s3Mod.BytesReturned] = js.native
  
  /**
    * The total number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typings.awsSdk.s3Mod.BytesScanned] = js.native
}
object Stats {
  
  @scala.inline
  def apply(): Stats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
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
