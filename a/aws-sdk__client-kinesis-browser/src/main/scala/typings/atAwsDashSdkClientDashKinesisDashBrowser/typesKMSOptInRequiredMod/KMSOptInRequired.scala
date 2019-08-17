package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSOptInRequiredMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSOptInRequired
  extends ServiceException[_KMSOptInRequiredDetails]
     with GetRecordsExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion
     with StartStreamEncryptionExceptionsUnion {
  @JSName("name")
  var name_KMSOptInRequired: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMSOptInRequired
}

object KMSOptInRequired {
  @scala.inline
  def apply(
    details: _KMSOptInRequiredDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMSOptInRequired,
    stack: String = null
  ): KMSOptInRequired = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[KMSOptInRequired]
  }
}

