package typings.atAwsDashSdkClientDashCodecommitDashNode.typesParentCommitIdRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentCommitIdRequiredException
  extends ServiceException[_ParentCommitIdRequiredExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_ParentCommitIdRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ParentCommitIdRequiredException = js.native
}

