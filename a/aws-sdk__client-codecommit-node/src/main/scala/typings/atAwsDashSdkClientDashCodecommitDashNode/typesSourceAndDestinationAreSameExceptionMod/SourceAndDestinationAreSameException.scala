package typings.atAwsDashSdkClientDashCodecommitDashNode.typesSourceAndDestinationAreSameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestinationAreSameException
  extends ServiceException[_SourceAndDestinationAreSameExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_SourceAndDestinationAreSameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SourceAndDestinationAreSameException
}

object SourceAndDestinationAreSameException {
  @scala.inline
  def apply(
    details: _SourceAndDestinationAreSameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SourceAndDestinationAreSameException,
    stack: String = null
  ): SourceAndDestinationAreSameException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SourceAndDestinationAreSameException]
  }
}

