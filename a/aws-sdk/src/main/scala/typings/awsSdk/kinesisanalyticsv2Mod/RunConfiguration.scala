package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunConfiguration extends js.Object {
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreConfiguration] = js.native
  /**
    * Describes the starting parameters for an Apache Flink-based Kinesis Data Analytics application.
    */
  var FlinkRunConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkRunConfiguration] = js.native
  /**
    * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
    */
  var SqlRunConfigurations: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlRunConfigurations] = js.native
}

object RunConfiguration {
  @scala.inline
  def apply(): RunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfiguration]
  }
  @scala.inline
  implicit class RunConfigurationOps[Self <: RunConfiguration] (val x: Self) extends AnyVal {
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
    def setApplicationRestoreConfiguration(value: ApplicationRestoreConfiguration): Self = this.set("ApplicationRestoreConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationRestoreConfiguration: Self = this.set("ApplicationRestoreConfiguration", js.undefined)
    @scala.inline
    def setFlinkRunConfiguration(value: FlinkRunConfiguration): Self = this.set("FlinkRunConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlinkRunConfiguration: Self = this.set("FlinkRunConfiguration", js.undefined)
    @scala.inline
    def setSqlRunConfigurationsVarargs(value: SqlRunConfiguration*): Self = this.set("SqlRunConfigurations", js.Array(value :_*))
    @scala.inline
    def setSqlRunConfigurations(value: SqlRunConfigurations): Self = this.set("SqlRunConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlRunConfigurations: Self = this.set("SqlRunConfigurations", js.undefined)
  }
  
}

