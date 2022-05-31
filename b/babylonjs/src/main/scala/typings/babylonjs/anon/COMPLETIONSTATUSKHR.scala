package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COMPLETIONSTATUSKHR extends StObject {
  
  var COMPLETION_STATUS_KHR: Double
}
object COMPLETIONSTATUSKHR {
  
  inline def apply(COMPLETION_STATUS_KHR: Double): COMPLETIONSTATUSKHR = {
    val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = COMPLETION_STATUS_KHR.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMPLETIONSTATUSKHR]
  }
  
  extension [Self <: COMPLETIONSTATUSKHR](x: Self) {
    
    inline def setCOMPLETION_STATUS_KHR(value: Double): Self = StObject.set(x, "COMPLETION_STATUS_KHR", value.asInstanceOf[js.Any])
  }
}
