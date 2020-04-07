package typings.awsSdkClientKmsBrowser.typesIncorrectKeyMaterialExceptionMod

import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncorrectKeyMaterialException
  extends ServiceException[IncorrectKeyMaterialExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_IncorrectKeyMaterialException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException
}

object IncorrectKeyMaterialException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: IncorrectKeyMaterialExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException,
    stack: String = null
  ): IncorrectKeyMaterialException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncorrectKeyMaterialException]
  }
}

