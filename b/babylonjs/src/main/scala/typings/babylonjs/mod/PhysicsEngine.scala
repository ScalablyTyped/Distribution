package typings.babylonjs.mod

import typings.babylonjs.physicsV1IphysicsenginepluginMod.IPhysicsEnginePlugin
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PhysicsEngine")
@js.native
open class PhysicsEngine protected ()
  extends typings.babylonjs.legacyLegacyMod.PhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[typings.babylonjs.mathsMathDotvectorMod.Vector3]) = this()
  def this(
    gravity: Nullable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    _physicsPlugin: IPhysicsEnginePlugin
  ) = this()
}
/* static members */
object PhysicsEngine {
  
  @JSImport("babylonjs", "PhysicsEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  inline def DefaultPluginFactory(): IPhysicsEnginePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPluginFactory")().asInstanceOf[IPhysicsEnginePlugin]
}
