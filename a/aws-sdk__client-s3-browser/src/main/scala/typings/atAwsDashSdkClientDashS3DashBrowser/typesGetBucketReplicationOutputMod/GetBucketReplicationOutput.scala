package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketReplicationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationConfigurationMod._UnmarshalledReplicationConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
    */
  var ReplicationConfiguration: js.UndefOr[_UnmarshalledReplicationConfiguration] = js.undefined
}

object GetBucketReplicationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ReplicationConfiguration: _UnmarshalledReplicationConfiguration = null
  ): GetBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ReplicationConfiguration != null) __obj.updateDynamic("ReplicationConfiguration")(ReplicationConfiguration)
    __obj.asInstanceOf[GetBucketReplicationOutput]
  }
}

