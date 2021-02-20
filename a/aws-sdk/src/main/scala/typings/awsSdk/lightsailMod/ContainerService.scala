package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerService extends StObject {
  
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
  implicit class ContainerServiceMutableBuilder[Self <: ContainerService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setContainerServiceName(value: ContainerServiceName): Self = StObject.set(x, "containerServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerServiceNameUndefined: Self = StObject.set(x, "containerServiceName", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCurrentDeployment(value: ContainerServiceDeployment): Self = StObject.set(x, "currentDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDeploymentUndefined: Self = StObject.set(x, "currentDeployment", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNextDeployment(value: ContainerServiceDeployment): Self = StObject.set(x, "nextDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDeploymentUndefined: Self = StObject.set(x, "nextDeployment", js.undefined)
    
    @scala.inline
    def setPower(value: ContainerServicePowerName): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerId(value: String): Self = StObject.set(x, "powerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerIdUndefined: Self = StObject.set(x, "powerId", js.undefined)
    
    @scala.inline
    def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    @scala.inline
    def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
    
    @scala.inline
    def setPrivateDomainName(value: String): Self = StObject.set(x, "privateDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDomainNameUndefined: Self = StObject.set(x, "privateDomainName", js.undefined)
    
    @scala.inline
    def setPublicDomainNames(value: ContainerServicePublicDomains): Self = StObject.set(x, "publicDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDomainNamesUndefined: Self = StObject.set(x, "publicDomainNames", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setScale(value: ContainerServiceScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setState(value: ContainerServiceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
