package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    SchemaVersionId: SchemaVersionId
  ): PutResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SchemaVersionId = SchemaVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceConfigRequest]
  }
  
  @scala.inline
  implicit class PutResourceConfigRequestOps[Self <: PutResourceConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: Configuration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceTypeString): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionId): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("ResourceName", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
