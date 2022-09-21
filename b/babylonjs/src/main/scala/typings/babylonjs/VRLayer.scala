package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRLayer extends StObject {
  
  var leftBounds: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array | Null] = js.undefined
  
  var rightBounds: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array | Null] = js.undefined
  
  var source: js.UndefOr[HTMLCanvasElement | Null] = js.undefined
}
object VRLayer {
  
  inline def apply(): VRLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRLayer]
  }
  
  extension [Self <: VRLayer](x: Self) {
    
    inline def setLeftBounds(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "leftBounds", value.asInstanceOf[js.Any])
    
    inline def setLeftBoundsNull: Self = StObject.set(x, "leftBounds", null)
    
    inline def setLeftBoundsUndefined: Self = StObject.set(x, "leftBounds", js.undefined)
    
    inline def setLeftBoundsVarargs(value: Double*): Self = StObject.set(x, "leftBounds", js.Array(value*))
    
    inline def setRightBounds(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "rightBounds", value.asInstanceOf[js.Any])
    
    inline def setRightBoundsNull: Self = StObject.set(x, "rightBounds", null)
    
    inline def setRightBoundsUndefined: Self = StObject.set(x, "rightBounds", js.undefined)
    
    inline def setRightBoundsVarargs(value: Double*): Self = StObject.set(x, "rightBounds", js.Array(value*))
    
    inline def setSource(value: HTMLCanvasElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
