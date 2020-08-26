package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.CHROMEUPDATE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CHROME_UPDATE
import typings.chromeApps.chromeAppsStrings.INSTALL
import typings.chromeApps.chromeAppsStrings.SHARED_MODULE_UPDATE
import typings.chromeApps.chromeAppsStrings.UPDATE
import typings.chromeApps.chromeAppsStrings.chrome_update_
import typings.chromeApps.chromeAppsStrings.install_
import typings.chromeApps.chromeAppsStrings.shared_module_update_
import typings.chromeApps.chromeAppsStrings.update_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledDetails extends js.Object {
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.native
  /**
    * The reason that this event is being dispatched.
    * @see enum OnInstalledReason
    */
  var reason: ToStringLiteral[
    CHROMEUPDATE, 
    /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
    Exclude[
      /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
      install_ | update_ | chrome_update_ | shared_module_update_
    ]
  ] = js.native
}

object InstalledDetails {
  @scala.inline
  def apply(
    reason: ToStringLiteral[
      CHROMEUPDATE, 
      /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
      Exclude[
        /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
        install_ | update_ | chrome_update_ | shared_module_update_
      ]
    ]
  ): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledDetails]
  }
  @scala.inline
  implicit class InstalledDetailsOps[Self <: InstalledDetails] (val x: Self) extends AnyVal {
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
    def setReason(
      value: ToStringLiteral[
          CHROMEUPDATE, 
          /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
          Exclude[
            /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
            install_ | update_ | chrome_update_ | shared_module_update_
          ]
        ]
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPreviousVersion(value: String): Self = this.set("previousVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousVersion: Self = this.set("previousVersion", js.undefined)
  }
  
}

