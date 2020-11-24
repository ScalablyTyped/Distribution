package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerService extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the container service.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the container service.
    */
  var containerServiceName: js.UndefOr[ContainerServiceName] = js.native
  
  /**
    * The timestamp when the container service was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * An object that describes the current container deployment of the container service.
    */
  var currentDeployment: js.UndefOr[ContainerServiceDeployment] = js.native
  
  /**
    * A Boolean value indicating whether the container service is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An object that describes the location of the container service, such as the AWS Region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * An object that describes the next deployment of the container service. This value is null when there is no deployment in a pending state.
    */
  var nextDeployment: js.UndefOr[ContainerServiceDeployment] = js.native
  
  /**
    * The power specification of the container service. The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
    */
  var power: js.UndefOr[ContainerServicePowerName] = js.native
  
  /**
    * The ID of the power of the container service.
    */
  var powerId: js.UndefOr[String] = js.native
  
  /**
    * The principal ARN of the container service. The principal ARN can be used to create a trust relationship between your standard AWS account and your Lightsail container service. This allows you to give your service permission to access resources in your standard AWS account.
    */
  var principalArn: js.UndefOr[String] = js.native
  
  /**
    * The private domain name of the container service. The private domain name is accessible only by other resources within the default virtual private cloud (VPC) of your Lightsail account.
    */
  var privateDomainName: js.UndefOr[String] = js.native
  
  /**
    * The public domain name of the container service, such as example.com and www.example.com. You can specify up to four public domain names for a container service. The domain names that you specify are used when you create a deployment with a container configured as the public endpoint of your container service. If you don't specify public domain names, then you can use the default domain of the container service.  You must create and validate an SSL/TLS certificate before you can use public domain names with your container service. Use the CreateCertificate action to create a certificate for the public domain names you want to use with your container service.  See CreateContainerService or UpdateContainerService for information about how to specify public domain names for your Lightsail container service.
    */
  var publicDomainNames: js.UndefOr[ContainerServicePublicDomains] = js.native
  
  /**
    * The Lightsail resource type of the container service (i.e., ContainerService).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The scale specification of the container service. The scale specifies the allocated compute nodes of the container service.
    */
  var scale: js.UndefOr[ContainerServiceScale] = js.native
  
  /**
    * The current state of the container service. The state can be:    Pending - The container service is being created.    Ready - The container service is created but does not have a container deployment.    Disabled - The container service is disabled.    Updating - The container service capacity or other setting is being updated.    Deploying - The container service is launching a container deployment.    Running - The container service is created and it has a container deployment.  
    */
  var state: js.UndefOr[ContainerServiceState] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The publicly accessible URL of the container service. If no public endpoint is specified in the currentDeployment, this URL returns a 404 response.
    */
  var url: js.UndefOr[String] = js.native
}
object ContainerService {
  
  @scala.inline
  def apply(): ContainerService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerService]
  }
  
  @scala.inline
  implicit class ContainerServiceOps[Self <: ContainerService] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setContainerServiceName(value: ContainerServiceName): Self = this.set("containerServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerServiceName: Self = this.set("containerServiceName", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setCurrentDeployment(value: ContainerServiceDeployment): Self = this.set("currentDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDeployment: Self = this.set("currentDeployment", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNextDeployment(value: ContainerServiceDeployment): Self = this.set("nextDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextDeployment: Self = this.set("nextDeployment", js.undefined)
    
    @scala.inline
    def setPower(value: ContainerServicePowerName): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    
    @scala.inline
    def setPowerId(value: String): Self = this.set("powerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerId: Self = this.set("powerId", js.undefined)
    
    @scala.inline
    def setPrincipalArn(value: String): Self = this.set("principalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalArn: Self = this.set("principalArn", js.undefined)
    
    @scala.inline
    def setPrivateDomainName(value: String): Self = this.set("privateDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateDomainName: Self = this.set("privateDomainName", js.undefined)
    
    @scala.inline
    def setPublicDomainNames(value: ContainerServicePublicDomains): Self = this.set("publicDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDomainNames: Self = this.set("publicDomainNames", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setScale(value: ContainerServiceScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setState(value: ContainerServiceState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
