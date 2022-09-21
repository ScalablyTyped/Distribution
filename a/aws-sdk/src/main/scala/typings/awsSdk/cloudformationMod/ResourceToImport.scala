package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceToImport extends StObject {
  
  /**
    * The logical ID of the target resource as specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId
  
  /**
    * A key-value pair that identifies the target resource. The key is an identifier property (for example, BucketName for AWS::S3::Bucket resources) and the value is the actual property value (for example, MyS3Bucket).
    */
  var ResourceIdentifier: ResourceIdentifierProperties
  
  /**
    * The type of resource to import into your stack, such as AWS::S3::Bucket. For a list of supported resource types, see Resources that support import operations in the CloudFormation User Guide.
    */
  var ResourceType: typings.awsSdk.cloudformationMod.ResourceType
}
object ResourceToImport {
  
  inline def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceIdentifier: ResourceIdentifierProperties,
    ResourceType: ResourceType
  ): ResourceToImport = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceToImport]
  }
  
  extension [Self <: ResourceToImport](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifierProperties): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
