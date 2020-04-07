package typings.awsSdkClientCognitoIdentityBrowser.typesConcurrentModificationExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrentModificationException
  extends ServiceException[ConcurrentModificationExceptionDetails]
     with SetIdentityPoolRolesExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_ConcurrentModificationException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
}

object ConcurrentModificationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ConcurrentModificationExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException,
    stack: String = null
  ): ConcurrentModificationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcurrentModificationException]
  }
}

