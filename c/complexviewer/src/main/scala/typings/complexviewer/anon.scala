package typings.complexviewer

import typings.complexviewer.complexviewerNumbers.`0`
import typings.complexviewer.complexviewerNumbers.`1`
import typings.complexviewer.complexviewerNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DRAGGING extends StObject {
    
    var DRAGGING: `2`
    
    var MOUSE_UP: `0`
    
    var SELECT_PAN: `1`
  }
  object DRAGGING {
    
    inline def apply(): DRAGGING = {
      val __obj = js.Dynamic.literal(DRAGGING = 2, MOUSE_UP = 0, SELECT_PAN = 1)
      __obj.asInstanceOf[DRAGGING]
    }
    
    extension [Self <: DRAGGING](x: Self) {
      
      inline def setDRAGGING(value: `2`): Self = StObject.set(x, "DRAGGING", value.asInstanceOf[js.Any])
      
      inline def setMOUSE_UP(value: `0`): Self = StObject.set(x, "MOUSE_UP", value.asInstanceOf[js.Any])
      
      inline def setSELECT_PAN(value: `1`): Self = StObject.set(x, "SELECT_PAN", value.asInstanceOf[js.Any])
    }
  }
}
