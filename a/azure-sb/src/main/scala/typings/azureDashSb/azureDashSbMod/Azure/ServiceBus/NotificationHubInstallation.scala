package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import org.scalablytyped.runtime.StringDictionary
import typings.azureDashSb.Anon_Body
import typings.azureDashSb.Anon_PushChannel
import typings.azureDashSb.azureDashSbStrings.adm
import typings.azureDashSb.azureDashSbStrings.apns
import typings.azureDashSb.azureDashSbStrings.gcm
import typings.azureDashSb.azureDashSbStrings.mpns
import typings.azureDashSb.azureDashSbStrings.wns
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
  var secondaryTile: js.UndefOr[StringDictionary[Anon_PushChannel]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var templates: js.UndefOr[StringDictionary[Anon_Body]] = js.undefined
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
    secondaryTile: StringDictionary[Anon_PushChannel] = null,
    tags: js.Array[String] = null,
    templates: StringDictionary[Anon_Body] = null
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

