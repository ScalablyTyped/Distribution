package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  var reason: ChurnReason
  
  var topic: TopicLabel
}
object Topic {
  
  inline def apply(reason: ChurnReason, topic: TopicLabel): Topic = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  extension [Self <: Topic](x: Self) {
    
    inline def setReason(value: ChurnReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
