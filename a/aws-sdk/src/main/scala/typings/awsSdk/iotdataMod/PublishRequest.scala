package typings.awsSdk.iotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishRequest extends StObject {
  
  /**
    * The message body. MQTT accepts text, binary, and empty (null) message payloads. Publishing an empty (null) payload with retain = true deletes the retained message identified by topic from Amazon Web Services IoT Core.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * The Quality of Service (QoS) level.
    */
  var qos: js.UndefOr[Qos] = js.undefined
  
  /**
    * A Boolean value that determines whether to set the RETAIN flag when the message is published. Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic. Valid values: true | false  Default value: false 
    */
  var retain: js.UndefOr[Retain] = js.undefined
  
  /**
    * The name of the MQTT topic.
    */
  var topic: Topic
}
object PublishRequest {
  
  inline def apply(topic: Topic): PublishRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRequest]
  }
  
  extension [Self <: PublishRequest](x: Self) {
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setRetain(value: Retain): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    
    inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
