package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachedPoliciesResponse extends StObject {
  
  /**
    * The token to retrieve the next set of results, or ``null`` if there are no more results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The policies.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}
object ListAttachedPoliciesResponse {
  
  inline def apply(): ListAttachedPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachedPoliciesResponse]
  }
  
  extension [Self <: ListAttachedPoliciesResponse](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    inline def setPolicies(value: Policies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
