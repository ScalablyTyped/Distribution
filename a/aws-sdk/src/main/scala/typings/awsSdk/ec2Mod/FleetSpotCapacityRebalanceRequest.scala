package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetSpotCapacityRebalanceRequest extends js.Object {
  
  /**
    * The replacement strategy to use. Only available for fleets of type maintain. To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for an existing Spot Instance in the fleet, specify launch. You must specify a value, otherwise you get an error.  When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You can terminate it, or you can leave it running. You are charged for all instances while they are running. 
    */
  var ReplacementStrategy: js.UndefOr[FleetReplacementStrategy] = js.native
}
object FleetSpotCapacityRebalanceRequest {
  
  @scala.inline
  def apply(): FleetSpotCapacityRebalanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotCapacityRebalanceRequest]
  }
  
  @scala.inline
  implicit class FleetSpotCapacityRebalanceRequestOps[Self <: FleetSpotCapacityRebalanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplacementStrategy(value: FleetReplacementStrategy): Self = this.set("ReplacementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementStrategy: Self = this.set("ReplacementStrategy", js.undefined)
  }
}
