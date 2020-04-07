package typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod

import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
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
  var name_MalformedPolicyDocumentException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException
}

object MalformedPolicyDocumentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MalformedPolicyDocumentExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException,
    stack: String = null
  ): MalformedPolicyDocumentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedPolicyDocumentException]
  }
}

