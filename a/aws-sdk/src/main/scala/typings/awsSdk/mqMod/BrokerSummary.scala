package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.native
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.native
  
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typings.awsSdk.mqMod.BrokerState] = js.native
  
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsSdk.mqMod.DeploymentMode] = js.native
  
  /**
    * Required. The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
}
object BrokerSummary {
  
  @scala.inline
  def apply(): BrokerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSummary]
  }
  
  @scala.inline
  implicit class BrokerSummaryOps[Self <: BrokerSummary] (val x: Self) extends AnyVal {
    
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
    def setBrokerArn(value: string): Self = this.set("BrokerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerArn: Self = this.set("BrokerArn", js.undefined)
    
    @scala.inline
    def setBrokerId(value: string): Self = this.set("BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerId: Self = this.set("BrokerId", js.undefined)
    
    @scala.inline
    def setBrokerName(value: string): Self = this.set("BrokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerName: Self = this.set("BrokerName", js.undefined)
    
    @scala.inline
    def setBrokerState(value: BrokerState): Self = this.set("BrokerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerState: Self = this.set("BrokerState", js.undefined)
    
    @scala.inline
    def setCreated(value: timestampIso8601): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    
    @scala.inline
    def setDeploymentMode(value: DeploymentMode): Self = this.set("DeploymentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentMode: Self = this.set("DeploymentMode", js.undefined)
    
    @scala.inline
    def setEngineType(value: EngineType): Self = this.set("EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineType: Self = this.set("EngineType", js.undefined)
    
    @scala.inline
    def setHostInstanceType(value: string): Self = this.set("HostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostInstanceType: Self = this.set("HostInstanceType", js.undefined)
  }
}
