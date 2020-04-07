package typings.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod

import typings.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MalformedPolicyDocumentException
  extends ServiceException[MalformedPolicyDocumentExceptionDetails]
     with CreateKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion {
  @JSName("name")
  var name_MalformedPolicyDocumentException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
}

object MalformedPolicyDocumentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MalformedPolicyDocumentExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException,
    stack: String = null
  ): MalformedPolicyDocumentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedPolicyDocumentException]
  }
}

