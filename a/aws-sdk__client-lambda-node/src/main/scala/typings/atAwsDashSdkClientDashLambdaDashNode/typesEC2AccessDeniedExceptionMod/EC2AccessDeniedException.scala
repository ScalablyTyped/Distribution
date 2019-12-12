package typings.atAwsDashSdkClientDashLambdaDashNode.typesEC2AccessDeniedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2AccessDeniedException
  extends ServiceException[_EC2AccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2AccessDeniedException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.EC2AccessDeniedException = js.native
}

