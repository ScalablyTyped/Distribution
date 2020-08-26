package typings.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod

import typings.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTimeoutException
  extends ServiceException[RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException = js.native
}

object RequestTimeoutException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RequestTimeoutExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException
  ): RequestTimeoutException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTimeoutException]
  }
  @scala.inline
  implicit class RequestTimeoutExceptionOps[Self <: RequestTimeoutException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

