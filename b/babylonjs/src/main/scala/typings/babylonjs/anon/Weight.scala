package typings.babylonjs.anon

import typings.babylonjs.BABYLON.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Weight extends StObject {
  
  var blurred: PostProcess = js.native
  
  var weight: Double = js.native
}
object Weight {
  
  @scala.inline
  def apply(blurred: PostProcess, weight: Double): Weight = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit class WeightMutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurred(value: PostProcess): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
