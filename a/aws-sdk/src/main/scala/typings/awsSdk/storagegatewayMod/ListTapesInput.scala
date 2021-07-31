package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTapesInput extends StObject {
  
  /**
    * An optional number limit for the tapes in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * A string that indicates the position at which to begin the returned list of tapes.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
  
  var TapeARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARNs] = js.undefined
}
object ListTapesInput {
  
  @scala.inline
  def apply(): ListTapesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapesInput]
  }
  
  @scala.inline
  implicit class ListTapesInputMutableBuilder[Self <: ListTapesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    @scala.inline
    def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value :_*))
  }
}
