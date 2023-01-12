package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEffectRendererOptions extends StObject {
  
  /**
    * Defines the indices.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Defines the vertices positions.
    */
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
}
object IEffectRendererOptions {
  
  inline def apply(): IEffectRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEffectRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEffectRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
  }
}
