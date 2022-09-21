package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIPortEventMap extends StObject {
  
  var statechange: Event
}
object MIDIPortEventMap {
  
  inline def apply(statechange: Event): MIDIPortEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIPortEventMap]
  }
  
  extension [Self <: MIDIPortEventMap](x: Self) {
    
    inline def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
