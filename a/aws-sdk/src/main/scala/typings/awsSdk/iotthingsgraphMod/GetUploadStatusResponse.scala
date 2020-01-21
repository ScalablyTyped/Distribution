package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadStatusResponse extends js.Object {
  /**
    * The date at which the upload was created.
    */
  var createdDate: Timestamp = js.native
  /**
    * The reason for an upload failure.
    */
  var failureReason: js.UndefOr[StringList] = js.native
  /**
    * The ARN of the upload.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the upload's namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The ID of the upload.
    */
  var uploadId: UploadId = js.native
  /**
    * The status of the upload. The initial status is IN_PROGRESS. The response show all validation failures if the upload fails.
    */
  var uploadStatus: UploadStatus = js.native
}

object GetUploadStatusResponse {
  @scala.inline
  def apply(
    createdDate: Timestamp,
    uploadId: UploadId,
    uploadStatus: UploadStatus,
    failureReason: StringList = null,
    namespaceArn: Arn = null,
    namespaceName: NamespaceName = null,
    namespaceVersion: Int | Double = null
  ): GetUploadStatusResponse = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn.asInstanceOf[js.Any])
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName.asInstanceOf[js.Any])
    if (namespaceVersion != null) __obj.updateDynamic("namespaceVersion")(namespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusResponse]
  }
}

