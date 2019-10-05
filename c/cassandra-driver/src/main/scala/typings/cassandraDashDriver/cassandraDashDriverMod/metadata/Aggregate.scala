package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import typings.cassandraDashDriver.Anon_CodeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  var argumentTypes: js.Array[Anon_CodeInfo]
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
    argumentTypes: js.Array[Anon_CodeInfo],
    finalFunction: String,
    initCondition: String,
    keyspaceName: String,
    returnType: String,
    signature: js.Array[String],
    stateFunction: String,
    stateType: String
  ): Aggregate = {
    val __obj = js.Dynamic.literal(argumentTypes = argumentTypes, finalFunction = finalFunction, initCondition = initCondition, keyspaceName = keyspaceName, returnType = returnType, signature = signature, stateFunction = stateFunction, stateType = stateType)
  
    __obj.asInstanceOf[Aggregate]
  }
}

