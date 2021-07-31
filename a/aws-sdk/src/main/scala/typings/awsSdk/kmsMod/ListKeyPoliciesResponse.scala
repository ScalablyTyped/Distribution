package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyPoliciesResponse extends StObject {
  
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * A list of key policy names. The only valid value is default.
    */
  var PolicyNames: js.UndefOr[PolicyNameList] = js.undefined
  
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}
object ListKeyPoliciesResponse {
  
  @scala.inline
  def apply(): ListKeyPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListKeyPoliciesResponseMutableBuilder[Self <: ListKeyPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: MarkerType): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setPolicyNames(value: PolicyNameList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyNameType*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setTruncated(value: BooleanType): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
