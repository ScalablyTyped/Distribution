package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compute extends StObject {
  
  var compute: String
  
  var rawCompute: String
}
object Compute {
  
  inline def apply(compute: String, rawCompute: String): Compute = {
    val __obj = js.Dynamic.literal(compute = compute.asInstanceOf[js.Any], rawCompute = rawCompute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compute]
  }
  
  extension [Self <: Compute](x: Self) {
    
    inline def setCompute(value: String): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
    
    inline def setRawCompute(value: String): Self = StObject.set(x, "rawCompute", value.asInstanceOf[js.Any])
  }
}
