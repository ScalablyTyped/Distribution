package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidBlobIdExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidBlobIdException
  extends ServiceException[_InvalidBlobIdExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_InvalidBlobIdException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidBlobIdException
}

object InvalidBlobIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidBlobIdExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidBlobIdException,
    stack: String = null
  ): InvalidBlobIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBlobIdException]
  }
}

