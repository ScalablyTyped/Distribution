package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookMetadata extends js.Object {
  
  var kernelspec: IKernelInfo = js.native
  
  var language_info: js.UndefOr[ILanguageInfo] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object INotebookMetadata {
  
  @scala.inline
  def apply(kernelspec: IKernelInfo): INotebookMetadata = {
    val __obj = js.Dynamic.literal(kernelspec = kernelspec.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
  
  @scala.inline
  implicit class INotebookMetadataOps[Self <: INotebookMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKernelspec(value: IKernelInfo): Self = this.set("kernelspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_info(value: ILanguageInfo): Self = this.set("language_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage_info: Self = this.set("language_info", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
