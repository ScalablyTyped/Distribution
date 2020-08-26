package typings.awsSdkClientCognitoIdentityBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperUserAlreadyRegisteredException
  extends ServiceException[DeveloperUserAlreadyRegisteredExceptionDetails]
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion {
  @JSName("name")
  var name_DeveloperUserAlreadyRegisteredException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException = js.native
}

object DeveloperUserAlreadyRegisteredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DeveloperUserAlreadyRegisteredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
  ): DeveloperUserAlreadyRegisteredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
  }
  @scala.inline
  implicit class DeveloperUserAlreadyRegisteredExceptionOps[Self <: DeveloperUserAlreadyRegisteredException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

