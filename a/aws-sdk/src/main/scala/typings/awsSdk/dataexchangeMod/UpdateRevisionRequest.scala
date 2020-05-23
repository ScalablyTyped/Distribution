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
  def apply(
    DataSetId: string,
    RevisionId: string,
    Comment: stringMin0Max16384 = null,
    Finalized: js.UndefOr[boolean] = js.undefined
  ): UpdateRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (!js.isUndefined(Finalized)) __obj.updateDynamic("Finalized")(Finalized.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRevisionRequest]
  }
}

