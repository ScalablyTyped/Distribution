package typings.awsSdkClientS3Node.typesGetBucketVersioningOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketVersioningOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
    */
  var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.undefined
  /**
    * <p>The versioning state of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
}

object GetBucketVersioningOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    MFADelete: Enabled | Disabled | String = null,
    Status: Enabled | Suspended | String = null
  ): GetBucketVersioningOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (MFADelete != null) __obj.updateDynamic("MFADelete")(MFADelete.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketVersioningOutput]
  }
}

