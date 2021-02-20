package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDedicatedIpsRequest extends StObject {
  
  /**
    * A token returned from a previous call to GetDedicatedIps to indicate the position of the dedicated IP pool in the list of IP pools.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
  
  /**
    * The number of results to show in a single call to GetDedicatedIpsRequest. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  
  /**
    * The name of the IP pool that the dedicated IP address is associated with.
    */
  var PoolName: js.UndefOr[typings.awsSdk.pinpointemailMod.PoolName] = js.native
}
object GetDedicatedIpsRequest {
  
  @scala.inline
  def apply(): GetDedicatedIpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpsRequest]
  }
  
  @scala.inline
  implicit class GetDedicatedIpsRequestMutableBuilder[Self <: GetDedicatedIpsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolNameUndefined: Self = StObject.set(x, "PoolName", js.undefined)
  }
}
