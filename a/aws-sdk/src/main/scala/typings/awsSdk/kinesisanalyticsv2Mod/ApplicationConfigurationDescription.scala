package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationConfigurationDescription extends js.Object {
  /**
    * The details about the application code for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationDescription] = js.native
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationDescription] = js.native
  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyDescriptions] = js.native
  /**
    * The details about a Java-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationDescription] = js.native
  /**
    * The details about the starting properties for a Kinesis Data Analytics application.
    */
  var RunConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RunConfigurationDescription] = js.native
  /**
    * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationDescription] = js.native
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescriptions] = js.native
}

object ApplicationConfigurationDescription {
  @scala.inline
  def apply(
    ApplicationCodeConfigurationDescription: ApplicationCodeConfigurationDescription = null,
    ApplicationSnapshotConfigurationDescription: ApplicationSnapshotConfigurationDescription = null,
    EnvironmentPropertyDescriptions: EnvironmentPropertyDescriptions = null,
    FlinkApplicationConfigurationDescription: FlinkApplicationConfigurationDescription = null,
    RunConfigurationDescription: RunConfigurationDescription = null,
    SqlApplicationConfigurationDescription: SqlApplicationConfigurationDescription = null,
    VpcConfigurationDescriptions: VpcConfigurationDescriptions = null
  ): ApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationCodeConfigurationDescription != null) __obj.updateDynamic("ApplicationCodeConfigurationDescription")(ApplicationCodeConfigurationDescription.asInstanceOf[js.Any])
    if (ApplicationSnapshotConfigurationDescription != null) __obj.updateDynamic("ApplicationSnapshotConfigurationDescription")(ApplicationSnapshotConfigurationDescription.asInstanceOf[js.Any])
    if (EnvironmentPropertyDescriptions != null) __obj.updateDynamic("EnvironmentPropertyDescriptions")(EnvironmentPropertyDescriptions.asInstanceOf[js.Any])
    if (FlinkApplicationConfigurationDescription != null) __obj.updateDynamic("FlinkApplicationConfigurationDescription")(FlinkApplicationConfigurationDescription.asInstanceOf[js.Any])
    if (RunConfigurationDescription != null) __obj.updateDynamic("RunConfigurationDescription")(RunConfigurationDescription.asInstanceOf[js.Any])
    if (SqlApplicationConfigurationDescription != null) __obj.updateDynamic("SqlApplicationConfigurationDescription")(SqlApplicationConfigurationDescription.asInstanceOf[js.Any])
    if (VpcConfigurationDescriptions != null) __obj.updateDynamic("VpcConfigurationDescriptions")(VpcConfigurationDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfigurationDescription]
  }
}

