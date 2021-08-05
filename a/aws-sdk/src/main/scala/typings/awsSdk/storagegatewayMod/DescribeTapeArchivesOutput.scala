package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTapeArchivesOutput extends StObject {
  
  /**
    * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
  
  /**
    * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description, and tape barcode.
    */
  var TapeArchives: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeArchives] = js.undefined
}
object DescribeTapeArchivesOutput {
  
  inline def apply(): DescribeTapeArchivesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeArchivesOutput]
  }
  
  extension [Self <: DescribeTapeArchivesOutput](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTapeArchives(value: TapeArchives): Self = StObject.set(x, "TapeArchives", value.asInstanceOf[js.Any])
    
    inline def setTapeArchivesUndefined: Self = StObject.set(x, "TapeArchives", js.undefined)
    
    inline def setTapeArchivesVarargs(value: TapeArchive*): Self = StObject.set(x, "TapeArchives", js.Array(value :_*))
  }
}
