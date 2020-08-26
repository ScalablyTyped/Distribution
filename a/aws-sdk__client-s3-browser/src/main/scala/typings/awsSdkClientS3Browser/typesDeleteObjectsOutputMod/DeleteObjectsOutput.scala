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

@js.native
trait DeleteObjectsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _DeletedObjects shape
    */
  var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.native
  /**
    * _Errors shape
    */
  var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
}

object DeleteObjectsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
  @scala.inline
  implicit class DeleteObjectsOutputOps[Self <: DeleteObjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeletedVarargs(value: UnmarshalledDeletedObject*): Self = this.set("Deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[UnmarshalledDeletedObject]): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("Deleted", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: UnmarshalledError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[UnmarshalledError]): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setRequestCharged(value: requester_ | String): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
  }
  
}

