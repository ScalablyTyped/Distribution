package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotCapacityRebalance extends js.Object {
  
  /**
    * The replacement strategy to use. Only available for fleets of type maintain. You must specify a value, otherwise you get an error. To allow Spot Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for a Spot Instance in the fleet, specify launch.  When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You can terminate it, or you can leave it running. You are charged for all instances while they are running. 
    */
  var ReplacementStrategy: js.UndefOr[typings.awsSdk.ec2Mod.ReplacementStrategy] = js.native
}
object SpotCapacityRebalance {
  
  @scala.inline
  def apply(): SpotCapacityRebalance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotCapacityRebalance]
  }
  
  @scala.inline
  implicit class SpotCapacityRebalanceOps[Self <: SpotCapacityRebalance] (val x: Self) extends AnyVal {
    
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
    def setReplacementStrategy(value: ReplacementStrategy): Self = this.set("ReplacementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementStrategy: Self = this.set("ReplacementStrategy", js.undefined)
  }
}
