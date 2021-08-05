package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointServiceConfigurationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more services.
    */
  var ServiceConfigurations: js.UndefOr[ServiceConfigurationSet] = js.undefined
}
object DescribeVpcEndpointServiceConfigurationsResult {
  
  inline def apply(): DescribeVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServiceConfigurationsResult]
  }
  
  extension [Self <: DescribeVpcEndpointServiceConfigurationsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceConfigurations(value: ServiceConfigurationSet): Self = StObject.set(x, "ServiceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigurationsUndefined: Self = StObject.set(x, "ServiceConfigurations", js.undefined)
    
    inline def setServiceConfigurationsVarargs(value: ServiceConfiguration*): Self = StObject.set(x, "ServiceConfigurations", js.Array(value :_*))
  }
}
