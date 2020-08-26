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

@js.native
trait NotificationHubInstallation extends js.Object {
  val expirationTime: js.UndefOr[String] = js.native
  val expiredPushChannel: js.UndefOr[String] = js.native
  var installationId: String = js.native
  val lastActiveOn: js.UndefOr[String] = js.native
  val lastUpdate: js.UndefOr[String] = js.native
  var platform: apns | wns | mpns | adm | gcm = js.native
  var pushChannel: String = js.native
  var secondaryTile: js.UndefOr[StringDictionary[PushChannel]] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var templates: js.UndefOr[StringDictionary[Body]] = js.native
}

object NotificationHubInstallation {
  @scala.inline
  def apply(installationId: String, platform: apns | wns | mpns | adm | gcm, pushChannel: String): NotificationHubInstallation = {
    val __obj = js.Dynamic.literal(installationId = installationId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pushChannel = pushChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubInstallation]
  }
  @scala.inline
  implicit class NotificationHubInstallationOps[Self <: NotificationHubInstallation] (val x: Self) extends AnyVal {
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
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: apns | wns | mpns | adm | gcm): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushChannel(value: String): Self = this.set("pushChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setExpiredPushChannel(value: String): Self = this.set("expiredPushChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiredPushChannel: Self = this.set("expiredPushChannel", js.undefined)
    @scala.inline
    def setLastActiveOn(value: String): Self = this.set("lastActiveOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastActiveOn: Self = this.set("lastActiveOn", js.undefined)
    @scala.inline
    def setLastUpdate(value: String): Self = this.set("lastUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdate: Self = this.set("lastUpdate", js.undefined)
    @scala.inline
    def setSecondaryTile(value: StringDictionary[PushChannel]): Self = this.set("secondaryTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryTile: Self = this.set("secondaryTile", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplates(value: StringDictionary[Body]): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
  
}

