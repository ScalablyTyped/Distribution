package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachedPoliciesRequest extends StObject {
  
  /**
    * The token to retrieve the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The maximum number of results to be returned per request.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * When true, recursively list attached policies.
    */
  var recursive: js.UndefOr[Recursive] = js.undefined
  
  /**
    * The group or principal for which the policies will be listed. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var target: PolicyTarget
}
object ListAttachedPoliciesRequest {
  
  inline def apply(target: PolicyTarget): ListAttachedPoliciesRequest = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedPoliciesRequest]
  }
  
  extension [Self <: ListAttachedPoliciesRequest](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setRecursive(value: Recursive): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setTarget(value: PolicyTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
