package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidBlobIdExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _InvalidBlobIdExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidBlobIdException,
    stack: String = null
  ): InvalidBlobIdException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidBlobIdException]
  }
}

