package typings.babylonjs.indexMod

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PhysicsEngine")
@js.native
class PhysicsEngine protected ()
  extends typings.babylonjs.physicsIndexMod.PhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[typings.babylonjs.mathVectorMod.Vector3]) = this()
  def this(gravity: Nullable[typings.babylonjs.mathVectorMod.Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
}
/* static members */
object PhysicsEngine {
  
  @JSImport("babylonjs/index", "PhysicsEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  @JSImport("babylonjs/index", "PhysicsEngine.DefaultPluginFactory")
  @js.native
  def DefaultPluginFactory(): IPhysicsEnginePlugin = js.native
  
  /**
    * Global value used to control the smallest number supported by the simulation
    */
  @JSImport("babylonjs/index", "PhysicsEngine.Epsilon")
  @js.native
  def Epsilon: Double = js.native
  @scala.inline
  def Epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])
}
