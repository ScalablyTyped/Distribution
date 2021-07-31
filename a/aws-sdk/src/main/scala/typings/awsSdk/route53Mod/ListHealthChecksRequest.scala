package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHealthChecksRequest extends StObject {
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more health checks. To get another group, submit another ListHealthChecks request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first health check that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more health checks to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * The maximum number of health checks that you want ListHealthChecks to return in response to the current request. Amazon Route 53 returns a maximum of 100 items. If you set MaxItems to a value greater than 100, Route 53 returns only the first 100 health checks. 
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
}
object ListHealthChecksRequest {
  
  @scala.inline
  def apply(): ListHealthChecksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHealthChecksRequest]
  }
  
  @scala.inline
  implicit class ListHealthChecksRequestMutableBuilder[Self <: ListHealthChecksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
