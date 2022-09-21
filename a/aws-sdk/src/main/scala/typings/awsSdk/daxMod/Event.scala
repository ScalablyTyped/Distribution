package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The date and time when the event occurred.
    */
  var Date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A user-defined message associated with the event.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
    */
  var SourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
    */
  var SourceType: js.UndefOr[typings.awsSdk.daxMod.SourceType] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
