package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IPhysicsEnginePlugin
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsEngine")
@js.native
class PhysicsEngine protected ()
  extends typings.babylonjs.BABYLON.PhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[typings.babylonjs.BABYLON.Vector3]) = this()
  def this(gravity: Nullable[typings.babylonjs.BABYLON.Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
}
/* static members */
@JSGlobal("BABYLON.PhysicsEngine")
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
