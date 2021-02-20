package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOperationsRequest extends StObject {
  
  /**
    * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var SubmittedSince: js.UndefOr[Timestamp] = js.native
}
object ListOperationsRequest {
  
  @scala.inline
  def apply(): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsRequest]
  }
  
  @scala.inline
  implicit class ListOperationsRequestMutableBuilder[Self <: ListOperationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setSubmittedSince(value: Timestamp): Self = StObject.set(x, "SubmittedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedSinceUndefined: Self = StObject.set(x, "SubmittedSince", js.undefined)
  }
}
