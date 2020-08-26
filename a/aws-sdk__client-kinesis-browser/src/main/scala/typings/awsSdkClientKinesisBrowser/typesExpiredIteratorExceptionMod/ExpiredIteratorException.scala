package typings.awsSdkClientKinesisBrowser.typesExpiredIteratorExceptionMod

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredIteratorException
  extends ServiceException[ExpiredIteratorExceptionDetails]
     with GetRecordsExceptionsUnion {
  @JSName("name")
  var name_ExpiredIteratorException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException = js.native
}

object ExpiredIteratorException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredIteratorExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException
  ): ExpiredIteratorException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredIteratorException]
  }
  @scala.inline
  implicit class ExpiredIteratorExceptionOps[Self <: ExpiredIteratorException] (val x: Self) extends AnyVal {
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
    def setName(
      value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

