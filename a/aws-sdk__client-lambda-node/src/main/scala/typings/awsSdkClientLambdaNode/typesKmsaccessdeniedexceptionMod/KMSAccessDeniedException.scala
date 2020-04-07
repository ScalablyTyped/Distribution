package typings.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSAccessDeniedException
  extends ServiceException[KMSAccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSAccessDeniedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException
}

object KMSAccessDeniedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSAccessDeniedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException,
    stack: String = null
  ): KMSAccessDeniedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSAccessDeniedException]
  }
}

