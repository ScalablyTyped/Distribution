package typings.baseui.fileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploaderOverrides[T] extends js.Object {
  
  var ButtonComponent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var ContentMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var ContentSeparator: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var ErrorMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var FileDragAndDrop: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var HiddenInput: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var ProgressMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Spinner: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}
object FileUploaderOverrides {
  
  @scala.inline
  def apply[T](): FileUploaderOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploaderOverrides[T]]
  }
  
  @scala.inline
  implicit class FileUploaderOverridesOps[Self <: FileUploaderOverrides[_], T] (val x: Self with FileUploaderOverrides[T]) extends AnyVal {
    
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
    def setButtonComponent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("ButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonComponent: Self = this.set("ButtonComponent", js.undefined)
    
    @scala.inline
    def setContentMessage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("ContentMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMessage: Self = this.set("ContentMessage", js.undefined)
    
    @scala.inline
    def setContentSeparator(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("ContentSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSeparator: Self = this.set("ContentSeparator", js.undefined)
    
    @scala.inline
    def setErrorMessage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setFileDragAndDrop(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("FileDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDragAndDrop: Self = this.set("FileDragAndDrop", js.undefined)
    
    @scala.inline
    def setHiddenInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("HiddenInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenInput: Self = this.set("HiddenInput", js.undefined)
    
    @scala.inline
    def setProgressMessage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("ProgressMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressMessage: Self = this.set("ProgressMessage", js.undefined)
    
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setSpinner(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Spinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinner: Self = this.set("Spinner", js.undefined)
  }
}
