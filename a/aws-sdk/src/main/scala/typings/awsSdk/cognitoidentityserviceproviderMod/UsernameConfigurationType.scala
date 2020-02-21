package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsernameConfigurationType extends js.Object {
  /**
    * Specifies whether username case sensitivity will be applied for all users in the user pool through Cognito APIs. Valid values include:     True : Enables case sensitivity for all username input. When this option is set to True, users must sign in using the exact capitalization of their given username. For example, “UserName”. This is the default value.     False : Enables case insensitivity for all username input. For example, when this option is set to False, users will be able to sign in using either "username" or "Username". This option also enables both preferred_username and email alias to be case insensitive, in addition to the username attribute.  
    */
  var CaseSensitive: WrappedBooleanType = js.native
}

object UsernameConfigurationType {
  @scala.inline
  def apply(CaseSensitive: WrappedBooleanType): UsernameConfigurationType = {
    val __obj = js.Dynamic.literal(CaseSensitive = CaseSensitive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsernameConfigurationType]
  }
}

