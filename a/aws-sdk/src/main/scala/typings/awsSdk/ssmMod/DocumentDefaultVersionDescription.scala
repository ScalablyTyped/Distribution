package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentDefaultVersionDescription extends js.Object {
  
  /**
    * The default version of the document.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.native
  
  /**
    * The default version of the artifact associated with the document.
    */
  var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.native
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[DocumentName] = js.native
}
object DocumentDefaultVersionDescription {
  
  @scala.inline
  def apply(): DocumentDefaultVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDefaultVersionDescription]
  }
  
  @scala.inline
  implicit class DocumentDefaultVersionDescriptionOps[Self <: DocumentDefaultVersionDescription] (val x: Self) extends AnyVal {
    
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
    def setDefaultVersion(value: DocumentVersion): Self = this.set("DefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("DefaultVersion", js.undefined)
    
    @scala.inline
    def setDefaultVersionName(value: DocumentVersionName): Self = this.set("DefaultVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersionName: Self = this.set("DefaultVersionName", js.undefined)
    
    @scala.inline
    def setName(value: DocumentName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
