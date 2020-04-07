package typings.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod

import typings.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredNextTokenException
  extends ServiceException[ExpiredNextTokenExceptionDetails]
     with ListShardsExceptionsUnion
     with ListStreamConsumersExceptionsUnion {
  @JSName("name")
  var name_ExpiredNextTokenException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
}

object ExpiredNextTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredNextTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException,
    stack: String = null
  ): ExpiredNextTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredNextTokenException]
  }
}

