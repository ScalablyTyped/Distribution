package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationRestoreConfiguration extends js.Object {
  /**
    * Specifies how the application should be restored.
    */
  var ApplicationRestoreType: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreType = js.native
  /**
    * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
    */
  var SnapshotName: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName] = js.native
}

object ApplicationRestoreConfiguration {
  @scala.inline
  def apply(ApplicationRestoreType: ApplicationRestoreType, SnapshotName: SnapshotName = null): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    if (SnapshotName != null) __obj.updateDynamic("SnapshotName")(SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
}

