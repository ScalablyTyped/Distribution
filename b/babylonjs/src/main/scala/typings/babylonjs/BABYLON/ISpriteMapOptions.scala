package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpriteMapOptions extends StObject {
  
  /**
    * number cell index of the base tile when the system compiles.
    */
  var baseTile: js.UndefOr[Double] = js.undefined
  
  /**
    * Vector3 scalar of the global RGB values of the SpriteMap.
    */
  var colorMultiply: js.UndefOr[Vector3] = js.undefined
  
  /**
    * boolean flip the sprite after its been repositioned by the framing data.
    */
  var flipU: js.UndefOr[Boolean] = js.undefined
  
  /**
    * number of layers that the system will reserve in resources.
    */
  var layerCount: js.UndefOr[Double] = js.undefined
  
  /**
    * number of max animation frames a single cell will reserve in resources.
    */
  var maxAnimationFrames: js.UndefOr[Double] = js.undefined
  
  /**
    * Vector3 of the position of the output plane in World Units.
    */
  var outputPosition: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Vector3 of the rotation of the output plane.
    */
  var outputRotation: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Vector2 of the size of the output plane in World Units.
    */
  var outputSize: js.UndefOr[Vector2] = js.undefined
  
  /**
    * Vector2 of the number of cells in the grid.
    */
  var stageSize: js.UndefOr[Vector2] = js.undefined
}
object ISpriteMapOptions {
  
  inline def apply(): ISpriteMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpriteMapOptions]
  }
  
  extension [Self <: ISpriteMapOptions](x: Self) {
    
    inline def setBaseTile(value: Double): Self = StObject.set(x, "baseTile", value.asInstanceOf[js.Any])
    
    inline def setBaseTileUndefined: Self = StObject.set(x, "baseTile", js.undefined)
    
    inline def setColorMultiply(value: Vector3): Self = StObject.set(x, "colorMultiply", value.asInstanceOf[js.Any])
    
    inline def setColorMultiplyUndefined: Self = StObject.set(x, "colorMultiply", js.undefined)
    
    inline def setFlipU(value: Boolean): Self = StObject.set(x, "flipU", value.asInstanceOf[js.Any])
    
    inline def setFlipUUndefined: Self = StObject.set(x, "flipU", js.undefined)
    
    inline def setLayerCount(value: Double): Self = StObject.set(x, "layerCount", value.asInstanceOf[js.Any])
    
    inline def setLayerCountUndefined: Self = StObject.set(x, "layerCount", js.undefined)
    
    inline def setMaxAnimationFrames(value: Double): Self = StObject.set(x, "maxAnimationFrames", value.asInstanceOf[js.Any])
    
    inline def setMaxAnimationFramesUndefined: Self = StObject.set(x, "maxAnimationFrames", js.undefined)
    
    inline def setOutputPosition(value: Vector3): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
    
    inline def setOutputPositionUndefined: Self = StObject.set(x, "outputPosition", js.undefined)
    
    inline def setOutputRotation(value: Vector3): Self = StObject.set(x, "outputRotation", value.asInstanceOf[js.Any])
    
    inline def setOutputRotationUndefined: Self = StObject.set(x, "outputRotation", js.undefined)
    
    inline def setOutputSize(value: Vector2): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
    
    inline def setOutputSizeUndefined: Self = StObject.set(x, "outputSize", js.undefined)
    
    inline def setStageSize(value: Vector2): Self = StObject.set(x, "stageSize", value.asInstanceOf[js.Any])
    
    inline def setStageSizeUndefined: Self = StObject.set(x, "stageSize", js.undefined)
  }
}
