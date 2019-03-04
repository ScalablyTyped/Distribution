package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554220.aspx
trait User extends js.Object {
  // { [providerName: string]: { userId: string, accessToken: string, accessTokenSecret?: string }; };
  var accessTokens: js.Any
     // { [providerName: string]: string; }
  var level: java.lang.String
  var mobileServiceAuthenticationToken: java.lang.String
   //for level:string use one of LevelEnum: 'admin','anonymous','authenticated'
  var userId: java.lang.String
  def getIdentities(): js.Any
}

object User {
  @scala.inline
  def apply(
    accessTokens: js.Any,
    getIdentities: js.Function0[js.Any],
    level: java.lang.String,
    mobileServiceAuthenticationToken: java.lang.String,
    userId: java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal(accessTokens = accessTokens, getIdentities = getIdentities, level = level, mobileServiceAuthenticationToken = mobileServiceAuthenticationToken, userId = userId)
  
    __obj.asInstanceOf[User]
  }
}

