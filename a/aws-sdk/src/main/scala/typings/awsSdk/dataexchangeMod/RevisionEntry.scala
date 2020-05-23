package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionEntry extends js.Object {
  /**
    * The ARN for the revision.
    */
  var Arn: typings.awsSdk.dataexchangeMod.Arn = js.native
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[stringMin0Max16384] = js.native
  /**
    * The date and time that the revision was created, in ISO 8601 format.
    */
  var CreatedAt: Timestamp = js.native
  /**
    * The unique identifier for the data set associated with this revision.
    */
  var DataSetId: Id = js.native
  /**
    * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products. Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely identified by their ARN.
    */
  var Finalized: js.UndefOr[boolean] = js.native
  /**
    * The unique identifier for the revision.
    */
  var Id: typings.awsSdk.dataexchangeMod.Id = js.native
  /**
    * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is returned when a revision owner is viewing the entitled copy of its owned revision.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The date and time that the revision was last updated, in ISO 8601 format.
    */
  var UpdatedAt: Timestamp = js.native
}

object RevisionEntry {
  @scala.inline
  def apply(
    Arn: Arn,
    CreatedAt: Timestamp,
    DataSetId: Id,
    Id: Id,
    UpdatedAt: Timestamp,
    Comment: stringMin0Max16384 = null,
    Finalized: js.UndefOr[boolean] = js.undefined,
    SourceId: Id = null
  ): RevisionEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (!js.isUndefined(Finalized)) __obj.updateDynamic("Finalized")(Finalized.get.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionEntry]
  }
}

