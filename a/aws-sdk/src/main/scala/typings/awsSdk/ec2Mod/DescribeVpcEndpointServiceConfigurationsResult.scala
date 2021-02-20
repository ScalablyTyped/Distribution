package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointServiceConfigurationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about one or more services.
    */
  var ServiceConfigurations: js.UndefOr[ServiceConfigurationSet] = js.native
}
object DescribeVpcEndpointServiceConfigurationsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServiceConfigurationsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointServiceConfigurationsResultMutableBuilder[Self <: DescribeVpcEndpointServiceConfigurationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServiceConfigurations(value: ServiceConfigurationSet): Self = StObject.set(x, "ServiceConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigurationsUndefined: Self = StObject.set(x, "ServiceConfigurations", js.undefined)
    
    @scala.inline
    def setServiceConfigurationsVarargs(value: ServiceConfiguration*): Self = StObject.set(x, "ServiceConfigurations", js.Array(value :_*))
  }
}
