package typings.babylonjs.indexMod

import typings.babylonjs.collisionCoordinatorMod.ICollisionCoordinator
import typings.babylonjs.sceneMod.SceneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Scene")
@js.native
class Scene protected ()
  extends typings.babylonjs.sceneMod.Scene {
  /**
    * Creates a new Scene
    * @param engine defines the engine to use to render this scene
    * @param options defines the scene options
    */
  def this(engine: typings.babylonjs.engineMod.Engine) = this()
  def this(engine: typings.babylonjs.engineMod.Engine, options: SceneOptions) = this()
}
/* static members */
@JSImport("babylonjs/index", "Scene")
@js.native
object Scene extends js.Object {
  
  /**
    * Factory used to create the a collision coordinator.
    * @returns The collision coordinator
    */
  def CollisionCoordinatorFactory(): ICollisionCoordinator = js.native
  
  /**
    * Factory used to create the default material.
    * @param name The name of the material to create
    * @param scene The scene to create the material for
    * @returns The default material
    */
  def DefaultMaterialFactory(scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.materialMod.Material = js.native
  
  /**
    * Time in milliseconds to wait to raise long press events if button is still pressed. Default is 300 ms
    */
  def DoubleClickDelay: Double = js.native
  def DoubleClickDelay_=(value: Double): Unit = js.native
  
  /**
    * Gets or sets the distance in pixel that you have to move to prevent some events. Default is 10 pixels
    */
  def DragMovementThreshold: Double = js.native
  def DragMovementThreshold_=(value: Double): Unit = js.native
  
  /** If you need to check double click without raising a single click at first click, enable this flag */
  def ExclusiveDoubleClickMode: Boolean = js.native
  def ExclusiveDoubleClickMode_=(value: Boolean): Unit = js.native
  
  /** The fog density is following an exponential function */
  val FOGMODE_EXP: Double = js.native
  
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  val FOGMODE_EXP2: Double = js.native
  
  /** The fog density is following a linear function. */
  val FOGMODE_LINEAR: Double = js.native
  
  /** The fog is deactivated */
  val FOGMODE_NONE: Double = js.native
  
  /**
    * Time in milliseconds to wait to raise long press events if button is still pressed. Default is 500 ms
    */
  def LongPressDelay: Double = js.native
  def LongPressDelay_=(value: Double): Unit = js.native
  
  /**
    * Gets or sets the maximum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var MaxDeltaTime: Double = js.native
  
  /**
    * Gets or sets the minimum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var MinDeltaTime: Double = js.native
}
