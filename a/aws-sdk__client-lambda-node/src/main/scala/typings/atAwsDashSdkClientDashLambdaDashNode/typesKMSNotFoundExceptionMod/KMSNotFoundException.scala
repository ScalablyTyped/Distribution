package typings.atAwsDashSdkClientDashLambdaDashNode.typesKMSNotFoundExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSNotFoundException
  extends ServiceException[_KMSNotFoundExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSNotFoundException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.KMSNotFoundException = js.native
}

