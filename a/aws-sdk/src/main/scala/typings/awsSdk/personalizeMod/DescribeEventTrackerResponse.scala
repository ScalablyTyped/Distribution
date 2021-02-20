package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventTrackerResponse extends StObject {
  
  /**
    * An object that describes the event tracker.
    */
  var eventTracker: js.UndefOr[EventTracker] = js.native
}
object DescribeEventTrackerResponse {
  
  @scala.inline
  def apply(): DescribeEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTrackerResponse]
  }
  
  @scala.inline
  implicit class DescribeEventTrackerResponseMutableBuilder[Self <: DescribeEventTrackerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTracker(value: EventTracker): Self = StObject.set(x, "eventTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTrackerUndefined: Self = StObject.set(x, "eventTracker", js.undefined)
  }
}
