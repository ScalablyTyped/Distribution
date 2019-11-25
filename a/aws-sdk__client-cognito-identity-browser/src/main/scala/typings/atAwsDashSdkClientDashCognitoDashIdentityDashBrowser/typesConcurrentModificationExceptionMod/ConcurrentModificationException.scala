package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesConcurrentModificationExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesSetIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _ConcurrentModificationExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.ConcurrentModificationException,
    stack: String = null
  ): ConcurrentModificationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcurrentModificationException]
  }
}

