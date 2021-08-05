package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: typings.codemirror.mod.Mode[js.Any]
  
  var state: js.Any
}
object Mode {
  
  inline def apply(mode: typings.codemirror.mod.Mode[js.Any], state: js.Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: typings.codemirror.mod.Mode[js.Any]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
