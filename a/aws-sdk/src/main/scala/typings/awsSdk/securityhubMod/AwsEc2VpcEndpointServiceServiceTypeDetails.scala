package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpcEndpointServiceServiceTypeDetails extends StObject {
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpcEndpointServiceServiceTypeDetails {
  
  inline def apply(): AwsEc2VpcEndpointServiceServiceTypeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcEndpointServiceServiceTypeDetails]
  }
  
  extension [Self <: AwsEc2VpcEndpointServiceServiceTypeDetails](x: Self) {
    
    inline def setServiceType(value: NonEmptyString): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
  }
}
