package typings.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidImportTokenException
  extends ServiceException[InvalidImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_InvalidImportTokenException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException
}

object InvalidImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidImportTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException,
    stack: String = null
  ): InvalidImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidImportTokenException]
  }
}

