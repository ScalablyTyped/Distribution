package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayoutOptions
  extends StObject
     with LayoutOptions {
  
  var name: String
  
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.undefined
  
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.undefined
}
object BaseLayoutOptions {
  
  inline def apply(name: String): BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayoutOptions]
  }
  
  extension [Self <: BaseLayoutOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReady(value: /* e */ LayoutEventObject => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setStop(value: /* e */ LayoutEventObject => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
