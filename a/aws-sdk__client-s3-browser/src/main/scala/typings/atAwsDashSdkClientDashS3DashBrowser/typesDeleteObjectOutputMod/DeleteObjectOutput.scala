package typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteObjectOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var RequestCharged: js.UndefOr[requester | String] = js.undefined
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
    RequestCharged: requester | String = null,
    VersionId: String = null
  ): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteObjectOutput]
  }
}

