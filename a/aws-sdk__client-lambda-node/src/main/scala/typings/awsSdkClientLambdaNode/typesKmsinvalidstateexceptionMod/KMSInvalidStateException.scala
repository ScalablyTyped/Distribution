package typings.awsSdkClientLambdaNode.typesKmsinvalidstateexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSInvalidStateException
  extends ServiceException[KMSInvalidStateExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSInvalidStateException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSInvalidStateException
}

object KMSInvalidStateException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSInvalidStateExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSInvalidStateException,
    stack: String = null
  ): KMSInvalidStateException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSInvalidStateException]
  }
}

