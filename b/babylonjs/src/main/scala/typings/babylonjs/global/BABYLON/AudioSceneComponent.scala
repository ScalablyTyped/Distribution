package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AudioSceneComponent")
@js.native
/**
  * Creates a new instance of the component for the given scene
  * @param scene Defines the scene to register the component in
  */
open class AudioSceneComponent ()
  extends StObject
     with typings.babylonjs.BABYLON.AudioSceneComponent {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  
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
/* static members */
object AudioSceneComponent {
  
  @JSGlobal("BABYLON.AudioSceneComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.AudioSceneComponent._CameraDirection")
  @js.native
  def _CameraDirection: Any = js.native
  inline def _CameraDirection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirection")(x.asInstanceOf[js.Any])
}
