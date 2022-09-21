package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLSTimestampRange extends StObject {
  
  /**
    * The end of the timestamp range for the requested media. This value must be within 24 hours of the specified StartTimestamp, and it must be later than the StartTimestamp value. If FragmentSelectorType for the request is SERVER_TIMESTAMP, this value must be in the past. The EndTimestamp value is required for ON_DEMAND mode, but optional for LIVE_REPLAY mode. If the EndTimestamp is not set for LIVE_REPLAY mode then the session will continue to include newly ingested fragments until the session expires.  This value is inclusive. The EndTimestamp is compared to the (starting) timestamp of the fragment. Fragments that start before the EndTimestamp value and continue past it are included in the session. 
    */
  var EndTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start of the timestamp range for the requested media. If the HLSTimestampRange value is specified, the StartTimestamp value is required.  Only fragments that start exactly at or after StartTimestamp are included in the session. Fragments that start before StartTimestamp and continue past it aren't included in the session. If FragmentSelectorType is SERVER_TIMESTAMP, the StartTimestamp must be later than the stream head. 
    */
  var StartTimestamp: js.UndefOr[js.Date] = js.undefined
}
object HLSTimestampRange {
  
  inline def apply(): HLSTimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLSTimestampRange]
  }
  
  extension [Self <: HLSTimestampRange](x: Self) {
    
    inline def setEndTimestamp(value: js.Date): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampUndefined: Self = StObject.set(x, "EndTimestamp", js.undefined)
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
  }
}
