package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayMulticastDomainsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the transit gateway multicast domains.
    */
  var TransitGatewayMulticastDomains: js.UndefOr[TransitGatewayMulticastDomainList] = js.undefined
}
object DescribeTransitGatewayMulticastDomainsResult {
  
  @scala.inline
  def apply(): DescribeTransitGatewayMulticastDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayMulticastDomainsResult]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayMulticastDomainsResultMutableBuilder[Self <: DescribeTransitGatewayMulticastDomainsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomains(value: TransitGatewayMulticastDomainList): Self = StObject.set(x, "TransitGatewayMulticastDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayMulticastDomainsUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomains", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomainsVarargs(value: TransitGatewayMulticastDomain*): Self = StObject.set(x, "TransitGatewayMulticastDomains", js.Array(value :_*))
  }
}
