package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBranchNameIsTagNameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchNameIsTagNameException
  extends ServiceException[_BranchNameIsTagNameExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_BranchNameIsTagNameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BranchNameIsTagNameException = js.native
}

