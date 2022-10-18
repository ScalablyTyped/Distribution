package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  var reason: InclusionReason
  
  var topic: TopicLabel
}
object Reason {
  
  inline def apply(reason: InclusionReason, topic: TopicLabel): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setReason(value: InclusionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
