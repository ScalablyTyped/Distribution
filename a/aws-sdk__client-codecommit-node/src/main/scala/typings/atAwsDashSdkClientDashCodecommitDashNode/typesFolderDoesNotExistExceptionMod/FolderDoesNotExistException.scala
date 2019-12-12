package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFolderDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderDoesNotExistException
  extends ServiceException[_FolderDoesNotExistExceptionDetails]
     with GetFolderExceptionsUnion {
  @JSName("name")
  var name_FolderDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FolderDoesNotExistException = js.native
}

