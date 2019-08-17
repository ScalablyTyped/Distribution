package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesExpiredNextTokenExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredNextTokenException
  extends ServiceException[_ExpiredNextTokenExceptionDetails]
     with ListShardsExceptionsUnion
     with ListStreamConsumersExceptionsUnion {
  @JSName("name")
  var name_ExpiredNextTokenException: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ExpiredNextTokenException
}

object ExpiredNextTokenException {
  @scala.inline
  def apply(
    details: _ExpiredNextTokenExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ExpiredNextTokenException,
    stack: String = null
  ): ExpiredNextTokenException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExpiredNextTokenException]
  }
}

