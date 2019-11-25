package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFolderDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _FolderDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FolderDoesNotExistException,
    stack: String = null
  ): FolderDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderDoesNotExistException]
  }
}

