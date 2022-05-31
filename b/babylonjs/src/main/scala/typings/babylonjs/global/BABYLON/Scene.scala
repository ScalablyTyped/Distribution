package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ICollisionCoordinator
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.SceneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Scene")
@js.native
class Scene protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Scene {
  /**
    * Creates a new Scene
    * @param engine defines the engine to use to render this scene
    * @param options defines the scene options
    */
  def this(engine: typings.babylonjs.BABYLON.Engine) = this()
  def this(engine: typings.babylonjs.BABYLON.Engine, options: SceneOptions) = this()
  
  /**
    * Gets or sets the active clipplane 1
    */
  /* CompleteClass */
  var clipPlane: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 2
    */
  /* CompleteClass */
  var clipPlane2: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 3
    */
  /* CompleteClass */
  var clipPlane3: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 4
    */
  /* CompleteClass */
  var clipPlane4: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 5
    */
  /* CompleteClass */
  var clipPlane5: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 6
    */
  /* CompleteClass */
  var clipPlane6: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
}
/* static members */
object Scene {
  
  @JSGlobal("BABYLON.Scene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the a collision coordinator.
    * @returns The collision coordinator
    */
  inline def CollisionCoordinatorFactory(): ICollisionCoordinator = ^.asInstanceOf[js.Dynamic].applyDynamic("CollisionCoordinatorFactory")().asInstanceOf[ICollisionCoordinator]
  
  /**
    * Factory used to create the default material.
    * @param name The name of the material to create
    * @param scene The scene to create the material for
    * @returns The default material
    */
  inline def DefaultMaterialFactory(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Material = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultMaterialFactory")(scene.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Material]
  
  /** The fog density is following an exponential function */
  @JSGlobal("BABYLON.Scene.FOGMODE_EXP")
  @js.native
  val FOGMODE_EXP: Double = js.native
  
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  @JSGlobal("BABYLON.Scene.FOGMODE_EXP2")
  @js.native
  val FOGMODE_EXP2: Double = js.native
  
  /** The fog density is following a linear function. */
  @JSGlobal("BABYLON.Scene.FOGMODE_LINEAR")
  @js.native
  val FOGMODE_LINEAR: Double = js.native
  
  /** The fog is deactivated */
  @JSGlobal("BABYLON.Scene.FOGMODE_NONE")
  @js.native
  val FOGMODE_NONE: Double = js.native
  
  /**
    * Gets or sets the maximum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSGlobal("BABYLON.Scene.MaxDeltaTime")
  @js.native
  def MaxDeltaTime: Double = js.native
  inline def MaxDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDeltaTime")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the minimum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSGlobal("BABYLON.Scene.MinDeltaTime")
  @js.native
  def MinDeltaTime: Double = js.native
  inline def MinDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinDeltaTime")(x.asInstanceOf[js.Any])
}
