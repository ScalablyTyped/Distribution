package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkBuildTypes.apiModelMod.Operation
import typings.awsSdkBuildTypes.apiModelMod.StructureMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedOperation extends Operation {
  
  @JSName("errors")
  var errors_NormalizedOperation: js.Array[StructureMember] = js.native
  
  @JSName("input")
  var input_NormalizedOperation: StructureMember = js.native
  
  @JSName("output")
  var output_NormalizedOperation: StructureMember = js.native
}
object NormalizedOperation {
  
  @scala.inline
  def apply(
    errors: js.Array[StructureMember],
    http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ js.Any,
    input: StructureMember,
    name: String,
    output: StructureMember
  ): NormalizedOperation = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOperation]
  }
  
  @scala.inline
  implicit class NormalizedOperationOps[Self <: NormalizedOperation] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: StructureMember*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[StructureMember]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: StructureMember): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: StructureMember): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
