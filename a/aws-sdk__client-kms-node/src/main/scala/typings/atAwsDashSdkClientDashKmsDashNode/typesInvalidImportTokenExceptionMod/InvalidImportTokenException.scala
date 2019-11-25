package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidImportTokenExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidImportTokenException
  extends ServiceException[_InvalidImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_InvalidImportTokenException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidImportTokenException
}

object InvalidImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidImportTokenExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidImportTokenException,
    stack: String = null
  ): InvalidImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidImportTokenException]
  }
}

