package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDedicatedIpsResponse extends StObject {
  
  /**
    * A list of dedicated IP addresses that are reserved for use by your Amazon Pinpoint account.
    */
  var DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined
  
  /**
    * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.undefined
}
object GetDedicatedIpsResponse {
  
  @scala.inline
  def apply(): GetDedicatedIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpsResponse]
  }
  
  @scala.inline
  implicit class GetDedicatedIpsResponseMutableBuilder[Self <: GetDedicatedIpsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedIps(value: DedicatedIpList): Self = StObject.set(x, "DedicatedIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedIpsUndefined: Self = StObject.set(x, "DedicatedIps", js.undefined)
    
    @scala.inline
    def setDedicatedIpsVarargs(value: DedicatedIp*): Self = StObject.set(x, "DedicatedIps", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
