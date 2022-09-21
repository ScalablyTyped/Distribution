package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackCueEventMap extends StObject {
  
  var enter: Event
  
  var exit: Event
}
object TextTrackCueEventMap {
  
  inline def apply(enter: Event, exit: Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
  
  extension [Self <: TextTrackCueEventMap](x: Self) {
    
    inline def setEnter(value: Event): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Event): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
