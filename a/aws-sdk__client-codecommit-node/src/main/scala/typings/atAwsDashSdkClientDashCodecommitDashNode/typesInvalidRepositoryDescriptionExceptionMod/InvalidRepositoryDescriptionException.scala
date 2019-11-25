package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidRepositoryDescriptionExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryDescriptionException
  extends ServiceException[_InvalidRepositoryDescriptionExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryDescriptionException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryDescriptionException
}

object InvalidRepositoryDescriptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRepositoryDescriptionExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryDescriptionException,
    stack: String = null
  ): InvalidRepositoryDescriptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryDescriptionException]
  }
}

