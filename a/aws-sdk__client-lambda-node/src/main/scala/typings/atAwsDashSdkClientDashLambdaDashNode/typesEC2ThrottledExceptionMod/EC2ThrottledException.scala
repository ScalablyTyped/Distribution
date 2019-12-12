package typings.atAwsDashSdkClientDashLambdaDashNode.typesEC2ThrottledExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ThrottledException
  extends ServiceException[_EC2ThrottledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2ThrottledException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.EC2ThrottledException = js.native
}

