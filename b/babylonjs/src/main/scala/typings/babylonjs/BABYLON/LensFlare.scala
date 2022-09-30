package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensFlare extends StObject {
  
  /** @internal */
  var _drawWrapper: DrawWrapper
  
  /* private */ var _system: Any
  
  /**
    * Define the alpha mode to render this particular lens.
    */
  var alphaMode: Double
  
  /**
    * Define the lens color.
    */
  var color: Color3
  
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  def dispose(): Unit
  
  /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  var position: Double
  
  /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  var size: Double
  
  /**
    * Define the lens texture.
    */
  var texture: Nullable[Texture]
}
object LensFlare {
  
  inline def apply(
    _drawWrapper: DrawWrapper,
    _system: Any,
    alphaMode: Double,
    color: Color3,
    dispose: () => Unit,
    position: Double,
    size: Double
  ): LensFlare = {
    val __obj = js.Dynamic.literal(_drawWrapper = _drawWrapper.asInstanceOf[js.Any], _system = _system.asInstanceOf[js.Any], alphaMode = alphaMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], texture = null)
    __obj.asInstanceOf[LensFlare]
  }
  
  extension [Self <: LensFlare](x: Self) {
    
    inline def setAlphaMode(value: Double): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Nullable[Texture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureNull: Self = StObject.set(x, "texture", null)
    
    inline def set_drawWrapper(value: DrawWrapper): Self = StObject.set(x, "_drawWrapper", value.asInstanceOf[js.Any])
    
    inline def set_system(value: Any): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
  }
}
