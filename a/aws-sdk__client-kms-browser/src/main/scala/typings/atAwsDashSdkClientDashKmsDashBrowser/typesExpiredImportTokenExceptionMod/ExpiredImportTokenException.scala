package typings.atAwsDashSdkClientDashKmsDashBrowser.typesExpiredImportTokenExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredImportTokenException
  extends ServiceException[_ExpiredImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_ExpiredImportTokenException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.ExpiredImportTokenException
}

object ExpiredImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ExpiredImportTokenExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.ExpiredImportTokenException,
    stack: String = null
  ): ExpiredImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredImportTokenException]
  }
}

