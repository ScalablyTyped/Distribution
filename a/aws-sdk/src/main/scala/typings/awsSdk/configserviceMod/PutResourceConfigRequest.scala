package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourceConfigRequest extends StObject {
  
  /**
    * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS CloudFormation.  The configuration JSON must not exceed 64 KB. 
    */
  var Configuration: typings.awsSdk.configserviceMod.Configuration
  
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typings.awsSdk.configserviceMod.ResourceId
  
  /**
    * Name of the resource.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.configserviceMod.ResourceName] = js.undefined
  
  /**
    * The type of the resource. The custom resource type must be registered with AWS CloudFormation.   You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It is the first part of the ResourceType up to the first ::. 
    */
  var ResourceType: ResourceTypeString
  
  /**
    * Version of the schema registered for the ResourceType in AWS CloudFormation.
    */
  var SchemaVersionId: typings.awsSdk.configserviceMod.SchemaVersionId
  
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.configserviceMod.Tags] = js.undefined
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
  implicit class PutResourceConfigRequestMutableBuilder[Self <: PutResourceConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: Configuration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceTypeString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionId): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
