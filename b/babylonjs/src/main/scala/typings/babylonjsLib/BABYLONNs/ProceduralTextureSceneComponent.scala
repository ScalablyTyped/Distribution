package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the Procedural Texture scene component responsible to manage any Procedural Texture
     * in a given scene.
     */
@JSGlobal("BABYLON.ProceduralTextureSceneComponent")
@js.native
class ProceduralTextureSceneComponent protected () extends ISceneComponent {
  /**
           * Creates a new instance of the component for the given scene
           * @param scene Defines the scene to register the component in
           */
  def this(scene: Scene) = this()
  var _beforeClear: js.Any = js.native
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

