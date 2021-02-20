package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseConfigurationItem extends StObject {
  
  /**
    * The 12-digit AWS account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[ARN] = js.native
  
  /**
    * The Availability Zone associated with the resource.
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.native
  
  /**
    * The region where the resource resides.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.native
  
  /**
    * The description of the resource configuration.
    */
  var configuration: js.UndefOr[Configuration] = js.native
  
  /**
    * The time when the configuration recording was initiated.
    */
  var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.native
  
  /**
    * The configuration item status. The valid values are:   OK – The resource configuration has been updated   ResourceDiscovered – The resource was newly discovered   ResourceNotRecorded – The resource was discovered but its configuration was not recorded since the recorder excludes the recording of resources of this type   ResourceDeleted – The resource was deleted   ResourceDeletedNotRecorded – The resource was deleted but its configuration was not recorded since the recorder excludes the recording of resources of this type    The CIs do not incur any cost. 
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.native
  
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.native
  
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.native
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The custom name of the resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The type of AWS resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
    */
  var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.native
  
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.native
}
object BaseConfigurationItem {
  
  @scala.inline
  def apply(): BaseConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfigurationItem]
  }
  
  @scala.inline
  implicit class BaseConfigurationItemMutableBuilder[Self <: BaseConfigurationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    @scala.inline
    def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemCaptureTime(value: ConfigurationItemCaptureTime): Self = StObject.set(x, "configurationItemCaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemCaptureTimeUndefined: Self = StObject.set(x, "configurationItemCaptureTime", js.undefined)
    
    @scala.inline
    def setConfigurationItemStatus(value: ConfigurationItemStatus): Self = StObject.set(x, "configurationItemStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemStatusUndefined: Self = StObject.set(x, "configurationItemStatus", js.undefined)
    
    @scala.inline
    def setConfigurationStateId(value: ConfigurationStateId): Self = StObject.set(x, "configurationStateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationStateIdUndefined: Self = StObject.set(x, "configurationStateId", js.undefined)
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setResourceCreationTime(value: ResourceCreationTime): Self = StObject.set(x, "resourceCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCreationTimeUndefined: Self = StObject.set(x, "resourceCreationTime", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSupplementaryConfiguration(value: SupplementaryConfiguration): Self = StObject.set(x, "supplementaryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementaryConfigurationUndefined: Self = StObject.set(x, "supplementaryConfiguration", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
