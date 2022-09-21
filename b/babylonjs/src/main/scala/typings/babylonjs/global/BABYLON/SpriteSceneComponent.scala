package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpriteSceneComponent")
@js.native
open class SpriteSceneComponent protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SpriteSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  
  /* private */ /* CompleteClass */
  var _pickSpriteButKeepRay: Any = js.native
  
  /* private */ /* CompleteClass */
  var _pointerDown: Any = js.native
  
  /* private */ /* CompleteClass */
  var _pointerMove: Any = js.native
  
  /* private */ /* CompleteClass */
  var _pointerUp: Any = js.native
  
  /** @hidden */
  /* private */ /* CompleteClass */
  var _spritePredicate: Any = js.native
  
  /**
    * Disposes the component and the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * The name of the component. Each component must have a unique name.
    */
  /* CompleteClass */
  var name: String = js.native
  
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
  
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  var scene: typings.babylonjs.BABYLON.Scene = js.native
}
