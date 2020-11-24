package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2InstanceCounts extends js.Object {
  
  /**
    * Actual number of active instances in the fleet.
    */
  var ACTIVE: js.UndefOr[WholeNumber] = js.native
  
  /**
    * Ideal number of active instances in the fleet.
    */
  var DESIRED: js.UndefOr[WholeNumber] = js.native
  
  /**
    * Number of active instances in the fleet that are not currently hosting a game session.
    */
  var IDLE: js.UndefOr[WholeNumber] = js.native
  
  /**
    * The maximum value allowed for the fleet's instance count.
    */
  var MAXIMUM: js.UndefOr[WholeNumber] = js.native
  
  /**
    * The minimum value allowed for the fleet's instance count.
    */
  var MINIMUM: js.UndefOr[WholeNumber] = js.native
  
  /**
    * Number of instances in the fleet that are starting but not yet active.
    */
  var PENDING: js.UndefOr[WholeNumber] = js.native
  
  /**
    * Number of instances in the fleet that are no longer active but haven't yet been terminated.
    */
  var TERMINATING: js.UndefOr[WholeNumber] = js.native
}
object EC2InstanceCounts {
  
  @scala.inline
  def apply(): EC2InstanceCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceCounts]
  }
  
  @scala.inline
  implicit class EC2InstanceCountsOps[Self <: EC2InstanceCounts] (val x: Self) extends AnyVal {
    
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
    def setACTIVE(value: WholeNumber): Self = this.set("ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteACTIVE: Self = this.set("ACTIVE", js.undefined)
    
    @scala.inline
    def setDESIRED(value: WholeNumber): Self = this.set("DESIRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDESIRED: Self = this.set("DESIRED", js.undefined)
    
    @scala.inline
    def setIDLE(value: WholeNumber): Self = this.set("IDLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIDLE: Self = this.set("IDLE", js.undefined)
    
    @scala.inline
    def setMAXIMUM(value: WholeNumber): Self = this.set("MAXIMUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMAXIMUM: Self = this.set("MAXIMUM", js.undefined)
    
    @scala.inline
    def setMINIMUM(value: WholeNumber): Self = this.set("MINIMUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMINIMUM: Self = this.set("MINIMUM", js.undefined)
    
    @scala.inline
    def setPENDING(value: WholeNumber): Self = this.set("PENDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePENDING: Self = this.set("PENDING", js.undefined)
    
    @scala.inline
    def setTERMINATING(value: WholeNumber): Self = this.set("TERMINATING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTERMINATING: Self = this.set("TERMINATING", js.undefined)
  }
}
