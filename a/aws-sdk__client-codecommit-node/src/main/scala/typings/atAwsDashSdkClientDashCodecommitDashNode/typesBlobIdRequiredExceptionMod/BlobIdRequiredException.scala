package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBlobIdRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobIdRequiredException
  extends ServiceException[_BlobIdRequiredExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BlobIdRequiredException
}

object BlobIdRequiredException {
  @scala.inline
  def apply(
    details: _BlobIdRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BlobIdRequiredException,
    stack: String = null
  ): BlobIdRequiredException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[BlobIdRequiredException]
  }
}

