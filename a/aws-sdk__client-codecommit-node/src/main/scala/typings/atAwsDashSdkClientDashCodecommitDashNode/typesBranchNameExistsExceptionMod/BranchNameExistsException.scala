package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBranchNameExistsExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchNameExistsException
  extends ServiceException[_BranchNameExistsExceptionDetails]
     with CreateBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameExistsException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BranchNameExistsException = js.native
}

