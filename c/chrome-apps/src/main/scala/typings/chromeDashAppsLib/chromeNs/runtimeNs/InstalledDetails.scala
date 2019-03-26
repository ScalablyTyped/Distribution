package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledDetails extends js.Object {
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The reason that this event is being dispatched.
    * @see enum OnInstalledReason
    */
  var reason: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CHROMEUPDATE, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.install | chromeDashAppsLib.chromeDashAppsLibStrings.update | chromeDashAppsLib.chromeDashAppsLibStrings.chrome_update | chromeDashAppsLib.chromeDashAppsLibStrings.shared_module_update
    ]
  ]
}

object InstalledDetails {
  @scala.inline
  def apply(
    reason: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CHROMEUPDATE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.install | chromeDashAppsLib.chromeDashAppsLibStrings.update | chromeDashAppsLib.chromeDashAppsLibStrings.chrome_update | chromeDashAppsLib.chromeDashAppsLibStrings.shared_module_update
      ]
    ],
    id: java.lang.String = null,
    previousVersion: java.lang.String = null
  ): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (previousVersion != null) __obj.updateDynamic("previousVersion")(previousVersion)
    __obj.asInstanceOf[InstalledDetails]
  }
}

