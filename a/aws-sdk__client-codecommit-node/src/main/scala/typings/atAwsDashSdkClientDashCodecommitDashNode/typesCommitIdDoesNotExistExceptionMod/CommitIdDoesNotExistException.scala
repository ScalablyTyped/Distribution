package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommitIdDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitIdDoesNotExistException
  extends ServiceException[_CommitIdDoesNotExistExceptionDetails]
     with GetCommitExceptionsUnion {
  @JSName("name")
  var name_CommitIdDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommitIdDoesNotExistException
}

object CommitIdDoesNotExistException {
  @scala.inline
  def apply(
    details: _CommitIdDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommitIdDoesNotExistException,
    stack: String = null
  ): CommitIdDoesNotExistException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CommitIdDoesNotExistException]
  }
}

