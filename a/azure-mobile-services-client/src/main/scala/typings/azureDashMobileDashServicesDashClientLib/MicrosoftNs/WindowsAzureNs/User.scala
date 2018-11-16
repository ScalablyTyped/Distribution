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

