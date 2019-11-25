package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidDestinationCommitSpecifierExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _InvalidDestinationCommitSpecifierExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDestinationCommitSpecifierException,
    stack: String = null
  ): InvalidDestinationCommitSpecifierException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDestinationCommitSpecifierException]
  }
}

