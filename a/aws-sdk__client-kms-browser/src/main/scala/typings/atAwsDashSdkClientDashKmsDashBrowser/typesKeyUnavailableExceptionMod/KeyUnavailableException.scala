package typings.atAwsDashSdkClientDashKmsDashBrowser.typesKeyUnavailableExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyUnavailableException
  extends ServiceException[_KeyUnavailableExceptionDetails]
     with DecryptExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_KeyUnavailableException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.KeyUnavailableException
}

object KeyUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _KeyUnavailableExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.KeyUnavailableException,
    stack: String = null
  ): KeyUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUnavailableException]
  }
}

