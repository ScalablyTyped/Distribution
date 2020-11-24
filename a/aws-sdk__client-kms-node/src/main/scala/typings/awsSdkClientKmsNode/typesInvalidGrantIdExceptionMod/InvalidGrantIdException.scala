package typings.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod

import typings.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidGrantIdExceptionDetails> * / any */ @js.native
trait InvalidGrantIdException
  extends RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  
  var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException = js.native
}
object InvalidGrantIdException {
  
  @scala.inline
  def apply(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException): InvalidGrantIdException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidGrantIdException]
  }
  
  @scala.inline
  implicit class InvalidGrantIdExceptionOps[Self <: InvalidGrantIdException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
