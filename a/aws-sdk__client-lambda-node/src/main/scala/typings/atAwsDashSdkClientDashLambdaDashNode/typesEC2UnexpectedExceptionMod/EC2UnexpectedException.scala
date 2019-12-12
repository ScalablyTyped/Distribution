package typings.atAwsDashSdkClientDashLambdaDashNode.typesEC2UnexpectedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2UnexpectedException
  extends ServiceException[_EC2UnexpectedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2UnexpectedException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.EC2UnexpectedException = js.native
}

