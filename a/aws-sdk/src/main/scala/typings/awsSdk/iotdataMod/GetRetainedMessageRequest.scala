package typings.awsSdk.iotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRetainedMessageRequest extends StObject {
  
  /**
    * The topic name of the retained message to retrieve.
    */
  var topic: Topic
}
object GetRetainedMessageRequest {
  
  inline def apply(topic: Topic): GetRetainedMessageRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRetainedMessageRequest]
  }
  
  extension [Self <: GetRetainedMessageRequest](x: Self) {
    
    inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
