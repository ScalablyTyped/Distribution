package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlinkRunConfiguration extends js.Object {
  
  /**
    * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. This will happen if the program is updated between snapshots to remove stateful parameters, and state data in the snapshot no longer corresponds to valid application data. For more information, see  Allowing Non-Restored State in the Apache Flink documentation.  This value defaults to false. If you update your application without specifying this parameter, AllowNonRestoredState will be set to false, even if it was previously set to true. 
    */
  var AllowNonRestoredState: js.UndefOr[BooleanObject] = js.native
}
object FlinkRunConfiguration {
  
  @scala.inline
  def apply(): FlinkRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkRunConfiguration]
  }
  
  @scala.inline
  implicit class FlinkRunConfigurationOps[Self <: FlinkRunConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowNonRestoredState(value: BooleanObject): Self = this.set("AllowNonRestoredState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNonRestoredState: Self = this.set("AllowNonRestoredState", js.undefined)
  }
}
