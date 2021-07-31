package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsernameConfigurationType extends StObject {
  
  /**
    * Specifies whether username case sensitivity will be applied for all users in the user pool through Cognito APIs. Valid values include:     True : Enables case sensitivity for all username input. When this option is set to True, users must sign in using the exact capitalization of their given username. For example, “UserName”. This is the default value.     False : Enables case insensitivity for all username input. For example, when this option is set to False, users will be able to sign in using either "username" or "Username". This option also enables both preferred_username and email alias to be case insensitive, in addition to the username attribute.  
    */
  var CaseSensitive: WrappedBooleanType
}
object UsernameConfigurationType {
  
  @scala.inline
  def apply(CaseSensitive: WrappedBooleanType): UsernameConfigurationType = {
    val __obj = js.Dynamic.literal(CaseSensitive = CaseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsernameConfigurationType]
  }
  
  @scala.inline
  implicit class UsernameConfigurationTypeMutableBuilder[Self <: UsernameConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: WrappedBooleanType): Self = StObject.set(x, "CaseSensitive", value.asInstanceOf[js.Any])
  }
}
