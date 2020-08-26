package typings.awsSdkClientS3Node.typesDeleteObjectOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.</p>
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
  /**
    * <p>Returns the version ID of the delete marker created as a result of the DELETE operation.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteObjectOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectOutput]
  }
  @scala.inline
  implicit class DeleteObjectOutputOps[Self <: DeleteObjectOutput] (val x: Self) extends AnyVal {
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
    def setDeleteMarker(value: Boolean): Self = this.set("DeleteMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteMarker: Self = this.set("DeleteMarker", js.undefined)
    @scala.inline
    def setRequestCharged(value: requester_ | String): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

