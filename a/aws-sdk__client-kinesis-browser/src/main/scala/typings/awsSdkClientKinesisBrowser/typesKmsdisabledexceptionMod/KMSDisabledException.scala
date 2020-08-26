package typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSDisabledException
  extends ServiceException[KMSDisabledExceptionDetails]
     with GetRecordsExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion
     with StartStreamEncryptionExceptionsUnion {
  @JSName("name")
  var name_KMSDisabledException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSDisabledException = js.native
}

object KMSDisabledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSDisabledExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSDisabledException
  ): KMSDisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSDisabledException]
  }
  @scala.inline
  implicit class KMSDisabledExceptionOps[Self <: KMSDisabledException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSDisabledException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

