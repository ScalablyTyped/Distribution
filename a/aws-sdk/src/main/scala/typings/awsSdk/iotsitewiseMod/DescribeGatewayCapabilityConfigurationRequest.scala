package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayCapabilityConfigurationRequest extends StObject {
  
  /**
    * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA capability configuration has the namespace iotsitewise:opcuacollector:version, where version is a number such as 1.
    */
  var capabilityNamespace: CapabilityNamespace
  
  /**
    * The ID of the gateway that defines the capability configuration.
    */
  var gatewayId: ID
}
object DescribeGatewayCapabilityConfigurationRequest {
  
  @scala.inline
  def apply(capabilityNamespace: CapabilityNamespace, gatewayId: ID): DescribeGatewayCapabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayCapabilityConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeGatewayCapabilityConfigurationRequestMutableBuilder[Self <: DescribeGatewayCapabilityConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilityNamespace(value: CapabilityNamespace): Self = StObject.set(x, "capabilityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
