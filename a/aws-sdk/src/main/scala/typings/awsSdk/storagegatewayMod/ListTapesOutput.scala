package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTapesOutput extends StObject {
  
  /**
    * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in the response body.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
  
  var TapeInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeInfos] = js.undefined
}
object ListTapesOutput {
  
  inline def apply(): ListTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapesOutput]
  }
  
  extension [Self <: ListTapesOutput](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTapeInfos(value: TapeInfos): Self = StObject.set(x, "TapeInfos", value.asInstanceOf[js.Any])
    
    inline def setTapeInfosUndefined: Self = StObject.set(x, "TapeInfos", js.undefined)
    
    inline def setTapeInfosVarargs(value: TapeInfo*): Self = StObject.set(x, "TapeInfos", js.Array(value*))
  }
}
