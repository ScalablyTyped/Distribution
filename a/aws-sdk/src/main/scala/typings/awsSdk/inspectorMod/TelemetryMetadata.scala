package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryMetadata extends StObject {
  
  /**
    * The count of messages that the agent sends to the Amazon Inspector service.
    */
  var count: Long
  
  /**
    * The data size of messages that the agent sends to the Amazon Inspector service.
    */
  var dataSize: js.UndefOr[Long] = js.undefined
  
  /**
    * A specific type of behavioral data that is collected by the agent.
    */
  var messageType: MessageType
}
object TelemetryMetadata {
  
  inline def apply(count: Long, messageType: MessageType): TelemetryMetadata = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryMetadata]
  }
  
  extension [Self <: TelemetryMetadata](x: Self) {
    
    inline def setCount(value: Long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDataSize(value: Long): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setDataSizeUndefined: Self = StObject.set(x, "dataSize", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
