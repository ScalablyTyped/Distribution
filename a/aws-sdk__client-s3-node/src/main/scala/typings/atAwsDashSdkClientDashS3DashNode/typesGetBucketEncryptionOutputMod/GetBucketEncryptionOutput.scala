package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketEncryptionOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionConfigurationMod._UnmarshalledServerSideEncryptionConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[_UnmarshalledServerSideEncryptionConfiguration] = js.undefined
}

object GetBucketEncryptionOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ServerSideEncryptionConfiguration: _UnmarshalledServerSideEncryptionConfiguration = null
  ): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration)
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
}

