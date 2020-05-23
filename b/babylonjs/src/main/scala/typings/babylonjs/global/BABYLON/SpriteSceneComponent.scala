package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SpriteSceneComponent")
@js.native
class SpriteSceneComponent protected ()
  extends typings.babylonjs.BABYLON.SpriteSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  /* CompleteClass */
  override var _pickSpriteButKeepRay: js.Any = js.native
  /* CompleteClass */
  override var _pointerDown: js.Any = js.native
  /* CompleteClass */
  override var _pointerMove: js.Any = js.native
  /* CompleteClass */
  override var _pointerUp: js.Any = js.native
  /** @hidden */
  /* CompleteClass */
  override var _spritePredicate: js.Any = js.native
  /**
    * The name of the component. Each component must have a unique name.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  override var scene: typings.babylonjs.BABYLON.Scene = js.native
  /**
    * Disposes the component and the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  /* CompleteClass */
  override def rebuild(): Unit = js.native
  /**
    * Register the component to one instance of a scene.
    */
  /* CompleteClass */
  override def register(): Unit = js.native
}

