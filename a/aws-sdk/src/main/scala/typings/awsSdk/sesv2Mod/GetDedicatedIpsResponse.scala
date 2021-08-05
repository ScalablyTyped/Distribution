package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDedicatedIpsResponse extends StObject {
  
  /**
    * A list of dedicated IP addresses that are associated with your AWS account.
    */
  var DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined
  
  /**
    * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
}
object GetDedicatedIpsResponse {
  
  inline def apply(): GetDedicatedIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpsResponse]
  }
  
  extension [Self <: GetDedicatedIpsResponse](x: Self) {
    
    inline def setDedicatedIps(value: DedicatedIpList): Self = StObject.set(x, "DedicatedIps", value.asInstanceOf[js.Any])
    
    inline def setDedicatedIpsUndefined: Self = StObject.set(x, "DedicatedIps", js.undefined)
    
    inline def setDedicatedIpsVarargs(value: DedicatedIp*): Self = StObject.set(x, "DedicatedIps", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
