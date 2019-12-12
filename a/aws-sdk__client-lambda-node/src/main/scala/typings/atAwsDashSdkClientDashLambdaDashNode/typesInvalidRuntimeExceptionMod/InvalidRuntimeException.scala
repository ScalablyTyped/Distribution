package typings.atAwsDashSdkClientDashLambdaDashNode.typesInvalidRuntimeExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRuntimeException
  extends ServiceException[_InvalidRuntimeExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRuntimeException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidRuntimeException = js.native
}

