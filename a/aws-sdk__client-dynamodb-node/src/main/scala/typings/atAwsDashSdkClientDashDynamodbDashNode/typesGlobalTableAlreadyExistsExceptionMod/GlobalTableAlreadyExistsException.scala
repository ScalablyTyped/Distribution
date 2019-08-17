package typings.atAwsDashSdkClientDashDynamodbDashNode.typesGlobalTableAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableAlreadyExistsException
  extends ServiceException[_GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.GlobalTableAlreadyExistsException
}

object GlobalTableAlreadyExistsException {
  @scala.inline
  def apply(
    details: _GlobalTableAlreadyExistsExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.GlobalTableAlreadyExistsException,
    stack: String = null
  ): GlobalTableAlreadyExistsException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[GlobalTableAlreadyExistsException]
  }
}

