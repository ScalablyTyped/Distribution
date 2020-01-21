package typings.awsSdkClientLambdaNode.typesKmsdisabledexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSDisabledException
  extends ServiceException[KMSDisabledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSDisabledException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException = js.native
}

