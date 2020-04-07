package typings.awsSdkClientKmsBrowser.typesExpiredImportTokenExceptionMod

import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredImportTokenException
  extends ServiceException[ExpiredImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_ExpiredImportTokenException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ExpiredImportTokenException
}

object ExpiredImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredImportTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ExpiredImportTokenException,
    stack: String = null
  ): ExpiredImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredImportTokenException]
  }
}

