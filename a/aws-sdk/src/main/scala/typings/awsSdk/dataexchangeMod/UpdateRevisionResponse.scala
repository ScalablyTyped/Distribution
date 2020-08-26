package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRevisionResponse extends js.Object {
  /**
    * The ARN for the revision.
    */
  var Arn: js.UndefOr[typings.awsSdk.dataexchangeMod.Arn] = js.native
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[stringMin0Max16384] = js.native
  /**
    * The date and time that the revision was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier for the data set associated with this revision.
    */
  var DataSetId: js.UndefOr[Id] = js.native
  /**
    * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision tells AWS Data Exchange that changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products. Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely identified by their ARN.
    */
  var Finalized: js.UndefOr[boolean] = js.native
  /**
    * The unique identifier for the revision.
    */
  var Id: js.UndefOr[typings.awsSdk.dataexchangeMod.Id] = js.native
  /**
    * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is returned when a revision owner is viewing the entitled copy of its owned revision.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The date and time that the revision was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object UpdateRevisionResponse {
  @scala.inline
  def apply(): UpdateRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRevisionResponse]
  }
  @scala.inline
  implicit class UpdateRevisionResponseOps[Self <: UpdateRevisionResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setComment(value: stringMin0Max16384): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDataSetId(value: Id): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSetId: Self = this.set("DataSetId", js.undefined)
    @scala.inline
    def setFinalized(value: boolean): Self = this.set("Finalized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalized: Self = this.set("Finalized", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setSourceId(value: Id): Self = this.set("SourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceId: Self = this.set("SourceId", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

