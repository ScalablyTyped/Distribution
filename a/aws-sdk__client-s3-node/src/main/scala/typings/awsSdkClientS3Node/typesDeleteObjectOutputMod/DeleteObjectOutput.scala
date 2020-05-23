package typings.awsSdkClientS3Node.typesDeleteObjectOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.</p>
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>Returns the version ID of the delete marker created as a result of the DELETE operation.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object DeleteObjectOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    DeleteMarker: js.UndefOr[Boolean] = js.undefined,
    RequestCharged: requester_ | String = null,
    VersionId: String = null
  ): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker.get.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectOutput]
  }
}

