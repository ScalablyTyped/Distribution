package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LensFlare extends StObject {
  
  var _system: js.Any = js.native
  
  /**
    * Define the alpha mode to render this particular lens.
    */
  var alphaMode: Double = js.native
  
  /**
    * Define the lens color.
    */
  var color: Color3 = js.native
  
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  def dispose(): Unit = js.native
  
  /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  var position: Double = js.native
  
  /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  var size: Double = js.native
  
  /**
    * Define the lens texture.
    */
  var texture: Nullable[Texture] = js.native
}
object LensFlare {
  
  @scala.inline
  def apply(
    _system: js.Any,
    alphaMode: Double,
    color: Color3,
    dispose: () => Unit,
    position: Double,
    size: Double
  ): LensFlare = {
    val __obj = js.Dynamic.literal(_system = _system.asInstanceOf[js.Any], alphaMode = alphaMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LensFlare]
  }
  
  @scala.inline
  implicit class LensFlareMutableBuilder[Self <: LensFlare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaMode(value: Double): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Nullable[Texture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureNull: Self = StObject.set(x, "texture", null)
    
    @scala.inline
    def set_system(value: js.Any): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
  }
}
