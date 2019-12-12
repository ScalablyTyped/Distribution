package typings.atAwsDashSdkClientDashCodecommitDashNode.typesParentCommitIdOutdatedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentCommitIdOutdatedException
  extends ServiceException[_ParentCommitIdOutdatedExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_ParentCommitIdOutdatedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ParentCommitIdOutdatedException = js.native
}

