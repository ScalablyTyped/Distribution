package typings.cordovaDashPluginDashMsDashAdal.Microsoft.ADAL

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
    val __obj = js.Dynamic.literal(displayableId = displayableId.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], identityProvider = identityProvider.asInstanceOf[js.Any], passwordChangeUrl = passwordChangeUrl.asInstanceOf[js.Any], passwordExpiresOn = passwordExpiresOn.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo]
  }
}

