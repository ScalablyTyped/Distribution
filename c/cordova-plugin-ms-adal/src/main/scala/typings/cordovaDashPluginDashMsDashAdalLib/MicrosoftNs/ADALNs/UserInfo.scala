package typings
package cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var displayableId: java.lang.String
  var familyName: java.lang.String
  var givenName: java.lang.String
  var identityProvider: java.lang.String
  var passwordChangeUrl: java.lang.String
  var passwordExpiresOn: stdLib.Date
  var uniqueId: java.lang.String
  var userId: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(
    displayableId: java.lang.String,
    familyName: java.lang.String,
    givenName: java.lang.String,
    identityProvider: java.lang.String,
    passwordChangeUrl: java.lang.String,
    passwordExpiresOn: stdLib.Date,
    uniqueId: java.lang.String,
    userId: java.lang.String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayableId = displayableId, familyName = familyName, givenName = givenName, identityProvider = identityProvider, passwordChangeUrl = passwordChangeUrl, passwordExpiresOn = passwordExpiresOn, uniqueId = uniqueId, userId = userId)
  
    __obj.asInstanceOf[UserInfo]
  }
}

