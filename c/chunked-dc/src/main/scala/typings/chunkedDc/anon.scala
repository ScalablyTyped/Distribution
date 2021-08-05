package typings.chunkedDc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[js.Any]
  }
  object Args {
    
    inline def apply(args: js.Array[js.Any]): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    }
  }
}
