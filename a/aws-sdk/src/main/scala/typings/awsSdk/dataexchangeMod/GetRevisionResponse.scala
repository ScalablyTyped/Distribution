package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRevisionResponse extends js.Object {
  /**
    * The ARN for the revision
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
    * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products. Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely identified by their ARN.
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
    * The tags for the revision.
    */
  var Tags: js.UndefOr[MapOfString] = js.native
  /**
    * The date and time that the revision was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object GetRevisionResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    Comment: stringMin0Max16384 = null,
    CreatedAt: Timestamp = null,
    DataSetId: Id = null,
    Finalized: js.UndefOr[boolean] = js.undefined,
    Id: Id = null,
    SourceId: Id = null,
    Tags: MapOfString = null,
    UpdatedAt: Timestamp = null
  ): GetRevisionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (!js.isUndefined(Finalized)) __obj.updateDynamic("Finalized")(Finalized.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionResponse]
  }
}

