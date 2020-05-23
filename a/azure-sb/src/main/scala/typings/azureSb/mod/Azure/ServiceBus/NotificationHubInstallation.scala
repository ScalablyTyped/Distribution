package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StringDictionary
import typings.azureSb.anon.Body
import typings.azureSb.anon.PushChannel
import typings.azureSb.azureSbStrings.adm
import typings.azureSb.azureSbStrings.apns
import typings.azureSb.azureSbStrings.gcm
import typings.azureSb.azureSbStrings.mpns
import typings.azureSb.azureSbStrings.wns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHubInstallation extends js.Object {
  val expirationTime: js.UndefOr[String] = js.undefined
  val expiredPushChannel: js.UndefOr[String] = js.undefined
  var installationId: String
  val lastActiveOn: js.UndefOr[String] = js.undefined
  val lastUpdate: js.UndefOr[String] = js.undefined
  var platform: apns | wns | mpns | adm | gcm
  var pushChannel: String
  var secondaryTile: js.UndefOr[StringDictionary[PushChannel]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var templates: js.UndefOr[StringDictionary[Body]] = js.undefined
}

object NotificationHubInstallation {
  @scala.inline
  def apply(
    installationId: String,
    platform: apns | wns | mpns | adm | gcm,
    pushChannel: String,
    expirationTime: String = null,
    expiredPushChannel: String = null,
    lastActiveOn: String = null,
    lastUpdate: String = null,
    secondaryTile: StringDictionary[PushChannel] = null,
    tags: js.Array[String] = null,
    templates: StringDictionary[Body] = null
  ): NotificationHubInstallation = {
    val __obj = js.Dynamic.literal(installationId = installationId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pushChannel = pushChannel.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (expiredPushChannel != null) __obj.updateDynamic("expiredPushChannel")(expiredPushChannel.asInstanceOf[js.Any])
    if (lastActiveOn != null) __obj.updateDynamic("lastActiveOn")(lastActiveOn.asInstanceOf[js.Any])
    if (lastUpdate != null) __obj.updateDynamic("lastUpdate")(lastUpdate.asInstanceOf[js.Any])
    if (secondaryTile != null) __obj.updateDynamic("secondaryTile")(secondaryTile.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubInstallation]
  }
}

