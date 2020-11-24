package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunConfigurationUpdate extends js.Object {
  
  /**
    * Describes updates to the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreConfiguration] = js.native
  
  /**
    * Describes the starting parameters for a Flink-based Kinesis Data Analytics application.
    */
  var FlinkRunConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkRunConfiguration] = js.native
}
object RunConfigurationUpdate {
  
  @scala.inline
  def apply(): RunConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfigurationUpdate]
  }
  
  @scala.inline
  implicit class RunConfigurationUpdateOps[Self <: RunConfigurationUpdate] (val x: Self) extends AnyVal {
    
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
  }
}
