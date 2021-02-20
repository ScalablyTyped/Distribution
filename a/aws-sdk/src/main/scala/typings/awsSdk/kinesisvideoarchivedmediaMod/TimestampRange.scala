package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestampRange extends StObject {
  
  /**
    * The ending timestamp in the range of timestamps for which to return fragments.
    */
  var EndTimestamp: Timestamp = js.native
  
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.
    */
  var StartTimestamp: Timestamp = js.native
}
object TimestampRange {
  
  @scala.inline
  def apply(EndTimestamp: Timestamp, StartTimestamp: Timestamp): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampRange]
  }
  
  @scala.inline
  implicit class TimestampRangeMutableBuilder[Self <: TimestampRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTimestamp(value: Timestamp): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: Timestamp): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
  }
}
