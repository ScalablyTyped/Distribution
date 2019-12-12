package typings.atAwsDashSdkClientDashDynamodbDashNode.typesGlobalTableAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableAlreadyExistsException
  extends ServiceException[_GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.GlobalTableAlreadyExistsException = js.native
}

