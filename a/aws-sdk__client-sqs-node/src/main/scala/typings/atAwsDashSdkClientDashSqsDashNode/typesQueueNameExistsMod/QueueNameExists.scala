package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueNameExistsMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueNameExists
  extends ServiceException[_QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueNameExists = js.native
}

