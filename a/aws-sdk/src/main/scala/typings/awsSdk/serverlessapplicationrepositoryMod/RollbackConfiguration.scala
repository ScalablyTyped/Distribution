package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackConfiguration extends js.Object {
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var MonitoringTimeInMinutes: js.UndefOr[integer] = js.native
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var RollbackTriggers: js.UndefOr[listOfRollbackTrigger] = js.native
}
object RollbackConfiguration {
  
  @scala.inline
  def apply(): RollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfiguration]
  }
  
  @scala.inline
  implicit class RollbackConfigurationOps[Self <: RollbackConfiguration] (val x: Self) extends AnyVal {
    
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
    def setMonitoringTimeInMinutes(value: integer): Self = this.set("MonitoringTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringTimeInMinutes: Self = this.set("MonitoringTimeInMinutes", js.undefined)
    
    @scala.inline
    def setRollbackTriggersVarargs(value: RollbackTrigger*): Self = this.set("RollbackTriggers", js.Array(value :_*))
    
    @scala.inline
    def setRollbackTriggers(value: listOfRollbackTrigger): Self = this.set("RollbackTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackTriggers: Self = this.set("RollbackTriggers", js.undefined)
  }
}
