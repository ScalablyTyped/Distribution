package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSThrottlingExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSThrottlingException
  extends ServiceException[_KMSThrottlingExceptionDetails]
     with GetRecordsExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion
     with StartStreamEncryptionExceptionsUnion {
  @JSName("name")
  var name_KMSThrottlingException: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMSThrottlingException
}

object KMSThrottlingException {
  @scala.inline
  def apply(
    details: _KMSThrottlingExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMSThrottlingException,
    stack: String = null
  ): KMSThrottlingException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[KMSThrottlingException]
  }
}

