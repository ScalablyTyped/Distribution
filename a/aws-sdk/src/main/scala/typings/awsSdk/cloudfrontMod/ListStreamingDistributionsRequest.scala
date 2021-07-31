package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingDistributionsRequest extends StObject {
  
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListStreamingDistributionsRequest {
  
  @scala.inline
  def apply(): ListStreamingDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingDistributionsRequest]
  }
  
  @scala.inline
  implicit class ListStreamingDistributionsRequestMutableBuilder[Self <: ListStreamingDistributionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
