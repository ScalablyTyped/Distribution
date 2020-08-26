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
  def apply(ApplicationRestoreType: ApplicationRestoreType): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
  @scala.inline
  implicit class ApplicationRestoreConfigurationOps[Self <: ApplicationRestoreConfiguration] (val x: Self) extends AnyVal {
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
    def setApplicationRestoreType(value: ApplicationRestoreType): Self = this.set("ApplicationRestoreType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotName: Self = this.set("SnapshotName", js.undefined)
  }
  
}

