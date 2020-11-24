package typings.babylonjs.spriteSceneComponentMod

import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Sprites/spriteSceneComponent", "SpriteSceneComponent")
@js.native
class SpriteSceneComponent protected () extends ISceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  
  var _pickSpriteButKeepRay: js.Any = js.native
  
  var _pointerDown: js.Any = js.native
  
  var _pointerMove: js.Any = js.native
  
  var _pointerUp: js.Any = js.native
  
  /** @hidden */
  var _spritePredicate: js.Any = js.native
}
