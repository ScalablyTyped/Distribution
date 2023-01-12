package typings.babylonjs.anon

import typings.babylonjs.BABYLON.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weight extends StObject {
  
  var blurred: PostProcess
  
  var weight: Double
}
object Weight {
  
  inline def apply(blurred: PostProcess, weight: Double): Weight = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    inline def setBlurred(value: PostProcess): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
