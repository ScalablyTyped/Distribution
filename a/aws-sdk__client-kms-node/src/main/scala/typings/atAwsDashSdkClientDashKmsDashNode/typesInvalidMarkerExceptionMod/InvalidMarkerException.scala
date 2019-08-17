package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidMarkerExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesListAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
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
  var name_InvalidMarkerException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidMarkerException
}

object InvalidMarkerException {
  @scala.inline
  def apply(
    details: _InvalidMarkerExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidMarkerException,
    stack: String = null
  ): InvalidMarkerException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidMarkerException]
  }
}

