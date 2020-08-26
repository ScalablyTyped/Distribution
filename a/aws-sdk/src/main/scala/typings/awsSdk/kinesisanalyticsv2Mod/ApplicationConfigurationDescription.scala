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
  def apply(): ApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationDescription]
  }
  @scala.inline
  implicit class ApplicationConfigurationDescriptionOps[Self <: ApplicationConfigurationDescription] (val x: Self) extends AnyVal {
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
    def setApplicationCodeConfigurationDescription(value: ApplicationCodeConfigurationDescription): Self = this.set("ApplicationCodeConfigurationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationCodeConfigurationDescription: Self = this.set("ApplicationCodeConfigurationDescription", js.undefined)
    @scala.inline
    def setApplicationSnapshotConfigurationDescription(value: ApplicationSnapshotConfigurationDescription): Self = this.set("ApplicationSnapshotConfigurationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationSnapshotConfigurationDescription: Self = this.set("ApplicationSnapshotConfigurationDescription", js.undefined)
    @scala.inline
    def setEnvironmentPropertyDescriptions(value: EnvironmentPropertyDescriptions): Self = this.set("EnvironmentPropertyDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentPropertyDescriptions: Self = this.set("EnvironmentPropertyDescriptions", js.undefined)
    @scala.inline
    def setFlinkApplicationConfigurationDescription(value: FlinkApplicationConfigurationDescription): Self = this.set("FlinkApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlinkApplicationConfigurationDescription: Self = this.set("FlinkApplicationConfigurationDescription", js.undefined)
    @scala.inline
    def setRunConfigurationDescription(value: RunConfigurationDescription): Self = this.set("RunConfigurationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunConfigurationDescription: Self = this.set("RunConfigurationDescription", js.undefined)
    @scala.inline
    def setSqlApplicationConfigurationDescription(value: SqlApplicationConfigurationDescription): Self = this.set("SqlApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlApplicationConfigurationDescription: Self = this.set("SqlApplicationConfigurationDescription", js.undefined)
    @scala.inline
    def setVpcConfigurationDescriptionsVarargs(value: VpcConfigurationDescription*): Self = this.set("VpcConfigurationDescriptions", js.Array(value :_*))
    @scala.inline
    def setVpcConfigurationDescriptions(value: VpcConfigurationDescriptions): Self = this.set("VpcConfigurationDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfigurationDescriptions: Self = this.set("VpcConfigurationDescriptions", js.undefined)
  }
  
}

