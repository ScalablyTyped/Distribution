package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationItem extends js.Object {
  /**
    * The 12-digit AWS account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * accoun
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
    * Unique MD5 hash that represents the configuration item's state. You can use MD5 hash to compare the states of two or more configuration items that are associated with the same resource.
    */
  var configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.native
  /**
    * The configuration item status. The valid values are:   OK – The resource configuration has been updated   ResourceDiscovered – The resource was newly discovered   ResourceNotRecorded – The resource was discovered but its configuration was not recorded since the recorder excludes the recording of resources of this type   ResourceDeleted – The resource was deleted   ResourceDeletedNotRecorded – The resource was deleted but its configuration was not recorded since the recorder excludes the recording of resources of this type    The CIs do not incur any cost. 
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.native
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.native
  /**
    * A list of CloudTrail event IDs. A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail log. For more information about CloudTrail, see What Is AWS CloudTrail. An empty field indicates that the current configuration was not initiated by any event. As of Version 1.3, the relatedEvents field is empty. You can access the LookupEvents API in the AWS CloudTrail API Reference to retrieve the events for the resource.
    */
  var relatedEvents: js.UndefOr[RelatedEventList] = js.native
  /**
    * A list of related AWS resources.
    */
  var relationships: js.UndefOr[RelationshipList] = js.native
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.native
  /**
    * The ID of the resource (for example, sg-xxxxxx).
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
    * A mapping of key value tags associated with the resource.
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.native
}

object ConfigurationItem {
  @scala.inline
  def apply(): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationItem]
  }
  @scala.inline
  implicit class ConfigurationItemOps[Self <: ConfigurationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setArn(value: ARN): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsRegion: Self = this.set("awsRegion", js.undefined)
    @scala.inline
    def setConfiguration(value: Configuration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setConfigurationItemCaptureTime(value: ConfigurationItemCaptureTime): Self = this.set("configurationItemCaptureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationItemCaptureTime: Self = this.set("configurationItemCaptureTime", js.undefined)
    @scala.inline
    def setConfigurationItemMD5Hash(value: ConfigurationItemMD5Hash): Self = this.set("configurationItemMD5Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationItemMD5Hash: Self = this.set("configurationItemMD5Hash", js.undefined)
    @scala.inline
    def setConfigurationItemStatus(value: ConfigurationItemStatus): Self = this.set("configurationItemStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationItemStatus: Self = this.set("configurationItemStatus", js.undefined)
    @scala.inline
    def setConfigurationStateId(value: ConfigurationStateId): Self = this.set("configurationStateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationStateId: Self = this.set("configurationStateId", js.undefined)
    @scala.inline
    def setRelatedEventsVarargs(value: RelatedEvent*): Self = this.set("relatedEvents", js.Array(value :_*))
    @scala.inline
    def setRelatedEvents(value: RelatedEventList): Self = this.set("relatedEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedEvents: Self = this.set("relatedEvents", js.undefined)
    @scala.inline
    def setRelationshipsVarargs(value: Relationship*): Self = this.set("relationships", js.Array(value :_*))
    @scala.inline
    def setRelationships(value: RelationshipList): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
    @scala.inline
    def setResourceCreationTime(value: ResourceCreationTime): Self = this.set("resourceCreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCreationTime: Self = this.set("resourceCreationTime", js.undefined)
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSupplementaryConfiguration(value: SupplementaryConfiguration): Self = this.set("supplementaryConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplementaryConfiguration: Self = this.set("supplementaryConfiguration", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

