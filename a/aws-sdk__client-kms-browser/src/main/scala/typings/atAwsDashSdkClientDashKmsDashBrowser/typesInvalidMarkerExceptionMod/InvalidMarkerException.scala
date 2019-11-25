package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidMarkerExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMarkerException
  extends ServiceException[_InvalidMarkerExceptionDetails]
     with ListAliasesExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeysExceptionsUnion
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion {
  @JSName("name")
  var name_InvalidMarkerException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidMarkerException
}

object InvalidMarkerException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidMarkerExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidMarkerException,
    stack: String = null
  ): InvalidMarkerException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMarkerException]
  }
}

