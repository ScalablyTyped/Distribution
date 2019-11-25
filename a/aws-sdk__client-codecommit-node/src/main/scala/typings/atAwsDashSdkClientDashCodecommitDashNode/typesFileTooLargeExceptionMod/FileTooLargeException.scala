package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFileTooLargeExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTooLargeException
  extends ServiceException[_FileTooLargeExceptionDetails]
     with GetBlobExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileTooLargeException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileTooLargeException
}

object FileTooLargeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _FileTooLargeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileTooLargeException,
    stack: String = null
  ): FileTooLargeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTooLargeException]
  }
}

