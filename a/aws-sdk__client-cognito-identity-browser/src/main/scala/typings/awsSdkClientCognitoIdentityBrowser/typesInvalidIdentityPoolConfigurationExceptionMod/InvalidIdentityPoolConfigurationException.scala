package typings.awsSdkClientCognitoIdentityBrowser.typesInvalidIdentityPoolConfigurationExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidIdentityPoolConfigurationException
  extends ServiceException[InvalidIdentityPoolConfigurationExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion {
  @JSName("name")
  var name_InvalidIdentityPoolConfigurationException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
}

object InvalidIdentityPoolConfigurationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidIdentityPoolConfigurationExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException,
    stack: String = null
  ): InvalidIdentityPoolConfigurationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
  }
}

