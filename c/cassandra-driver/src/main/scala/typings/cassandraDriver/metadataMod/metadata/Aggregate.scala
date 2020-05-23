package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  var argumentTypes: js.Array[Code]
  var finalFunction: String
  var initCondition: String
  var keyspaceName: String
  var returnType: String
  var signature: js.Array[String]
  var stateFunction: String
  var stateType: String
}

object Aggregate {
  @scala.inline
  def apply(
    argumentTypes: js.Array[Code],
    finalFunction: String,
    initCondition: String,
    keyspaceName: String,
    returnType: String,
    signature: js.Array[String],
    stateFunction: String,
    stateType: String
  ): Aggregate = {
    val __obj = js.Dynamic.literal(argumentTypes = argumentTypes.asInstanceOf[js.Any], finalFunction = finalFunction.asInstanceOf[js.Any], initCondition = initCondition.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], stateFunction = stateFunction.asInstanceOf[js.Any], stateType = stateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
}

