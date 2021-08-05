package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalNetworksRequest extends StObject {
  
  /**
    * The IDs of one or more global networks. The maximum is 10.
    */
  var GlobalNetworkIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeGlobalNetworksRequest {
  
  inline def apply(): DescribeGlobalNetworksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalNetworksRequest]
  }
  
  extension [Self <: DescribeGlobalNetworksRequest](x: Self) {
    
    inline def setGlobalNetworkIds(value: StringList): Self = StObject.set(x, "GlobalNetworkIds", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdsUndefined: Self = StObject.set(x, "GlobalNetworkIds", js.undefined)
    
    inline def setGlobalNetworkIdsVarargs(value: String*): Self = StObject.set(x, "GlobalNetworkIds", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
