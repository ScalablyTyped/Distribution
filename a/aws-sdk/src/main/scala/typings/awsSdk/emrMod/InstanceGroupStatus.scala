package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupStatus extends StObject {
  
  /**
    * The current state of the instance group.
    */
  var State: js.UndefOr[InstanceGroupState] = js.undefined
  
  /**
    * The status change reason details for the instance group.
    */
  var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.undefined
  
  /**
    * The timeline of the instance group status over time.
    */
  var Timeline: js.UndefOr[InstanceGroupTimeline] = js.undefined
}
object InstanceGroupStatus {
  
  inline def apply(): InstanceGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupStatus]
  }
  
  extension [Self <: InstanceGroupStatus](x: Self) {
    
    inline def setState(value: InstanceGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: InstanceGroupStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTimeline(value: InstanceGroupTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
