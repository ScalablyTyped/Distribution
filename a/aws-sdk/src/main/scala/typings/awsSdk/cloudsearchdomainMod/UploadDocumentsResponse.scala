package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadDocumentsResponse extends js.Object {
  /**
    * The number of documents that were added to the search domain.
    */
  var adds: js.UndefOr[Adds] = js.native
  /**
    * The number of documents that were deleted from the search domain.
    */
  var deletes: js.UndefOr[Deletes] = js.native
  /**
    * The status of an UploadDocumentsRequest.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Any warnings returned by the document service about the documents being uploaded.
    */
  var warnings: js.UndefOr[DocumentServiceWarnings] = js.native
}

object UploadDocumentsResponse {
  @scala.inline
  def apply(
    adds: js.UndefOr[Adds] = js.undefined,
    deletes: js.UndefOr[Deletes] = js.undefined,
    status: String = null,
    warnings: DocumentServiceWarnings = null
  ): UploadDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adds)) __obj.updateDynamic("adds")(adds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deletes)) __obj.updateDynamic("deletes")(deletes.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDocumentsResponse]
  }
}

