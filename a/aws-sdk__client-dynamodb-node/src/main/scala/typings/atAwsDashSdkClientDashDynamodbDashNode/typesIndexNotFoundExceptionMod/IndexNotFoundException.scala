package typings.atAwsDashSdkClientDashDynamodbDashNode.typesIndexNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexNotFoundException
  extends ServiceException[_IndexNotFoundExceptionDetails]
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_IndexNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.IndexNotFoundException = js.native
}

