package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutDocumentRequest extends js.Object {
  /**
    * One or more documents to add to the index.  Documents have the following file size limits.   5 MB total size for inline documents   50 MB total size for files from an S3 bucket   5 MB extracted text for any file   For more information about file size and transaction per second quotas, see Quotas.
    */
  var Documents: DocumentList = js.native
  /**
    * The identifier of the index to add the documents to. You need to create the index first using the CreateIndex operation.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The Amazon Resource Name (ARN) of a role that is allowed to run the BatchPutDocument operation. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
}

object BatchPutDocumentRequest {
  @scala.inline
  def apply(Documents: DocumentList, IndexId: IndexId, RoleArn: RoleArn = null): BatchPutDocumentRequest = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutDocumentRequest]
  }
}

