package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationConfigurationUpdate extends js.Object {
  /**
    * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
    */
  var ApplicationCodeConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationUpdate] = js.native
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationUpdate] = js.native
  /**
    * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyUpdates] = js.native
  /**
    * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
    */
  var FlinkApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationUpdate] = js.native
  /**
    * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
    */
  var SqlApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationUpdate] = js.native
  /**
    * Updates to the array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdates] = js.native
}

object ApplicationConfigurationUpdate {
  @scala.inline
  def apply(): ApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationUpdate]
  }
  @scala.inline
  implicit class ApplicationConfigurationUpdateOps[Self <: ApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
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
    def setApplicationCodeConfigurationUpdate(value: ApplicationCodeConfigurationUpdate): Self = this.set("ApplicationCodeConfigurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationCodeConfigurationUpdate: Self = this.set("ApplicationCodeConfigurationUpdate", js.undefined)
    @scala.inline
    def setApplicationSnapshotConfigurationUpdate(value: ApplicationSnapshotConfigurationUpdate): Self = this.set("ApplicationSnapshotConfigurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationSnapshotConfigurationUpdate: Self = this.set("ApplicationSnapshotConfigurationUpdate", js.undefined)
    @scala.inline
    def setEnvironmentPropertyUpdates(value: EnvironmentPropertyUpdates): Self = this.set("EnvironmentPropertyUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentPropertyUpdates: Self = this.set("EnvironmentPropertyUpdates", js.undefined)
    @scala.inline
    def setFlinkApplicationConfigurationUpdate(value: FlinkApplicationConfigurationUpdate): Self = this.set("FlinkApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlinkApplicationConfigurationUpdate: Self = this.set("FlinkApplicationConfigurationUpdate", js.undefined)
    @scala.inline
    def setSqlApplicationConfigurationUpdate(value: SqlApplicationConfigurationUpdate): Self = this.set("SqlApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlApplicationConfigurationUpdate: Self = this.set("SqlApplicationConfigurationUpdate", js.undefined)
    @scala.inline
    def setVpcConfigurationUpdatesVarargs(value: VpcConfigurationUpdate*): Self = this.set("VpcConfigurationUpdates", js.Array(value :_*))
    @scala.inline
    def setVpcConfigurationUpdates(value: VpcConfigurationUpdates): Self = this.set("VpcConfigurationUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfigurationUpdates: Self = this.set("VpcConfigurationUpdates", js.undefined)
  }
  
}

