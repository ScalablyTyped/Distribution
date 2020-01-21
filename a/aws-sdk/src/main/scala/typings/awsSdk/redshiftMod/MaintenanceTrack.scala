package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceTrack extends js.Object {
  /**
    * The version number for the cluster release.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  /**
    * The name of the maintenance track. Possible values are current and trailing.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * An array of UpdateTarget objects to update with the maintenance track. 
    */
  var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.native
}

object MaintenanceTrack {
  @scala.inline
  def apply(
    DatabaseVersion: String = null,
    MaintenanceTrackName: String = null,
    UpdateTargets: EligibleTracksToUpdateList = null
  ): MaintenanceTrack = {
    val __obj = js.Dynamic.literal()
    if (DatabaseVersion != null) __obj.updateDynamic("DatabaseVersion")(DatabaseVersion.asInstanceOf[js.Any])
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName.asInstanceOf[js.Any])
    if (UpdateTargets != null) __obj.updateDynamic("UpdateTargets")(UpdateTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceTrack]
  }
}

