package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFunction extends js.Object {
  var argumentNames: js.Array[String]
  var argumentTypes: js.Array[AnonCode]
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
    argumentTypes: js.Array[AnonCode],
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
}

