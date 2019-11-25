package typings.atAwsDashSdkClientDashKmsDashNode.typesIncorrectKeyMaterialExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncorrectKeyMaterialException
  extends ServiceException[_IncorrectKeyMaterialExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_IncorrectKeyMaterialException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.IncorrectKeyMaterialException
}

object IncorrectKeyMaterialException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _IncorrectKeyMaterialExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.IncorrectKeyMaterialException,
    stack: String = null
  ): IncorrectKeyMaterialException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncorrectKeyMaterialException]
  }
}

