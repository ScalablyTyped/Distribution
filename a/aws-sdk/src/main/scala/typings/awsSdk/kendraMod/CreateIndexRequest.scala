package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexRequest extends js.Object {
  /**
    * A description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * The name for the new index.
    */
  var Name: IndexName = js.native
  /**
    * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role used when you use the BatchPutDocument operation to index documents from an Amazon S3 bucket.
    */
  var RoleArn: typings.awsSdk.kendraMod.RoleArn = js.native
  /**
    * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServerSideEncryptionConfiguration] = js.native
}

object CreateIndexRequest {
  @scala.inline
  def apply(
    Name: IndexName,
    RoleArn: RoleArn,
    Description: Description = null,
    ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration = null
  ): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
}

