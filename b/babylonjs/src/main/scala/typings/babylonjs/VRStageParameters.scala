package typings.babylonjs

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRStageParameters extends StObject {
  
  var sittingToStandingTransform: js.UndefOr[Float32Array] = js.undefined
  
  var sizeX: js.UndefOr[Double] = js.undefined
  
  var sizeY: js.UndefOr[Double] = js.undefined
}
object VRStageParameters {
  
  inline def apply(): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRStageParameters]
  }
  
  extension [Self <: VRStageParameters](x: Self) {
    
    inline def setSittingToStandingTransform(value: Float32Array): Self = StObject.set(x, "sittingToStandingTransform", value.asInstanceOf[js.Any])
    
    inline def setSittingToStandingTransformUndefined: Self = StObject.set(x, "sittingToStandingTransform", js.undefined)
    
    inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    inline def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    inline def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
  }
}
