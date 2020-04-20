package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceToImport extends js.Object {
  /**
    * The logical ID of the target resource as specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * A key-value pair that identifies the target resource. The key is an identifier property (for example, BucketName for AWS::S3::Bucket resources) and the value is the actual property value (for example, MyS3Bucket).
    */
  var ResourceIdentifier: ResourceIdentifierProperties = js.native
  /**
    * The type of resource to import into your stack, such as AWS::S3::Bucket. 
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
}

