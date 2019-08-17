package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidKeyUsageExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidKeyUsageException
  extends ServiceException[_InvalidKeyUsageExceptionDetails]
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidKeyUsageException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidKeyUsageException
}

object InvalidKeyUsageException {
  @scala.inline
  def apply(
    details: _InvalidKeyUsageExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidKeyUsageException,
    stack: String = null
  ): InvalidKeyUsageException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidKeyUsageException]
  }
}

