package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkTypes.protocolMod.HttpTrait
import typings.awsSdkTypes.protocolMod.SupportedSignatureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  var authtype: js.UndefOr[SupportedSignatureVersion] = js.native
  var deprecated: js.UndefOr[scala.Boolean] = js.native
  var documentation: js.UndefOr[java.lang.String] = js.native
  var documentationUrl: js.UndefOr[java.lang.String] = js.native
  var errors: js.UndefOr[js.Array[StructureMember]] = js.native
  var http: HttpTrait = js.native
  var input: js.UndefOr[StructureMember] = js.native
  var name: java.lang.String = js.native
  var output: js.UndefOr[StructureMember] = js.native
}

object Operation {
  @scala.inline
  def apply(http: HttpTrait, name: java.lang.String): Operation = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setHttp(value: HttpTrait): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthtype(value: SupportedSignatureVersion): Self = this.set("authtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthtype: Self = this.set("authtype", js.undefined)
    @scala.inline
    def setDeprecated(value: scala.Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setDocumentationUrl(value: java.lang.String): Self = this.set("documentationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentationUrl: Self = this.set("documentationUrl", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: StructureMember*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[StructureMember]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setInput(value: StructureMember): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setOutput(value: StructureMember): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}

