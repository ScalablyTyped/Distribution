package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBlobIdDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobIdDoesNotExistException
  extends ServiceException[_BlobIdDoesNotExistExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BlobIdDoesNotExistException
}

object BlobIdDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BlobIdDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BlobIdDoesNotExistException,
    stack: String = null
  ): BlobIdDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobIdDoesNotExistException]
  }
}

