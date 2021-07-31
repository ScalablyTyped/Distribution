package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublishingDestinationsResponse extends StObject {
  
  /**
    * A Destinations object that includes information about each publishing destination returned.
    */
  var Destinations: typings.awsSdk.guarddutyMod.Destinations
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListPublishingDestinationsResponse {
  
  @scala.inline
  def apply(Destinations: Destinations): ListPublishingDestinationsResponse = {
    val __obj = js.Dynamic.literal(Destinations = Destinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublishingDestinationsResponse]
  }
  
  @scala.inline
  implicit class ListPublishingDestinationsResponseMutableBuilder[Self <: ListPublishingDestinationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinations(value: Destinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
