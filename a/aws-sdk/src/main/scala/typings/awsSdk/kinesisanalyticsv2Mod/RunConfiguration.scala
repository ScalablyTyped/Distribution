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
  def apply(
    ApplicationRestoreConfiguration: ApplicationRestoreConfiguration = null,
    FlinkRunConfiguration: FlinkRunConfiguration = null,
    SqlRunConfigurations: SqlRunConfigurations = null
  ): RunConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ApplicationRestoreConfiguration != null) __obj.updateDynamic("ApplicationRestoreConfiguration")(ApplicationRestoreConfiguration.asInstanceOf[js.Any])
    if (FlinkRunConfiguration != null) __obj.updateDynamic("FlinkRunConfiguration")(FlinkRunConfiguration.asInstanceOf[js.Any])
    if (SqlRunConfigurations != null) __obj.updateDynamic("SqlRunConfigurations")(SqlRunConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunConfiguration]
  }
}

