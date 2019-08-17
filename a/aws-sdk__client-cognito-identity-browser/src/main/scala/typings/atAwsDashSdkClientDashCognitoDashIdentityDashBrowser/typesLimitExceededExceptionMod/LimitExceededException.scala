package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesCreateIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[_LimitExceededExceptionDetails]
     with CreateIdentityPoolExceptionsUnion
     with GetIdExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    details: _LimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[LimitExceededException]
  }
}

