package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceNetworkConfigurationDetails extends StObject {
  
  /**
    * The VPC subnet and security group configuration.
    */
  var AwsVpcConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails] = js.undefined
}
object AwsEcsServiceNetworkConfigurationDetails {
  
  inline def apply(): AwsEcsServiceNetworkConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceNetworkConfigurationDetails]
  }
  
  extension [Self <: AwsEcsServiceNetworkConfigurationDetails](x: Self) {
    
    inline def setAwsVpcConfiguration(value: AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails): Self = StObject.set(x, "AwsVpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAwsVpcConfigurationUndefined: Self = StObject.set(x, "AwsVpcConfiguration", js.undefined)
  }
}
