package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByOriginRequestPolicyIdRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of distribution IDs that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the origin request policy whose associated distribution IDs you want to list.
    */
  var OriginRequestPolicyId: String
}
object ListDistributionsByOriginRequestPolicyIdRequest {
  
  inline def apply(OriginRequestPolicyId: String): ListDistributionsByOriginRequestPolicyIdRequest = {
    val __obj = js.Dynamic.literal(OriginRequestPolicyId = OriginRequestPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByOriginRequestPolicyIdRequest]
  }
  
  extension [Self <: ListDistributionsByOriginRequestPolicyIdRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setOriginRequestPolicyId(value: String): Self = StObject.set(x, "OriginRequestPolicyId", value.asInstanceOf[js.Any])
  }
}
