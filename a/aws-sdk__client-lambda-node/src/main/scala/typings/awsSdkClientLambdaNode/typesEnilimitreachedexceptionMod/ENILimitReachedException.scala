package typings.awsSdkClientLambdaNode.typesEnilimitreachedexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ENILimitReachedException
  extends ServiceException[ENILimitReachedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_ENILimitReachedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ENILimitReachedException = js.native
}

