package typings.awsSdkClientCognitoIdentityBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperUserAlreadyRegisteredException
  extends ServiceException[DeveloperUserAlreadyRegisteredExceptionDetails]
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion {
  @JSName("name")
  var name_DeveloperUserAlreadyRegisteredException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
}

object DeveloperUserAlreadyRegisteredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DeveloperUserAlreadyRegisteredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException,
    stack: String = null
  ): DeveloperUserAlreadyRegisteredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
  }
}

