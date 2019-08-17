package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFolderDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderDoesNotExistException
  extends ServiceException[_FolderDoesNotExistExceptionDetails]
     with GetFolderExceptionsUnion {
  @JSName("name")
  var name_FolderDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FolderDoesNotExistException
}

object FolderDoesNotExistException {
  @scala.inline
  def apply(
    details: _FolderDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FolderDoesNotExistException,
    stack: String = null
  ): FolderDoesNotExistException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FolderDoesNotExistException]
  }
}

