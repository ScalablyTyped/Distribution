package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2InstanceCounts extends StObject {
  
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
  implicit class EC2InstanceCountsMutableBuilder[Self <: EC2InstanceCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACTIVE(value: WholeNumber): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACTIVEUndefined: Self = StObject.set(x, "ACTIVE", js.undefined)
    
    @scala.inline
    def setDESIRED(value: WholeNumber): Self = StObject.set(x, "DESIRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESIREDUndefined: Self = StObject.set(x, "DESIRED", js.undefined)
    
    @scala.inline
    def setIDLE(value: WholeNumber): Self = StObject.set(x, "IDLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDLEUndefined: Self = StObject.set(x, "IDLE", js.undefined)
    
    @scala.inline
    def setMAXIMUM(value: WholeNumber): Self = StObject.set(x, "MAXIMUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAXIMUMUndefined: Self = StObject.set(x, "MAXIMUM", js.undefined)
    
    @scala.inline
    def setMINIMUM(value: WholeNumber): Self = StObject.set(x, "MINIMUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMINIMUMUndefined: Self = StObject.set(x, "MINIMUM", js.undefined)
    
    @scala.inline
    def setPENDING(value: WholeNumber): Self = StObject.set(x, "PENDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPENDINGUndefined: Self = StObject.set(x, "PENDING", js.undefined)
    
    @scala.inline
    def setTERMINATING(value: WholeNumber): Self = StObject.set(x, "TERMINATING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTERMINATINGUndefined: Self = StObject.set(x, "TERMINATING", js.undefined)
  }
}
