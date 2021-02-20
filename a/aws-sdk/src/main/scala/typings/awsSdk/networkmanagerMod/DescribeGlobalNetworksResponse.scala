package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalNetworksResponse extends StObject {
  
  /**
    * Information about the global networks.
    */
  var GlobalNetworks: js.UndefOr[GlobalNetworkList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeGlobalNetworksResponse {
  
  @scala.inline
  def apply(): DescribeGlobalNetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalNetworksResponse]
  }
  
  @scala.inline
  implicit class DescribeGlobalNetworksResponseMutableBuilder[Self <: DescribeGlobalNetworksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworks(value: GlobalNetworkList): Self = StObject.set(x, "GlobalNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworksUndefined: Self = StObject.set(x, "GlobalNetworks", js.undefined)
    
    @scala.inline
    def setGlobalNetworksVarargs(value: GlobalNetwork*): Self = StObject.set(x, "GlobalNetworks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
