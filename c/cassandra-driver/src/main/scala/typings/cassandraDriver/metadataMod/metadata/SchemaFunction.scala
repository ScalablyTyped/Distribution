package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFunction extends js.Object {
  var argumentNames: js.Array[String] = js.native
  var argumentTypes: js.Array[Code] = js.native
  var body: String = js.native
  var calledOnNullInput: Boolean = js.native
  var keyspaceName: String = js.native
  var language: String = js.native
  var name: String = js.native
  var returnType: String = js.native
  var signature: js.Array[String] = js.native
}

object SchemaFunction {
  @scala.inline
  def apply(
    argumentNames: js.Array[String],
    argumentTypes: js.Array[Code],
    body: String,
    calledOnNullInput: Boolean,
    keyspaceName: String,
    language: String,
    name: String,
    returnType: String,
    signature: js.Array[String]
  ): SchemaFunction = {
    val __obj = js.Dynamic.literal(argumentNames = argumentNames.asInstanceOf[js.Any], argumentTypes = argumentTypes.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], calledOnNullInput = calledOnNullInput.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFunction]
  }
  @scala.inline
  implicit class SchemaFunctionOps[Self <: SchemaFunction] (val x: Self) extends AnyVal {
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
    def setArgumentNamesVarargs(value: String*): Self = this.set("argumentNames", js.Array(value :_*))
    @scala.inline
    def setArgumentNames(value: js.Array[String]): Self = this.set("argumentNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentTypesVarargs(value: Code*): Self = this.set("argumentTypes", js.Array(value :_*))
    @scala.inline
    def setArgumentTypes(value: js.Array[Code]): Self = this.set("argumentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalledOnNullInput(value: Boolean): Self = this.set("calledOnNullInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyspaceName(value: String): Self = this.set("keyspaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: String): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureVarargs(value: String*): Self = this.set("signature", js.Array(value :_*))
    @scala.inline
    def setSignature(value: js.Array[String]): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

