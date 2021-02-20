package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPolicyPrincipalsResponse extends StObject {
  
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * The descriptions of the principals.
    */
  var principals: js.UndefOr[Principals] = js.native
}
object ListPolicyPrincipalsResponse {
  
  @scala.inline
  def apply(): ListPolicyPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyPrincipalsResponse]
  }
  
  @scala.inline
  implicit class ListPolicyPrincipalsResponseMutableBuilder[Self <: ListPolicyPrincipalsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    @scala.inline
    def setPrincipals(value: Principals): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: PrincipalArn*): Self = StObject.set(x, "principals", js.Array(value :_*))
  }
}
