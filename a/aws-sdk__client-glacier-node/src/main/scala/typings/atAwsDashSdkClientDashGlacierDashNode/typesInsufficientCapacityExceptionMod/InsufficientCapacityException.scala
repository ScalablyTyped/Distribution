package typings.atAwsDashSdkClientDashGlacierDashNode.typesInsufficientCapacityExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsufficientCapacityException
  extends ServiceException[_InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.InsufficientCapacityException = js.native
}

