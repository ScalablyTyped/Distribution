package typings.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod

import typings.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyUnavailableException
  extends ServiceException[KeyUnavailableExceptionDetails]
     with DecryptExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_KeyUnavailableException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KeyUnavailableException = js.native
}

object KeyUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KeyUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KeyUnavailableException
  ): KeyUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUnavailableException]
  }
  @scala.inline
  implicit class KeyUnavailableExceptionOps[Self <: KeyUnavailableException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KeyUnavailableException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

