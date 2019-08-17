package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidSourceCommitSpecifierExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSourceCommitSpecifierException
  extends ServiceException[_InvalidSourceCommitSpecifierExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidSourceCommitSpecifierException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidSourceCommitSpecifierException
}

object InvalidSourceCommitSpecifierException {
  @scala.inline
  def apply(
    details: _InvalidSourceCommitSpecifierExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidSourceCommitSpecifierException,
    stack: String = null
  ): InvalidSourceCommitSpecifierException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidSourceCommitSpecifierException]
  }
}

