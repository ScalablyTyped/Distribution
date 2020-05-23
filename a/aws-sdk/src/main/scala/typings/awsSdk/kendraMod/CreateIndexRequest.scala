package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexRequest extends js.Object {
  /**
    * A token that you provide to identify the request to create an index. Multiple calls to the CreateIndex operation with the same client token will create only one index.”
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.native
  /**
    * A description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * The Amazon Kendra edition to use for the index. Choose DEVELOPER_EDITION for indexes intended for development, testing, or proof of concept. Use ENTERPRISE_EDITION for your production databases. Once you set the edition for an index, it can't be changed. 
    */
  var Edition: js.UndefOr[IndexEdition] = js.native
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
  /**
    * A list of key-value pairs that identify the index. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateIndexRequest {
  @scala.inline
  def apply(
    Name: IndexName,
    RoleArn: RoleArn,
    ClientToken: ClientTokenName = null,
    Description: Description = null,
    Edition: IndexEdition = null,
    ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration = null,
    Tags: TagList = null
  ): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Edition != null) __obj.updateDynamic("Edition")(Edition.asInstanceOf[js.Any])
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
}

