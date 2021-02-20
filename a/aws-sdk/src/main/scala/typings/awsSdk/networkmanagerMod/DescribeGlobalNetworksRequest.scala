package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalNetworksRequest extends StObject {
  
  /**
    * The IDs of one or more global networks. The maximum is 10.
    */
  var GlobalNetworkIds: js.UndefOr[StringList] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeGlobalNetworksRequest {
  
  @scala.inline
  def apply(): DescribeGlobalNetworksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalNetworksRequest]
  }
  
  @scala.inline
  implicit class DescribeGlobalNetworksRequestMutableBuilder[Self <: DescribeGlobalNetworksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkIds(value: StringList): Self = StObject.set(x, "GlobalNetworkIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkIdsUndefined: Self = StObject.set(x, "GlobalNetworkIds", js.undefined)
    
    @scala.inline
    def setGlobalNetworkIdsVarargs(value: String*): Self = StObject.set(x, "GlobalNetworkIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
