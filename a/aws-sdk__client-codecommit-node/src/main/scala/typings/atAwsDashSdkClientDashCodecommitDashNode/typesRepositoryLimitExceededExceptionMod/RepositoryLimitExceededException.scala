package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryLimitExceededException
  extends ServiceException[_RepositoryLimitExceededExceptionDetails]
     with CreateRepositoryExceptionsUnion {
  @JSName("name")
  var name_RepositoryLimitExceededException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryLimitExceededException
}

object RepositoryLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RepositoryLimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryLimitExceededException,
    stack: String = null
  ): RepositoryLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryLimitExceededException]
  }
}

