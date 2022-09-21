package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipTimestampRange extends StObject {
  
  /**
    * The end of the timestamp range for the requested media. This value must be within 24 hours of the specified StartTimestamp, and it must be later than the StartTimestamp value. If FragmentSelectorType for the request is SERVER_TIMESTAMP, this value must be in the past.  This value is inclusive. The EndTimestamp is compared to the (starting) timestamp of the fragment. Fragments that start before the EndTimestamp value and continue past it are included in the session. 
    */
  var EndTimestamp: js.Date
  
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.  Only fragments that start exactly at or after StartTimestamp are included in the session. Fragments that start before StartTimestamp and continue past it aren't included in the session. If FragmentSelectorType is SERVER_TIMESTAMP, the StartTimestamp must be later than the stream head. 
    */
  var StartTimestamp: js.Date
}
object ClipTimestampRange {
  
  inline def apply(EndTimestamp: js.Date, StartTimestamp: js.Date): ClipTimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipTimestampRange]
  }
  
  extension [Self <: ClipTimestampRange](x: Self) {
    
    inline def setEndTimestamp(value: js.Date): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
  }
}
