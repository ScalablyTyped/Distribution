package typings.awsSdkClientKinesisBrowser.typesExpiredIteratorExceptionMod

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredIteratorException
  extends ServiceException[ExpiredIteratorExceptionDetails]
     with GetRecordsExceptionsUnion {
  @JSName("name")
  var name_ExpiredIteratorException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException
}

object ExpiredIteratorException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredIteratorExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException,
    stack: String = null
  ): ExpiredIteratorException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredIteratorException]
  }
}

