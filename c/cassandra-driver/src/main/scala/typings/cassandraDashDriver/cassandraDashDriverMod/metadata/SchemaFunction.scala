package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import typings.cassandraDashDriver.Anon_CodeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFunction extends js.Object {
  var argumentNames: js.Array[String]
  var argumentTypes: js.Array[Anon_CodeInfo]
  var body: String
  var calledOnNullInput: Boolean
  var keyspaceName: String
  var language: String
  var name: String
  var returnType: String
  var signature: js.Array[String]
}

object SchemaFunction {
  @scala.inline
  def apply(
    argumentNames: js.Array[String],
    argumentTypes: js.Array[Anon_CodeInfo],
    body: String,
    calledOnNullInput: Boolean,
    keyspaceName: String,
    language: String,
    name: String,
    returnType: String,
    signature: js.Array[String]
  ): SchemaFunction = {
    val __obj = js.Dynamic.literal(argumentNames = argumentNames, argumentTypes = argumentTypes, body = body, calledOnNullInput = calledOnNullInput, keyspaceName = keyspaceName, language = language, name = name, returnType = returnType, signature = signature)
  
    __obj.asInstanceOf[SchemaFunction]
  }
}

