package typings.babylonjs.anon

import typings.babylonjs.postProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurSteps extends StObject {
  
  var blurSteps: js.Array[PostProcess] = js.native
  
  var circleOfConfusion: PostProcess = js.native
}
object BlurSteps {
  
  @scala.inline
  def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): BlurSteps = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurSteps]
  }
  
  @scala.inline
  implicit class BlurStepsMutableBuilder[Self <: BlurSteps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurSteps(value: js.Array[PostProcess]): Self = StObject.set(x, "blurSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurStepsVarargs(value: PostProcess*): Self = StObject.set(x, "blurSteps", js.Array(value :_*))
    
    @scala.inline
    def setCircleOfConfusion(value: PostProcess): Self = StObject.set(x, "circleOfConfusion", value.asInstanceOf[js.Any])
  }
}
