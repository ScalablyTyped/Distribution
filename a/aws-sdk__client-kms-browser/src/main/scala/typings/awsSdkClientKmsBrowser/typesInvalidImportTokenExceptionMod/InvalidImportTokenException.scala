package typings.awsSdkClientKmsBrowser.typesInvalidImportTokenExceptionMod

import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidImportTokenExceptionDetails> * / any */ @js.native
trait InvalidImportTokenException extends ImportKeyMaterialExceptionsUnion {
  
  var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidImportTokenException = js.native
}
object InvalidImportTokenException {
  
  @scala.inline
  def apply(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidImportTokenException): InvalidImportTokenException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidImportTokenException]
  }
  
  @scala.inline
  implicit class InvalidImportTokenExceptionOps[Self <: InvalidImportTokenException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidImportTokenException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
