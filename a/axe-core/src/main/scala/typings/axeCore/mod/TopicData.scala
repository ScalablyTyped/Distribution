package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicData
  extends StObject
     with ReplyData {
  
  var topic: String
}
object TopicData {
  
  inline def apply(channelId: String, keepalive: Boolean, message: Any, topic: String): TopicData = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], keepalive = keepalive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicData]
  }
  
  extension [Self <: TopicData](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
