package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteMapOptions extends StObject {
  
  /**
    * number cell index of the base tile when the system compiles.
    */
  var baseTile: js.UndefOr[Double] = js.native
  
  /**
    * Vector3 scalar of the global RGB values of the SpriteMap.
    */
  var colorMultiply: js.UndefOr[Vector3] = js.native
  
  /**
    * boolean flip the sprite after its been repositioned by the framing data.
    */
  var flipU: js.UndefOr[Boolean] = js.native
  
  /**
    * number of layers that the system will reserve in resources.
    */
  var layerCount: js.UndefOr[Double] = js.native
  
  /**
    * number of max animation frames a single cell will reserve in resources.
    */
  var maxAnimationFrames: js.UndefOr[Double] = js.native
  
  /**
    * Vector3 of the position of the output plane in World Units.
    */
  var outputPosition: js.UndefOr[Vector3] = js.native
  
  /**
    * Vector3 of the rotation of the output plane.
    */
  var outputRotation: js.UndefOr[Vector3] = js.native
  
  /**
    * Vector2 of the size of the output plane in World Units.
    */
  var outputSize: js.UndefOr[Vector2] = js.native
  
  /**
    * Vector2 of the number of cells in the grid.
    */
  var stageSize: js.UndefOr[Vector2] = js.native
}
object ISpriteMapOptions {
  
  @scala.inline
  def apply(): ISpriteMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpriteMapOptions]
  }
  
  @scala.inline
  implicit class ISpriteMapOptionsMutableBuilder[Self <: ISpriteMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseTile(value: Double): Self = StObject.set(x, "baseTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTileUndefined: Self = StObject.set(x, "baseTile", js.undefined)
    
    @scala.inline
    def setColorMultiply(value: Vector3): Self = StObject.set(x, "colorMultiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMultiplyUndefined: Self = StObject.set(x, "colorMultiply", js.undefined)
    
    @scala.inline
    def setFlipU(value: Boolean): Self = StObject.set(x, "flipU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUUndefined: Self = StObject.set(x, "flipU", js.undefined)
    
    @scala.inline
    def setLayerCount(value: Double): Self = StObject.set(x, "layerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerCountUndefined: Self = StObject.set(x, "layerCount", js.undefined)
    
    @scala.inline
    def setMaxAnimationFrames(value: Double): Self = StObject.set(x, "maxAnimationFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAnimationFramesUndefined: Self = StObject.set(x, "maxAnimationFrames", js.undefined)
    
    @scala.inline
    def setOutputPosition(value: Vector3): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputPositionUndefined: Self = StObject.set(x, "outputPosition", js.undefined)
    
    @scala.inline
    def setOutputRotation(value: Vector3): Self = StObject.set(x, "outputRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputRotationUndefined: Self = StObject.set(x, "outputRotation", js.undefined)
    
    @scala.inline
    def setOutputSize(value: Vector2): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSizeUndefined: Self = StObject.set(x, "outputSize", js.undefined)
    
    @scala.inline
    def setStageSize(value: Vector2): Self = StObject.set(x, "stageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageSizeUndefined: Self = StObject.set(x, "stageSize", js.undefined)
  }
}
