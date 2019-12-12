package typings.atAwsDashSdkClientDashDynamodbDashNode.typesReplicaAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaAlreadyExistsException
  extends ServiceException[_ReplicaAlreadyExistsExceptionDetails]
     with UpdateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_ReplicaAlreadyExistsException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ReplicaAlreadyExistsException = js.native
}

