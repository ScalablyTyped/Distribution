package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidCiphertextExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidCiphertextException
  extends ServiceException[_InvalidCiphertextExceptionDetails]
     with DecryptExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidCiphertextException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidCiphertextException = js.native
}

