package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketAccelerateConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Suspended
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAccelerateConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The accelerate configuration of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
}

object GetBucketAccelerateConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Status: Enabled | Suspended | String = null): GetBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
}

