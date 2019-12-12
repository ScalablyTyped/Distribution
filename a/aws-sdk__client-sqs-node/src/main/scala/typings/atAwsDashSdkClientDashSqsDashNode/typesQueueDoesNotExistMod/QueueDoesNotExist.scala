package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueDoesNotExistMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDoesNotExist
  extends ServiceException[_QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDoesNotExist = js.native
}

