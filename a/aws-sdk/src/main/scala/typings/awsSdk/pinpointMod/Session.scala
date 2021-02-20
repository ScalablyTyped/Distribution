package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[integer] = js.native
  
  /**
    * The unique identifier for the session.
    */
  var Id: string = js.native
  
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: string = js.native
  
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[string] = js.native
}
object Session {
  
  @scala.inline
  def apply(Id: string, StartTimestamp: string): Session = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: string): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimestamp(value: string): Self = StObject.set(x, "StopTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimestampUndefined: Self = StObject.set(x, "StopTimestamp", js.undefined)
  }
}
