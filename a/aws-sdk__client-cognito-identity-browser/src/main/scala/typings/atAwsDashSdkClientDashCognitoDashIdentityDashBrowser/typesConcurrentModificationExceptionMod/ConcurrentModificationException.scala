package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesConcurrentModificationExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesSetIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrentModificationException
  extends ServiceException[_ConcurrentModificationExceptionDetails]
     with SetIdentityPoolRolesExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_ConcurrentModificationException: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.ConcurrentModificationException
}

object ConcurrentModificationException {
  @scala.inline
  def apply(
    details: _ConcurrentModificationExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.ConcurrentModificationException,
    stack: String = null
  ): ConcurrentModificationException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ConcurrentModificationException]
  }
}

