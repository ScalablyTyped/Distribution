package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewBillingRequest extends StObject {
  
  /**
    * The end date and time for the time period for which you want a list of billing records. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var End: js.UndefOr[Timestamp] = js.native
  
  /**
    * For an initial request for a list of billing records, omit this element. If the number of billing records that are associated with the current AWS account during the specified period is greater than the value that you specified for MaxItems, you can use Marker to return additional billing records. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.  Constraints: The marker must match the value of NextPageMarker that was returned in the previous response.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  
  /**
    * The number of billing records to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    * The beginning date and time for the time period for which you want a list of billing records. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var Start: js.UndefOr[Timestamp] = js.native
}
object ViewBillingRequest {
  
  @scala.inline
  def apply(): ViewBillingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBillingRequest]
  }
  
  @scala.inline
  implicit class ViewBillingRequestMutableBuilder[Self <: ViewBillingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Timestamp): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setStart(value: Timestamp): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
