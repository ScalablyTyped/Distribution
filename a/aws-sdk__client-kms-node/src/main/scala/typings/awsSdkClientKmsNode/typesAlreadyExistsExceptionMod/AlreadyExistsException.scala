package typings.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod

import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlreadyExistsException
  extends ServiceException[AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException
}

object AlreadyExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: AlreadyExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException,
    stack: String = null
  ): AlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlreadyExistsException]
  }
}

