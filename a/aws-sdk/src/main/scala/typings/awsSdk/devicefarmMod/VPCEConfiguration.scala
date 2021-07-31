package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCEConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The DNS name that maps to the private IP address of the service you want to access.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined
  
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined
  
  /**
    * The friendly name you give to your VPC endpoint configuration to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined
  
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined
}
object VPCEConfiguration {
  
  @scala.inline
  def apply(): VPCEConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCEConfiguration]
  }
  
  @scala.inline
  implicit class VPCEConfigurationMutableBuilder[Self <: VPCEConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setServiceDnsName(value: ServiceDnsName): Self = StObject.set(x, "serviceDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDnsNameUndefined: Self = StObject.set(x, "serviceDnsName", js.undefined)
    
    @scala.inline
    def setVpceConfigurationDescription(value: VPCEConfigurationDescription): Self = StObject.set(x, "vpceConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationDescriptionUndefined: Self = StObject.set(x, "vpceConfigurationDescription", js.undefined)
    
    @scala.inline
    def setVpceConfigurationName(value: VPCEConfigurationName): Self = StObject.set(x, "vpceConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationNameUndefined: Self = StObject.set(x, "vpceConfigurationName", js.undefined)
    
    @scala.inline
    def setVpceServiceName(value: VPCEServiceName): Self = StObject.set(x, "vpceServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceServiceNameUndefined: Self = StObject.set(x, "vpceServiceName", js.undefined)
  }
}
