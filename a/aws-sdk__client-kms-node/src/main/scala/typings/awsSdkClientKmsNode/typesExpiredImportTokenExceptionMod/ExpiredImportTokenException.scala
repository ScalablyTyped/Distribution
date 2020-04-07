package typings.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredImportTokenException
  extends ServiceException[ExpiredImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_ExpiredImportTokenException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException
}

object ExpiredImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredImportTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException,
    stack: String = null
  ): ExpiredImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredImportTokenException]
  }
}

