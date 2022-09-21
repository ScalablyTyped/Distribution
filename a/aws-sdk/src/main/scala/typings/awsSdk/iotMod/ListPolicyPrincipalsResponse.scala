package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyPrincipalsResponse extends StObject {
  
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The descriptions of the principals.
    */
  var principals: js.UndefOr[Principals] = js.undefined
}
object ListPolicyPrincipalsResponse {
  
  inline def apply(): ListPolicyPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyPrincipalsResponse]
  }
  
  extension [Self <: ListPolicyPrincipalsResponse](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    inline def setPrincipals(value: Principals): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: PrincipalArn*): Self = StObject.set(x, "principals", js.Array(value*))
  }
}
