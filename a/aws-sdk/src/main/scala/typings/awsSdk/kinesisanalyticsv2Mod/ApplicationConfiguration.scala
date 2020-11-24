package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationConfiguration extends js.Object {
  
  /**
    * The code location and type parameters for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfiguration = js.native
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfiguration] = js.native
  
  /**
    * Describes execution properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentProperties: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.EnvironmentProperties] = js.native
  
  /**
    * The creation and update parameters for a Flink-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfiguration] = js.native
  
  /**
    * The creation and update parameters for a SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfiguration] = js.native
  
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurations: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurations] = js.native
}
object ApplicationConfiguration {
  
  @scala.inline
  def apply(ApplicationCodeConfiguration: ApplicationCodeConfiguration): ApplicationConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationCodeConfiguration = ApplicationCodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationConfigurationOps[Self <: ApplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setApplicationCodeConfiguration(value: ApplicationCodeConfiguration): Self = this.set("ApplicationCodeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSnapshotConfiguration(value: ApplicationSnapshotConfiguration): Self = this.set("ApplicationSnapshotConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationSnapshotConfiguration: Self = this.set("ApplicationSnapshotConfiguration", js.undefined)
    
    @scala.inline
    def setEnvironmentProperties(value: EnvironmentProperties): Self = this.set("EnvironmentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentProperties: Self = this.set("EnvironmentProperties", js.undefined)
    
    @scala.inline
    def setFlinkApplicationConfiguration(value: FlinkApplicationConfiguration): Self = this.set("FlinkApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlinkApplicationConfiguration: Self = this.set("FlinkApplicationConfiguration", js.undefined)
    
    @scala.inline
    def setSqlApplicationConfiguration(value: SqlApplicationConfiguration): Self = this.set("SqlApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlApplicationConfiguration: Self = this.set("SqlApplicationConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfigurationsVarargs(value: VpcConfiguration*): Self = this.set("VpcConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setVpcConfigurations(value: VpcConfigurations): Self = this.set("VpcConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfigurations: Self = this.set("VpcConfigurations", js.undefined)
  }
}
