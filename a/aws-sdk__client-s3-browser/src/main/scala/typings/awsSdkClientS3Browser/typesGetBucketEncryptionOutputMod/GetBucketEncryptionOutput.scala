package typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.UnmarshalledServerSideEncryptionConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[UnmarshalledServerSideEncryptionConfiguration] = js.undefined
}

object GetBucketEncryptionOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ServerSideEncryptionConfiguration: UnmarshalledServerSideEncryptionConfiguration = null
  ): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
}

