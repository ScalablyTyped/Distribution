package typings.chainsafeLibp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P extends StObject {
  
  var p: String
  
  var topic: js.UndefOr[String] = js.undefined
}
object P {
  
  inline def apply(p: String): P = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[P]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P] (val x: Self) extends AnyVal {
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
