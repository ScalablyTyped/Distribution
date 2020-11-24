package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContainerServiceRequest extends js.Object {
  
  /**
    * A Boolean value to indicate whether the container service is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The power for the container service. The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The power and scale of a container service makes up its configured capacity. To determine the monthly price of your container service, multiply the base price of the power with the scale (the number of nodes) of the service. Use the GetContainerServicePowers action to view the specifications of each power option.
    */
  var power: js.UndefOr[ContainerServicePowerName] = js.native
  
  /**
    * The public domain names to use with the container service, such as example.com and www.example.com. You can specify up to four public domain names for a container service. The domain names that you specify are used when you create a deployment with a container configured as the public endpoint of your container service. If you don't specify public domain names, then you can use the default domain of the container service.  You must create and validate an SSL/TLS certificate before you can use public domain names with your container service. Use the CreateCertificate action to create a certificate for the public domain names you want to use with your container service.  You can specify public domain names using a string to array map as shown in the example later on this page.
    */
  var publicDomainNames: js.UndefOr[ContainerServicePublicDomains] = js.native
  
  /**
    * The scale for the container service. The scale specifies the allocated compute nodes of the container service. The power and scale of a container service makes up its configured capacity. To determine the monthly price of your container service, multiply the base price of the power with the scale (the number of nodes) of the service.
    */
  var scale: js.UndefOr[ContainerServiceScale] = js.native
  
  /**
    * The name of the container service to update.
    */
  var serviceName: ContainerServiceName = js.native
}
object UpdateContainerServiceRequest {
  
  @scala.inline
  def apply(serviceName: ContainerServiceName): UpdateContainerServiceRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerServiceRequest]
  }
  
  @scala.inline
  implicit class UpdateContainerServiceRequestOps[Self <: UpdateContainerServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setPower(value: ContainerServicePowerName): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    
    @scala.inline
    def setPublicDomainNames(value: ContainerServicePublicDomains): Self = this.set("publicDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDomainNames: Self = this.set("publicDomainNames", js.undefined)
    
    @scala.inline
    def setScale(value: ContainerServiceScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
