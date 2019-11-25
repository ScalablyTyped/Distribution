package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesExpiredNextTokenExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _ExpiredNextTokenExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ExpiredNextTokenException,
    stack: String = null
  ): ExpiredNextTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredNextTokenException]
  }
}

