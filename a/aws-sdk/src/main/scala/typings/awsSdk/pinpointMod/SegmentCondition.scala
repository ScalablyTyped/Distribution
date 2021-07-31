package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentCondition extends StObject {
  
  /**
    * The unique identifier for the segment to associate with the activity.
    */
  var SegmentId: string
}
object SegmentCondition {
  
  @scala.inline
  def apply(SegmentId: string): SegmentCondition = {
    val __obj = js.Dynamic.literal(SegmentId = SegmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentCondition]
  }
  
  @scala.inline
  implicit class SegmentConditionMutableBuilder[Self <: SegmentCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
  }
}
