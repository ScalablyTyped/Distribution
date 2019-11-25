package typings.atAwsDashSdkClientDashCodecommitDashNode.typesSameFileContentExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SameFileContentException
  extends ServiceException[_SameFileContentExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_SameFileContentException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SameFileContentException
}

object SameFileContentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _SameFileContentExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SameFileContentException,
    stack: String = null
  ): SameFileContentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameFileContentException]
  }
}

