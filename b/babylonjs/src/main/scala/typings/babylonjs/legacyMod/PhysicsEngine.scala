package typings.babylonjs.legacyMod

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PhysicsEngine")
@js.native
class PhysicsEngine protected ()
  extends typings.babylonjs.indexMod.PhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[typings.babylonjs.mathVectorMod.Vector3]) = this()
  def this(gravity: Nullable[typings.babylonjs.mathVectorMod.Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "PhysicsEngine")
@js.native
object PhysicsEngine extends js.Object {
  
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  def DefaultPluginFactory(): IPhysicsEnginePlugin = js.native
  
  /**
    * Global value used to control the smallest number supported by the simulation
    */
  var Epsilon: Double = js.native
}
