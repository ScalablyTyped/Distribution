package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidFileModeExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidFileModeException
  extends ServiceException[_InvalidFileModeExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidFileModeException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidFileModeException
}

object InvalidFileModeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidFileModeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidFileModeException,
    stack: String = null
  ): InvalidFileModeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFileModeException]
  }
}

