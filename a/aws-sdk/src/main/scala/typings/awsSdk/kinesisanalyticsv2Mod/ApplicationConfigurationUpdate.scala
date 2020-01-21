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
  def apply(
    ApplicationCodeConfigurationUpdate: ApplicationCodeConfigurationUpdate = null,
    ApplicationSnapshotConfigurationUpdate: ApplicationSnapshotConfigurationUpdate = null,
    EnvironmentPropertyUpdates: EnvironmentPropertyUpdates = null,
    FlinkApplicationConfigurationUpdate: FlinkApplicationConfigurationUpdate = null,
    SqlApplicationConfigurationUpdate: SqlApplicationConfigurationUpdate = null,
    VpcConfigurationUpdates: VpcConfigurationUpdates = null
  ): ApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ApplicationCodeConfigurationUpdate != null) __obj.updateDynamic("ApplicationCodeConfigurationUpdate")(ApplicationCodeConfigurationUpdate.asInstanceOf[js.Any])
    if (ApplicationSnapshotConfigurationUpdate != null) __obj.updateDynamic("ApplicationSnapshotConfigurationUpdate")(ApplicationSnapshotConfigurationUpdate.asInstanceOf[js.Any])
    if (EnvironmentPropertyUpdates != null) __obj.updateDynamic("EnvironmentPropertyUpdates")(EnvironmentPropertyUpdates.asInstanceOf[js.Any])
    if (FlinkApplicationConfigurationUpdate != null) __obj.updateDynamic("FlinkApplicationConfigurationUpdate")(FlinkApplicationConfigurationUpdate.asInstanceOf[js.Any])
    if (SqlApplicationConfigurationUpdate != null) __obj.updateDynamic("SqlApplicationConfigurationUpdate")(SqlApplicationConfigurationUpdate.asInstanceOf[js.Any])
    if (VpcConfigurationUpdates != null) __obj.updateDynamic("VpcConfigurationUpdates")(VpcConfigurationUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfigurationUpdate]
  }
}

