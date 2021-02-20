package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReusableDelegationSetLimitRequest extends StObject {
  
  /**
    * The ID of the delegation set that you want to get the limit for.
    */
  var DelegationSetId: ResourceId = js.native
  
  /**
    * Specify MAX_ZONES_BY_REUSABLE_DELEGATION_SET to get the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
}
object GetReusableDelegationSetLimitRequest {
  
  @scala.inline
  def apply(DelegationSetId: ResourceId, Type: ReusableDelegationSetLimitType): GetReusableDelegationSetLimitRequest = {
    val __obj = js.Dynamic.literal(DelegationSetId = DelegationSetId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetLimitRequest]
  }
  
  @scala.inline
  implicit class GetReusableDelegationSetLimitRequestMutableBuilder[Self <: GetReusableDelegationSetLimitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegationSetId(value: ResourceId): Self = StObject.set(x, "DelegationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ReusableDelegationSetLimitType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
