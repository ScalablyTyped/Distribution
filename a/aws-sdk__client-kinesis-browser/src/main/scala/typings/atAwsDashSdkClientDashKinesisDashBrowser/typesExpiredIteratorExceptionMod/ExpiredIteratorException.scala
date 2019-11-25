package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesExpiredIteratorExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredIteratorException
  extends ServiceException[_ExpiredIteratorExceptionDetails]
     with GetRecordsExceptionsUnion {
  @JSName("name")
  var name_ExpiredIteratorException: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ExpiredIteratorException
}

object ExpiredIteratorException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ExpiredIteratorExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ExpiredIteratorException,
    stack: String = null
  ): ExpiredIteratorException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredIteratorException]
  }
}

