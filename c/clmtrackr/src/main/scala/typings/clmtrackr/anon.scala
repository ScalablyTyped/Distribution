package typings.clmtrackr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait UseWebWorkers extends StObject {
    
    /** whether to use web workers for face detection (default is true) */
    var useWebWorkers: js.UndefOr[Boolean] = js.undefined
  }
  object UseWebWorkers {
    
    inline def apply(): UseWebWorkers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseWebWorkers]
    }
    
    extension [Self <: UseWebWorkers](x: Self) {
      
      inline def setUseWebWorkers(value: Boolean): Self = StObject.set(x, "useWebWorkers", value.asInstanceOf[js.Any])
      
      inline def setUseWebWorkersUndefined: Self = StObject.set(x, "useWebWorkers", js.undefined)
    }
  }
}
