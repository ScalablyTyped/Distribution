package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordMarkerDecisionAttributes extends StObject {
  
  /**
    *  The details of the marker.
    */
  var details: js.UndefOr[Data] = js.native
  
  /**
    *  The name of the marker.
    */
  var markerName: MarkerName = js.native
}
object RecordMarkerDecisionAttributes {
  
  @scala.inline
  def apply(markerName: MarkerName): RecordMarkerDecisionAttributes = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMarkerDecisionAttributes]
  }
  
  @scala.inline
  implicit class RecordMarkerDecisionAttributesMutableBuilder[Self <: RecordMarkerDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setMarkerName(value: MarkerName): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
  }
}
