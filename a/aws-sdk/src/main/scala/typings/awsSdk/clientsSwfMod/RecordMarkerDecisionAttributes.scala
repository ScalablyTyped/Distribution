package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordMarkerDecisionAttributes extends StObject {
  
  /**
    *  The details of the marker.
    */
  var details: js.UndefOr[Data] = js.undefined
  
  /**
    *  The name of the marker.
    */
  var markerName: MarkerName
}
object RecordMarkerDecisionAttributes {
  
  inline def apply(markerName: MarkerName): RecordMarkerDecisionAttributes = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMarkerDecisionAttributes]
  }
  
  extension [Self <: RecordMarkerDecisionAttributes](x: Self) {
    
    inline def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setMarkerName(value: MarkerName): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
  }
}
