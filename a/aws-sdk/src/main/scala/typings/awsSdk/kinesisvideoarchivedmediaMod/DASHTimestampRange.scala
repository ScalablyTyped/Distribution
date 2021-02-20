package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DASHTimestampRange extends StObject {
  
  /**
    * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified StartTimestamp, and it must be later than the StartTimestamp value. If FragmentSelectorType for the request is SERVER_TIMESTAMP, this value must be in the past. The EndTimestamp value is required for ON_DEMAND mode, but optional for LIVE_REPLAY mode. If the EndTimestamp is not set for LIVE_REPLAY mode then the session will continue to include newly ingested fragments until the session expires.  This value is inclusive. The EndTimestamp is compared to the (starting) timestamp of the fragment. Fragments that start before the EndTimestamp value and continue past it are included in the session. 
    */
  var EndTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The start of the timestamp range for the requested media. If the DASHTimestampRange value is specified, the StartTimestamp value is required.  This value is inclusive. Fragments that start before the StartTimestamp and continue past it are included in the session. If FragmentSelectorType is SERVER_TIMESTAMP, the StartTimestamp must be later than the stream head. 
    */
  var StartTimestamp: js.UndefOr[Timestamp] = js.native
}
object DASHTimestampRange {
  
  @scala.inline
  def apply(): DASHTimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DASHTimestampRange]
  }
  
  @scala.inline
  implicit class DASHTimestampRangeMutableBuilder[Self <: DASHTimestampRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTimestamp(value: Timestamp): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimestampUndefined: Self = StObject.set(x, "EndTimestamp", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: Timestamp): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
  }
}
