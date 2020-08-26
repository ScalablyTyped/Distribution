package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationModel extends js.Object {
  var errors: js.Array[Member] = js.native
  var http: HttpTrait = js.native
  var input: Member = js.native
  var metadata: ServiceMetadata = js.native
  var name: java.lang.String = js.native
  var output: Member = js.native
}

object OperationModel {
  @scala.inline
  def apply(
    errors: js.Array[Member],
    http: HttpTrait,
    input: Member,
    metadata: ServiceMetadata,
    name: java.lang.String,
    output: Member
  ): OperationModel = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationModel]
  }
  @scala.inline
  implicit class OperationModelOps[Self <: OperationModel] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: Member*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Member]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: HttpTrait): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Member): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ServiceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Member): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

