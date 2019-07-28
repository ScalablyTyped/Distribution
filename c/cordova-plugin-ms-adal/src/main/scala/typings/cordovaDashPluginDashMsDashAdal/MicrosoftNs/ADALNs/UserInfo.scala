package typings.cordovaDashPluginDashMsDashAdal.MicrosoftNs.ADALNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var displayableId: String
  var familyName: String
  var givenName: String
  var identityProvider: String
  var passwordChangeUrl: String
  var passwordExpiresOn: Date
  var uniqueId: String
  var userId: String
}

object UserInfo {
  @scala.inline
  def apply(
    displayableId: String,
    familyName: String,
    givenName: String,
    identityProvider: String,
    passwordChangeUrl: String,
    passwordExpiresOn: Date,
    uniqueId: String,
    userId: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayableId = displayableId, familyName = familyName, givenName = givenName, identityProvider = identityProvider, passwordChangeUrl = passwordChangeUrl, passwordExpiresOn = passwordExpiresOn, uniqueId = uniqueId, userId = userId)
  
    __obj.asInstanceOf[UserInfo]
  }
}

