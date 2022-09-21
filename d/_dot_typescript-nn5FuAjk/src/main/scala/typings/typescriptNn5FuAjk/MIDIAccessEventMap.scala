package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIAccessEventMap extends StObject {
  
  var statechange: Event
}
object MIDIAccessEventMap {
  
  inline def apply(statechange: Event): MIDIAccessEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIAccessEventMap]
  }
  
  extension [Self <: MIDIAccessEventMap](x: Self) {
    
    inline def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
