package typings.chromeApps.chrome.runtime

import typings.chromeApps.AnonCHROMEUPDATE
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

trait InstalledDetails extends js.Object {
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  /**
    * The reason that this event is being dispatched.
    * @see enum OnInstalledReason
    */
  var reason: ToStringLiteral[
    AnonCHROMEUPDATE, 
    INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
    Exclude[
      INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
      install_ | update_ | chrome_update_ | shared_module_update_
    ]
  ]
}

object InstalledDetails {
  @scala.inline
  def apply(
    reason: ToStringLiteral[
      AnonCHROMEUPDATE, 
      INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
      Exclude[
        INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
        install_ | update_ | chrome_update_ | shared_module_update_
      ]
    ],
    id: String = null,
    previousVersion: String = null
  ): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (previousVersion != null) __obj.updateDynamic("previousVersion")(previousVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledDetails]
  }
}

