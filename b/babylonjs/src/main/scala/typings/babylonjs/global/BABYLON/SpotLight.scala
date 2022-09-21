package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpotLight")
@js.native
open class SpotLight protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SpotLight {
  /**
    * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
    * It can cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The light friendly name
    * @param position The position of the spot light in the scene
    * @param direction The direction of the light in the scene
    * @param angle The cone angle of the light in Radians
    * @param exponent The light decay speed with the distance from the emission spot
    * @param scene The scene the lights belongs to
    */
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    direction: typings.babylonjs.BABYLON.Vector3,
    angle: Double,
    exponent: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
    * exceeding the number allowed of the materials.
    */
  /* CompleteClass */
  var renderPriority: Double = js.native
  
  /**
    * Gets or sets whether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  /* CompleteClass */
  var shadowEnabled: Boolean = js.native
}
/* static members */
object SpotLight {
  
  @JSGlobal("BABYLON.SpotLight")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.SpotLight._IsProceduralTexture")
  @js.native
  def _IsProceduralTexture: Any = js.native
  inline def _IsProceduralTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsProceduralTexture")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.SpotLight._IsTexture")
  @js.native
  def _IsTexture: Any = js.native
  inline def _IsTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsTexture")(x.asInstanceOf[js.Any])
}
