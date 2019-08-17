package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidAliasNameExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAliasNameException
  extends ServiceException[_InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidAliasNameException
}

object InvalidAliasNameException {
  @scala.inline
  def apply(
    details: _InvalidAliasNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidAliasNameException,
    stack: String = null
  ): InvalidAliasNameException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidAliasNameException]
  }
}

