package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidParentCommitIdExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidParentCommitIdException
  extends ServiceException[_InvalidParentCommitIdExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidParentCommitIdException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidParentCommitIdException = js.native
}

