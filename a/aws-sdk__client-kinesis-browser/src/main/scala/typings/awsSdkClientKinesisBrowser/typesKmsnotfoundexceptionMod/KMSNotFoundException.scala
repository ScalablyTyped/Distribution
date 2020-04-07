package typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSNotFoundException
  extends ServiceException[KMSNotFoundExceptionDetails]
     with GetRecordsExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion
     with StartStreamEncryptionExceptionsUnion {
  @JSName("name")
  var name_KMSNotFoundException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSNotFoundException
}

object KMSNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSNotFoundException,
    stack: String = null
  ): KMSNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSNotFoundException]
  }
}

