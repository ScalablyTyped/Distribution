package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the Depth Renderer scene component responsible to manage a depth buffer usefull
     * in several rendering techniques.
     */
@JSGlobal("BABYLON.DepthRendererSceneComponent")
@js.native
class DepthRendererSceneComponent protected () extends ISceneComponent {
  /**
           * Creates a new instance of the component for the given scene
           * @param scene Defines the scene to register the component in
           */
  def this(scene: Scene) = this()
  var _gatherActiveCameraRenderTargets: js.Any = js.native
  var _gatherRenderTargets: js.Any = js.native
  /**
           * The name of the component. Each component must have a unique name.
           */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
           * The scene the component belongs to.
           */
  /* CompleteClass */
  override var scene: Scene = js.native
  /**
           * Disposes the component and the associated ressources.
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
           * Rebuilds the elements related to this component in case of
           * context lost for instance.
           */
  /* CompleteClass */
  override def rebuild(): scala.Unit = js.native
  /**
           * Register the component to one instance of a scene.
           */
  /* CompleteClass */
  override def register(): scala.Unit = js.native
}

