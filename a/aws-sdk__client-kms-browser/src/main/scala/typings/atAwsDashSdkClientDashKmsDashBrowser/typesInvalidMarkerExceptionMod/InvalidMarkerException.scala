package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidMarkerExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _InvalidMarkerExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidMarkerException,
    stack: String = null
  ): InvalidMarkerException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidMarkerException]
  }
}

