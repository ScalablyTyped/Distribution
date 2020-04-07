package typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
}

