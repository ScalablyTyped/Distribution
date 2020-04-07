package typings.awsSdkClientLambdaNode.typesKmsdisabledexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSDisabledException
  extends ServiceException[KMSDisabledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSDisabledException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException
}

object KMSDisabledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSDisabledExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException,
    stack: String = null
  ): KMSDisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSDisabledException]
  }
}

