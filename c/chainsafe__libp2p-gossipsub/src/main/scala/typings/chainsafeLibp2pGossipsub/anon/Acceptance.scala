package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acceptance extends StObject {
  
  var acceptance: MessageAcceptance
  
  var topic: TopicLabel
}
object Acceptance {
  
  inline def apply(acceptance: MessageAcceptance, topic: TopicLabel): Acceptance = {
    val __obj = js.Dynamic.literal(acceptance = acceptance.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceptance]
  }
  
  extension [Self <: Acceptance](x: Self) {
    
    inline def setAcceptance(value: MessageAcceptance): Self = StObject.set(x, "acceptance", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
