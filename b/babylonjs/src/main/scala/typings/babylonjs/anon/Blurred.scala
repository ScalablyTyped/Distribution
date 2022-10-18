package typings.babylonjs.anon

import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blurred extends StObject {
  
  var blurred: PostProcess
  
  var weight: Double
}
object Blurred {
  
  inline def apply(blurred: PostProcess, weight: Double): Blurred = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blurred]
  }
  
  extension [Self <: Blurred](x: Self) {
    
    inline def setBlurred(value: PostProcess): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
