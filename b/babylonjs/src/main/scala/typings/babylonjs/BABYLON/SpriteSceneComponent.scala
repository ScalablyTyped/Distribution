package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteSceneComponent extends ISceneComponent {
  
  var _pickSpriteButKeepRay: js.Any = js.native
  
  var _pointerDown: js.Any = js.native
  
  var _pointerMove: js.Any = js.native
  
  var _pointerUp: js.Any = js.native
  
  /** @hidden */
  var _spritePredicate: js.Any = js.native
}
object SpriteSceneComponent {
  
  @scala.inline
  def apply(
    _pickSpriteButKeepRay: js.Any,
    _pointerDown: js.Any,
    _pointerMove: js.Any,
    _pointerUp: js.Any,
    _spritePredicate: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): SpriteSceneComponent = {
    val __obj = js.Dynamic.literal(_pickSpriteButKeepRay = _pickSpriteButKeepRay.asInstanceOf[js.Any], _pointerDown = _pointerDown.asInstanceOf[js.Any], _pointerMove = _pointerMove.asInstanceOf[js.Any], _pointerUp = _pointerUp.asInstanceOf[js.Any], _spritePredicate = _spritePredicate.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSceneComponent]
  }
  
  @scala.inline
  implicit class SpriteSceneComponentMutableBuilder[Self <: SpriteSceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_pickSpriteButKeepRay(value: js.Any): Self = StObject.set(x, "_pickSpriteButKeepRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pointerDown(value: js.Any): Self = StObject.set(x, "_pointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pointerMove(value: js.Any): Self = StObject.set(x, "_pointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pointerUp(value: js.Any): Self = StObject.set(x, "_pointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_spritePredicate(value: js.Any): Self = StObject.set(x, "_spritePredicate", value.asInstanceOf[js.Any])
  }
}
