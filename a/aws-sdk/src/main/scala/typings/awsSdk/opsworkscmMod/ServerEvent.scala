package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEvent extends StObject {
  
  /**
    * The time when the event occurred. 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon S3 URL of the event's log file.
    */
  var LogUrl: js.UndefOr[String] = js.native
  
  /**
    * A human-readable informational or status message.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The name of the server on or for which the event occurred. 
    */
  var ServerName: js.UndefOr[String] = js.native
}
object ServerEvent {
  
  @scala.inline
  def apply(): ServerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerEvent]
  }
  
  @scala.inline
  implicit class ServerEventMutableBuilder[Self <: ServerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setLogUrl(value: String): Self = StObject.set(x, "LogUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUrlUndefined: Self = StObject.set(x, "LogUrl", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
  }
}
