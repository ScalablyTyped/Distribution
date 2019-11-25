package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidGrantTokenExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidGrantTokenException
  extends ServiceException[_InvalidGrantTokenExceptionDetails]
     with CreateGrantExceptionsUnion
     with DecryptExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion
     with RetireGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantTokenException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidGrantTokenException
}

object InvalidGrantTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidGrantTokenExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidGrantTokenException,
    stack: String = null
  ): InvalidGrantTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidGrantTokenException]
  }
}

