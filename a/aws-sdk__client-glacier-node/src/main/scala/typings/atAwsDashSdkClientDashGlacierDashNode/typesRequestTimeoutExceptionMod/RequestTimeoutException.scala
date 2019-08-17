package typings.atAwsDashSdkClientDashGlacierDashNode.typesRequestTimeoutExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _RequestTimeoutExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.RequestTimeoutException,
    stack: String = null
  ): RequestTimeoutException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestTimeoutException]
  }
}

