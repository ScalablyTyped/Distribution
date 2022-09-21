package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerEvent extends StObject {
  
  /**
    * The time when the event occurred. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon S3 URL of the event's log file.
    */
  var LogUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable informational or status message.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the server on or for which the event occurred. 
    */
  var ServerName: js.UndefOr[String] = js.undefined
}
object ServerEvent {
  
  inline def apply(): ServerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerEvent]
  }
  
  extension [Self <: ServerEvent](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "LogUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "LogUrl", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
  }
}
