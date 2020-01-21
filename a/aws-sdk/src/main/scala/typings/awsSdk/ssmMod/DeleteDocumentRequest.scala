package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDocumentRequest extends js.Object {
  /**
    * The version of the document that you want to delete. If not provided, all versions of the document are deleted.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * Some SSM document types require that you specify a Force flag before you can delete the document. For example, you must specify a Force flag to delete a document of type ApplicationConfigurationSchema. You can restrict access to the Force flag in an AWS Identity and Access Management (IAM) policy.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The name of the document.
    */
  var Name: DocumentName = js.native
  /**
    * The version name of the document that you want to delete. If not provided, all versions of the document are deleted.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object DeleteDocumentRequest {
  @scala.inline
  def apply(
    Name: DocumentName,
    DocumentVersion: DocumentVersion = null,
    Force: js.UndefOr[scala.Boolean] = js.undefined,
    VersionName: DocumentVersionName = null
  ): DeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentRequest]
  }
}

