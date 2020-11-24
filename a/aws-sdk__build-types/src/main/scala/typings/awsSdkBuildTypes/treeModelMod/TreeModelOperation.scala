package typings.awsSdkBuildTypes.treeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel * / any */ @js.native
trait TreeModelOperation
  extends Documented
     with Named {
  
  var authtype: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ js.Any
  ] = js.native
  
  var errors: js.Array[TreeModelOperationMember] = js.native
  
  var input: TreeModelOperationMember = js.native
  
  var output: TreeModelOperationMember = js.native
}
object TreeModelOperation {
  
  @scala.inline
  def apply(
    documentation: String,
    errors: js.Array[TreeModelOperationMember],
    input: TreeModelOperationMember,
    name: String,
    output: TreeModelOperationMember
  ): TreeModelOperation = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelOperation]
  }
  
  @scala.inline
  implicit class TreeModelOperationOps[Self <: TreeModelOperation] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: TreeModelOperationMember*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[TreeModelOperationMember]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: TreeModelOperationMember): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: TreeModelOperationMember): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthtype(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ js.Any
    ): Self = this.set("authtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthtype: Self = this.set("authtype", js.undefined)
  }
}
