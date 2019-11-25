package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFileContentRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContentRequiredException
  extends ServiceException[_FileContentRequiredExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileContentRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileContentRequiredException
}

object FileContentRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _FileContentRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileContentRequiredException,
    stack: String = null
  ): FileContentRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContentRequiredException]
  }
}

