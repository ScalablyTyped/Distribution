package typings.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod

import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAliasNameException
  extends ServiceException[InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException
}

object InvalidAliasNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidAliasNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException,
    stack: String = null
  ): InvalidAliasNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAliasNameException]
  }
}

