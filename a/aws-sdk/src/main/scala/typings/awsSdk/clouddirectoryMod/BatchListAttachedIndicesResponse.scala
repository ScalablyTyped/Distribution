package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListAttachedIndicesResponse extends js.Object {
  /**
    * The indices attached to the specified object.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object BatchListAttachedIndicesResponse {
  @scala.inline
  def apply(IndexAttachments: IndexAttachmentList = null, NextToken: NextToken = null): BatchListAttachedIndicesResponse = {
    val __obj = js.Dynamic.literal()
    if (IndexAttachments != null) __obj.updateDynamic("IndexAttachments")(IndexAttachments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListAttachedIndicesResponse]
  }
}

