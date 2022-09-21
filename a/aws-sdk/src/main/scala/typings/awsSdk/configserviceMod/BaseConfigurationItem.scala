package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseConfigurationItem extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The Availability Zone associated with the resource.
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  
  /**
    * The region where the resource resides.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * The description of the resource configuration.
    */
  var configuration: js.UndefOr[Configuration] = js.undefined
  
  /**
    * The time when the configuration recording was initiated.
    */
  var configurationItemCaptureTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration item status. The valid values are:   OK – The resource configuration has been updated   ResourceDiscovered – The resource was newly discovered   ResourceNotRecorded – The resource was discovered but its configuration was not recorded since the recorder excludes the recording of resources of this type   ResourceDeleted – The resource was deleted   ResourceDeletedNotRecorded – The resource was deleted but its configuration was not recorded since the recorder excludes the recording of resources of this type    The CIs do not incur any cost. 
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined
  
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined
  
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The custom name of the resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The type of Amazon Web Services resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * Configuration attributes that Config returns for certain resource types to supplement the information returned for the configuration parameter.
    */
  var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined
  
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object BaseConfigurationItem {
  
  inline def apply(): BaseConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfigurationItem]
  }
  
  extension [Self <: BaseConfigurationItem](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationItemCaptureTime(value: js.Date): Self = StObject.set(x, "configurationItemCaptureTime", value.asInstanceOf[js.Any])
    
    inline def setConfigurationItemCaptureTimeUndefined: Self = StObject.set(x, "configurationItemCaptureTime", js.undefined)
    
    inline def setConfigurationItemStatus(value: ConfigurationItemStatus): Self = StObject.set(x, "configurationItemStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigurationItemStatusUndefined: Self = StObject.set(x, "configurationItemStatus", js.undefined)
    
    inline def setConfigurationStateId(value: ConfigurationStateId): Self = StObject.set(x, "configurationStateId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationStateIdUndefined: Self = StObject.set(x, "configurationStateId", js.undefined)
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setResourceCreationTime(value: js.Date): Self = StObject.set(x, "resourceCreationTime", value.asInstanceOf[js.Any])
    
    inline def setResourceCreationTimeUndefined: Self = StObject.set(x, "resourceCreationTime", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSupplementaryConfiguration(value: SupplementaryConfiguration): Self = StObject.set(x, "supplementaryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSupplementaryConfigurationUndefined: Self = StObject.set(x, "supplementaryConfiguration", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
