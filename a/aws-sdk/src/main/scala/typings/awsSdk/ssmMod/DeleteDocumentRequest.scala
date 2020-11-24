package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Name: DocumentName): DeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentRequest]
  }
  
  @scala.inline
  implicit class DeleteDocumentRequestOps[Self <: DeleteDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: DocumentName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
    
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = this.set("VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("VersionName", js.undefined)
  }
}
