package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEvent extends StObject {
  
  /**
    * The timestamp when the database log event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The message of the database log event.
    */
  var message: js.UndefOr[String] = js.native
}
object LogEvent {
  
  @scala.inline
  def apply(): LogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  implicit class LogEventMutableBuilder[Self <: LogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
