package typings.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExpiredImportTokenExceptionDetails> * / any */ @js.native
trait ExpiredImportTokenException extends ImportKeyMaterialExceptionsUnion {
  
  var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException = js.native
}
object ExpiredImportTokenException {
  
  @scala.inline
  def apply(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException): ExpiredImportTokenException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredImportTokenException]
  }
  
  @scala.inline
  implicit class ExpiredImportTokenExceptionOps[Self <: ExpiredImportTokenException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
