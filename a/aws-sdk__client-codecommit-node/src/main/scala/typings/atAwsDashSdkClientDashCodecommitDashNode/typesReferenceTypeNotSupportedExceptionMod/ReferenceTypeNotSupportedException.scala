package typings.atAwsDashSdkClientDashCodecommitDashNode.typesReferenceTypeNotSupportedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceTypeNotSupportedException
  extends ServiceException[_ReferenceTypeNotSupportedExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceTypeNotSupportedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceTypeNotSupportedException
}

object ReferenceTypeNotSupportedException {
  @scala.inline
  def apply(
    details: _ReferenceTypeNotSupportedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceTypeNotSupportedException,
    stack: String = null
  ): ReferenceTypeNotSupportedException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ReferenceTypeNotSupportedException]
  }
}

