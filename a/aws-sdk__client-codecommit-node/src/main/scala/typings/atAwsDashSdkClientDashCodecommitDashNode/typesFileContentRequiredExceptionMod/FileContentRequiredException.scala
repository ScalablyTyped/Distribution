package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFileContentRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _FileContentRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileContentRequiredException,
    stack: String = null
  ): FileContentRequiredException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FileContentRequiredException]
  }
}

