package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFileTooLargeExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTooLargeException
  extends ServiceException[_FileTooLargeExceptionDetails]
     with GetBlobExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileTooLargeException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileTooLargeException = js.native
}

