package typings.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSAccessDeniedException
  extends ServiceException[KMSAccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSAccessDeniedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException = js.native
}

