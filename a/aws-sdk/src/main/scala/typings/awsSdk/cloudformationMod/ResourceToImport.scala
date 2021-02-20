package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceToImport extends StObject {
  
  /**
    * The logical ID of the target resource as specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  
  /**
    * A key-value pair that identifies the target resource. The key is an identifier property (for example, BucketName for AWS::S3::Bucket resources) and the value is the actual property value (for example, MyS3Bucket).
    */
  var ResourceIdentifier: ResourceIdentifierProperties = js.native
  
  /**
    * The type of resource to import into your stack, such as AWS::S3::Bucket. For a list of supported resource types, see Resources that support import operations in the AWS CloudFormation User Guide.
    */
  var ResourceType: typings.awsSdk.cloudformationMod.ResourceType = js.native
}
object ResourceToImport {
  
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceIdentifier: ResourceIdentifierProperties,
    ResourceType: ResourceType
  ): ResourceToImport = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceToImport]
  }
  
  @scala.inline
  implicit class ResourceToImportMutableBuilder[Self <: ResourceToImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifierProperties): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
