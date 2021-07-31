package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientVpnTargetNetworksResult extends StObject {
  
  /**
    * Information about the associated target networks.
    */
  var ClientVpnTargetNetworks: js.UndefOr[TargetNetworkSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeClientVpnTargetNetworksResult {
  
  @scala.inline
  def apply(): DescribeClientVpnTargetNetworksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnTargetNetworksResult]
  }
  
  @scala.inline
  implicit class DescribeClientVpnTargetNetworksResultMutableBuilder[Self <: DescribeClientVpnTargetNetworksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnTargetNetworks(value: TargetNetworkSet): Self = StObject.set(x, "ClientVpnTargetNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnTargetNetworksUndefined: Self = StObject.set(x, "ClientVpnTargetNetworks", js.undefined)
    
    @scala.inline
    def setClientVpnTargetNetworksVarargs(value: TargetNetwork*): Self = StObject.set(x, "ClientVpnTargetNetworks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
