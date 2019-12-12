package typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueInProgressMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurgeQueueInProgress
  extends ServiceException[_PurgeQueueInProgressDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_PurgeQueueInProgress: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.PurgeQueueInProgress = js.native
}

