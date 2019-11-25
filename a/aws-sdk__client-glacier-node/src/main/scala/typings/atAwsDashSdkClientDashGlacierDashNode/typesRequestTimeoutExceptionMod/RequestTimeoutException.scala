package typings.atAwsDashSdkClientDashGlacierDashNode.typesRequestTimeoutExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTimeoutException
  extends ServiceException[_RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.RequestTimeoutException
}

object RequestTimeoutException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RequestTimeoutExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.RequestTimeoutException,
    stack: String = null
  ): RequestTimeoutException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTimeoutException]
  }
}

