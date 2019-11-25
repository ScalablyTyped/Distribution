package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidDeletionParameterExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidDeletionParameterException
  extends ServiceException[_InvalidDeletionParameterExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidDeletionParameterException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDeletionParameterException
}

object InvalidDeletionParameterException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidDeletionParameterExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDeletionParameterException,
    stack: String = null
  ): InvalidDeletionParameterException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDeletionParameterException]
  }
}

