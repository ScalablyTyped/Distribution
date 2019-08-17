package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidDestinationCommitSpecifierExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidDestinationCommitSpecifierException
  extends ServiceException[_InvalidDestinationCommitSpecifierExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidDestinationCommitSpecifierException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDestinationCommitSpecifierException
}

object InvalidDestinationCommitSpecifierException {
  @scala.inline
  def apply(
    details: _InvalidDestinationCommitSpecifierExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDestinationCommitSpecifierException,
    stack: String = null
  ): InvalidDestinationCommitSpecifierException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidDestinationCommitSpecifierException]
  }
}

