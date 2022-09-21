package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDedicatedIpPoolsResponse extends StObject {
  
  /**
    * A list of all of the dedicated IP pools that are associated with your Amazon Web Services account in the current Region.
    */
  var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.undefined
  
  /**
    * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another request to ListDedicatedIpPools, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
}
object ListDedicatedIpPoolsResponse {
  
  inline def apply(): ListDedicatedIpPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDedicatedIpPoolsResponse]
  }
  
  extension [Self <: ListDedicatedIpPoolsResponse](x: Self) {
    
    inline def setDedicatedIpPools(value: ListOfDedicatedIpPools): Self = StObject.set(x, "DedicatedIpPools", value.asInstanceOf[js.Any])
    
    inline def setDedicatedIpPoolsUndefined: Self = StObject.set(x, "DedicatedIpPools", js.undefined)
    
    inline def setDedicatedIpPoolsVarargs(value: PoolName*): Self = StObject.set(x, "DedicatedIpPools", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
