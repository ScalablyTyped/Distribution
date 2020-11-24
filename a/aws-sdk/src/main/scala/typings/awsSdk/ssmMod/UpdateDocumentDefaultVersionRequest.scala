package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDocumentDefaultVersionRequest extends js.Object {
  
  /**
    * The version of a custom document that you want to set as the default version.
    */
  var DocumentVersion: DocumentVersionNumber = js.native
  
  /**
    * The name of a custom document that you want to set as the default version.
    */
  var Name: DocumentName = js.native
}
object UpdateDocumentDefaultVersionRequest {
  
  @scala.inline
  def apply(DocumentVersion: DocumentVersionNumber, Name: DocumentName): UpdateDocumentDefaultVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateDocumentDefaultVersionRequestOps[Self <: UpdateDocumentDefaultVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setDocumentVersion(value: DocumentVersionNumber): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DocumentName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
