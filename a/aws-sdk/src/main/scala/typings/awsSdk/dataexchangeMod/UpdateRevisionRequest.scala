package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRevisionRequest extends js.Object {
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[stringMin0Max16384] = js.native
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products.
    */
  var Finalized: js.UndefOr[boolean] = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}

object UpdateRevisionRequest {
  @scala.inline
  def apply(DataSetId: string, RevisionId: string): UpdateRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRevisionRequest]
  }
  @scala.inline
  implicit class UpdateRevisionRequestOps[Self <: UpdateRevisionRequest] (val x: Self) extends AnyVal {
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
    def setDataSetId(value: string): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: string): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: stringMin0Max16384): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    @scala.inline
    def setFinalized(value: boolean): Self = this.set("Finalized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalized: Self = this.set("Finalized", js.undefined)
  }
  
}

