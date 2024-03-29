package typings.babylonjs.physicsIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsEngineV2")
@js.native
open class PhysicsEngineV2 protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsEngineV2 {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[Vector3]) = this()
  def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePluginV2) = this()
}
/* static members */
object PhysicsEngineV2 {
  
  @JSImport("babylonjs/Physics/index", "PhysicsEngineV2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  inline def DefaultPluginFactory(): IPhysicsEnginePluginV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPluginFactory")().asInstanceOf[IPhysicsEnginePluginV2]
}
