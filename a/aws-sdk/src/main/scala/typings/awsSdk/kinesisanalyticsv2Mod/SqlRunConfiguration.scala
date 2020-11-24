package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlRunConfiguration extends js.Object {
  
  /**
    * The input source ID. You can get this ID by calling the DescribeApplication operation. 
    */
  var InputId: Id = js.native
  
  /**
    * The point at which you want the application to start processing records from the streaming source. 
    */
  var InputStartingPositionConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration = js.native
}
object SqlRunConfiguration {
  
  @scala.inline
  def apply(InputId: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): SqlRunConfiguration = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlRunConfiguration]
  }
  
  @scala.inline
  implicit class SqlRunConfigurationOps[Self <: SqlRunConfiguration] (val x: Self) extends AnyVal {
    
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
    def setInputId(value: Id): Self = this.set("InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = this.set("InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
  }
}
