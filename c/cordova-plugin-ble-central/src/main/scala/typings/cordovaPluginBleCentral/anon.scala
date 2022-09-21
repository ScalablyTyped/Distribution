package typings.cordovaPluginBleCentral

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EmitOnRegistered extends StObject {
    
    var emitOnRegistered: Boolean
  }
  object EmitOnRegistered {
    
    inline def apply(emitOnRegistered: Boolean): EmitOnRegistered = {
      val __obj = js.Dynamic.literal(emitOnRegistered = emitOnRegistered.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmitOnRegistered]
    }
    
    extension [Self <: EmitOnRegistered](x: Self) {
      
      inline def setEmitOnRegistered(value: Boolean): Self = StObject.set(x, "emitOnRegistered", value.asInstanceOf[js.Any])
    }
  }
}
