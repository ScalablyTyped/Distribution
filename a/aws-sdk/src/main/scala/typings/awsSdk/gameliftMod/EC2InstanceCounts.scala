package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2InstanceCounts extends StObject {
  
  /**
    * Actual number of active instances in the fleet.
    */
  var ACTIVE: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * Ideal number of active instances in the fleet.
    */
  var DESIRED: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * Number of active instances in the fleet that are not currently hosting a game session.
    */
  var IDLE: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The maximum value allowed for the fleet's instance count.
    */
  var MAXIMUM: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The minimum value allowed for the fleet's instance count.
    */
  var MINIMUM: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * Number of instances in the fleet that are starting but not yet active.
    */
  var PENDING: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * Number of instances in the fleet that are no longer active but haven't yet been terminated.
    */
  var TERMINATING: js.UndefOr[WholeNumber] = js.undefined
}
object EC2InstanceCounts {
  
  inline def apply(): EC2InstanceCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceCounts]
  }
  
  extension [Self <: EC2InstanceCounts](x: Self) {
    
    inline def setACTIVE(value: WholeNumber): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    
    inline def setACTIVEUndefined: Self = StObject.set(x, "ACTIVE", js.undefined)
    
    inline def setDESIRED(value: WholeNumber): Self = StObject.set(x, "DESIRED", value.asInstanceOf[js.Any])
    
    inline def setDESIREDUndefined: Self = StObject.set(x, "DESIRED", js.undefined)
    
    inline def setIDLE(value: WholeNumber): Self = StObject.set(x, "IDLE", value.asInstanceOf[js.Any])
    
    inline def setIDLEUndefined: Self = StObject.set(x, "IDLE", js.undefined)
    
    inline def setMAXIMUM(value: WholeNumber): Self = StObject.set(x, "MAXIMUM", value.asInstanceOf[js.Any])
    
    inline def setMAXIMUMUndefined: Self = StObject.set(x, "MAXIMUM", js.undefined)
    
    inline def setMINIMUM(value: WholeNumber): Self = StObject.set(x, "MINIMUM", value.asInstanceOf[js.Any])
    
    inline def setMINIMUMUndefined: Self = StObject.set(x, "MINIMUM", js.undefined)
    
    inline def setPENDING(value: WholeNumber): Self = StObject.set(x, "PENDING", value.asInstanceOf[js.Any])
    
    inline def setPENDINGUndefined: Self = StObject.set(x, "PENDING", js.undefined)
    
    inline def setTERMINATING(value: WholeNumber): Self = StObject.set(x, "TERMINATING", value.asInstanceOf[js.Any])
    
    inline def setTERMINATINGUndefined: Self = StObject.set(x, "TERMINATING", js.undefined)
  }
}
