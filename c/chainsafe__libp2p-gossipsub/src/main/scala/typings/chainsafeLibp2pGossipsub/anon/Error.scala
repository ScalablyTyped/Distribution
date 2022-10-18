package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: RejectReason | ValidateError
  
  var topic: TopicLabel
}
object Error {
  
  inline def apply(error: RejectReason | ValidateError, topic: TopicLabel): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: RejectReason | ValidateError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
