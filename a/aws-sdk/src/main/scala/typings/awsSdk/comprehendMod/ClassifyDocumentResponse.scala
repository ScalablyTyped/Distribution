package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifyDocumentResponse extends js.Object {
  
  /**
    * The classes used by the document being analyzed. These are used for multi-class trained models. Individual classes are mutually exclusive and each document is expected to have only a single class assigned to it. For example, an animal can be a dog or a cat, but not both at the same time. 
    */
  var Classes: js.UndefOr[ListOfClasses] = js.native
  
  /**
    * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels represent different categories that are related in some manner and are not multually exclusive. For example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at the same time. 
    */
  var Labels: js.UndefOr[ListOfLabels] = js.native
}
object ClassifyDocumentResponse {
  
  @scala.inline
  def apply(): ClassifyDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyDocumentResponse]
  }
  
  @scala.inline
  implicit class ClassifyDocumentResponseOps[Self <: ClassifyDocumentResponse] (val x: Self) extends AnyVal {
    
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
    def setClassesVarargs(value: DocumentClass*): Self = this.set("Classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: ListOfClasses): Self = this.set("Classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("Classes", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: DocumentLabel*): Self = this.set("Labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: ListOfLabels): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
  }
}
