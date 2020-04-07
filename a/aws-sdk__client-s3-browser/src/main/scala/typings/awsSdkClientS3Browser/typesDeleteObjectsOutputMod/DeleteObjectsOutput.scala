package typings.awsSdkClientS3Browser.typesDeleteObjectsOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesDeletedObjectMod.UnmarshalledDeletedObject
import typings.awsSdkClientS3Browser.typesErrorMod.UnmarshalledError
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _DeletedObjects shape
    */
  var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.undefined
  /**
    * _Errors shape
    */
  var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
}

object DeleteObjectsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Deleted: js.Array[UnmarshalledDeletedObject] = null,
    Errors: js.Array[UnmarshalledError] = null,
    RequestCharged: requester_ | String = null
  ): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Deleted != null) __obj.updateDynamic("Deleted")(Deleted.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
}

