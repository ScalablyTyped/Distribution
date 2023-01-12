package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import typings.libp2pInterfacePubsub.mod.TopicValidatorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acceptance extends StObject {
  
  var acceptance: TopicValidatorResult
  
  var topic: TopicLabel
}
object Acceptance {
  
  inline def apply(acceptance: TopicValidatorResult, topic: TopicLabel): Acceptance = {
    val __obj = js.Dynamic.literal(acceptance = acceptance.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceptance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acceptance] (val x: Self) extends AnyVal {
    
    inline def setAcceptance(value: TopicValidatorResult): Self = StObject.set(x, "acceptance", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
