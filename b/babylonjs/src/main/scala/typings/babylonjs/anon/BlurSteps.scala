package typings.babylonjs.anon

import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurSteps extends StObject {
  
  var blurSteps: js.Array[PostProcess]
  
  var circleOfConfusion: PostProcess
}
object BlurSteps {
  
  inline def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): BlurSteps = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurSteps]
  }
  
  extension [Self <: BlurSteps](x: Self) {
    
    inline def setBlurSteps(value: js.Array[PostProcess]): Self = StObject.set(x, "blurSteps", value.asInstanceOf[js.Any])
    
    inline def setBlurStepsVarargs(value: PostProcess*): Self = StObject.set(x, "blurSteps", js.Array(value*))
    
    inline def setCircleOfConfusion(value: PostProcess): Self = StObject.set(x, "circleOfConfusion", value.asInstanceOf[js.Any])
  }
}
