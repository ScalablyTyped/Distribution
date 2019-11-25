package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSDisabledExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSDisabledException
  extends ServiceException[_KMSDisabledExceptionDetails]
     with GetRecordsExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion
     with StartStreamEncryptionExceptionsUnion {
  @JSName("name")
  var name_KMSDisabledException: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMSDisabledException
}

object KMSDisabledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _KMSDisabledExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMSDisabledException,
    stack: String = null
  ): KMSDisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSDisabledException]
  }
}

