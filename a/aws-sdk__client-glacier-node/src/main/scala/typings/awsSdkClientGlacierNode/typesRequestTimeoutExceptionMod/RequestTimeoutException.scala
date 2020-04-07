package typings.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod

import typings.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTimeoutException
  extends ServiceException[RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException
}

object RequestTimeoutException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RequestTimeoutExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException,
    stack: String = null
  ): RequestTimeoutException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTimeoutException]
  }
}

