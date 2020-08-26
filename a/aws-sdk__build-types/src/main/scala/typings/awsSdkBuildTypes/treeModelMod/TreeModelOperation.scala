package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.protocolMod.HttpTrait
import typings.awsSdkTypes.protocolMod.Member
import typings.awsSdkTypes.protocolMod.ServiceMetadata
import typings.awsSdkTypes.protocolMod.SupportedSignatureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.awsSdkTypes.protocolMod.OperationModel because var conflicts: name. Inlined errors, http, input, metadata, output */ @js.native
trait TreeModelOperation
  extends Documented
     with Named {
  var authtype: js.UndefOr[SupportedSignatureVersion] = js.native
  var errors: js.Array[Member | TreeModelOperationMember] = js.native
  var http: HttpTrait = js.native
  var input: Member | TreeModelOperationMember = js.native
  var metadata: ServiceMetadata = js.native
  var output: Member | TreeModelOperationMember = js.native
}

object TreeModelOperation {
  @scala.inline
  def apply(
    documentation: String,
    errors: js.Array[Member | TreeModelOperationMember],
    http: HttpTrait,
    input: Member | TreeModelOperationMember,
    metadata: ServiceMetadata,
    name: String,
    output: Member | TreeModelOperationMember
  ): TreeModelOperation = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
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
    def setErrorsVarargs(value: (Member | TreeModelOperationMember)*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Member | TreeModelOperationMember]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: HttpTrait): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Member | TreeModelOperationMember): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ServiceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Member | TreeModelOperationMember): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthtype(value: SupportedSignatureVersion): Self = this.set("authtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthtype: Self = this.set("authtype", js.undefined)
  }
  
}

