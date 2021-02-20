package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEffectRendererOptions extends StObject {
  
  /**
    * Defines the indices.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Defines the vertices positions.
    */
  var positions: js.UndefOr[js.Array[Double]] = js.native
}
object IEffectRendererOptions {
  
  @scala.inline
  def apply(): IEffectRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEffectRendererOptions]
  }
  
  @scala.inline
  implicit class IEffectRendererOptionsMutableBuilder[Self <: IEffectRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value :_*))
  }
}
