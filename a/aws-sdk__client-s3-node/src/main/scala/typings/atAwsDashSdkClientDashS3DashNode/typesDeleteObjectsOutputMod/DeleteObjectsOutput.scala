package typings.atAwsDashSdkClientDashS3DashNode.typesDeleteObjectsOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester_
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeletedObjectMod._UnmarshalledDeletedObject
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreErrorMod._UnmarshalledError
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _DeletedObjects shape
    */
  var Deleted: js.UndefOr[js.Array[_UnmarshalledDeletedObject]] = js.undefined
  /**
    * _Errors shape
    */
  var Errors: js.UndefOr[js.Array[_UnmarshalledError]] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
}

object DeleteObjectsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Deleted: js.Array[_UnmarshalledDeletedObject] = null,
    Errors: js.Array[_UnmarshalledError] = null,
    RequestCharged: requester_ | String = null
  ): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Deleted != null) __obj.updateDynamic("Deleted")(Deleted.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
}

