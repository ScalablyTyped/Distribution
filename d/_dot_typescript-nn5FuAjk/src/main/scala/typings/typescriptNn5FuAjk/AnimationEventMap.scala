package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEventMap extends StObject {
  
  var cancel: AnimationPlaybackEvent
  
  var finish: AnimationPlaybackEvent
  
  var remove: Event
}
object AnimationEventMap {
  
  inline def apply(cancel: AnimationPlaybackEvent, finish: AnimationPlaybackEvent, remove: Event): AnimationEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
  
  extension [Self <: AnimationEventMap](x: Self) {
    
    inline def setCancel(value: AnimationPlaybackEvent): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setFinish(value: AnimationPlaybackEvent): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Event): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
