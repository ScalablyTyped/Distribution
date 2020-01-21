package typings.awsSdkClientLambdaNode.typesKmsinvalidstateexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSInvalidStateException
  extends ServiceException[KMSInvalidStateExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSInvalidStateException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSInvalidStateException = js.native
}

