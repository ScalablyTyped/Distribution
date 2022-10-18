package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicTopicLabel extends StObject {
  
  var topic: TopicLabel
}
object TopicTopicLabel {
  
  inline def apply(topic: TopicLabel): TopicTopicLabel = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicTopicLabel]
  }
  
  extension [Self <: TopicTopicLabel](x: Self) {
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
