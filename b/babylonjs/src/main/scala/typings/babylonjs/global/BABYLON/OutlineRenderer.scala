package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.OutlineRenderer")
@js.native
class OutlineRenderer protected ()
  extends typings.babylonjs.BABYLON.OutlineRenderer {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
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

/* static members */
@JSGlobal("BABYLON.OutlineRenderer")
@js.native
object OutlineRenderer extends js.Object {
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  var _StencilReference: js.Any = js.native
}

