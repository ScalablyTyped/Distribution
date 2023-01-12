package typings.chainsafeLibp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicStr extends StObject {
  
  var topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
}
object TopicStr {
  
  inline def apply(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): TopicStr = {
    val __obj = js.Dynamic.literal(topicStr = topicStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicStr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicStr] (val x: Self) extends AnyVal {
    
    inline def setTopicStr(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Self = StObject.set(x, "topicStr", value.asInstanceOf[js.Any])
  }
}
