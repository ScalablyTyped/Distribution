package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourceConfigRequest extends js.Object {
  /**
    * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS CloudFormation.  The configuration JSON must not exceed 64 KB. 
    */
  var Configuration: typings.awsSdk.configserviceMod.Configuration = js.native
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typings.awsSdk.configserviceMod.ResourceId = js.native
  /**
    * Name of the resource.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.configserviceMod.ResourceName] = js.native
  /**
    * The type of the resource. The custom resource type must be registered with AWS CloudFormation.   You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It is the first part of the ResourceType up to the first ::. 
    */
  var ResourceType: ResourceTypeString = js.native
  /**
    * Version of the schema registered for the ResourceType in AWS CloudFormation.
    */
  var SchemaVersionId: typings.awsSdk.configserviceMod.SchemaVersionId = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.configserviceMod.Tags] = js.native
}

object PutResourceConfigRequest {
  @scala.inline
  def apply(
    Configuration: Configuration,
    ResourceId: ResourceId,
    ResourceType: ResourceTypeString,
    SchemaVersionId: SchemaVersionId,
    ResourceName: ResourceName = null,
    Tags: Tags = null
  ): PutResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SchemaVersionId = SchemaVersionId.asInstanceOf[js.Any])
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceConfigRequest]
  }
}

