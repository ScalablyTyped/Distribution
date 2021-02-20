package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oimoJSPluginMod {
  
  @JSImport("babylonjs/Physics/Plugins/oimoJSPlugin", "OimoJSPlugin")
  @js.native
  class OimoJSPlugin () extends IPhysicsEnginePlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      iterations: js.UndefOr[scala.Nothing],
      oimoInjection: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double, oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: js.UndefOr[scala.Nothing], oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: js.Any) = this()
    
    var BJSOIMO: js.Any = js.native
    
    var _fixedTimeStep: js.Any = js.native
    
    var _raycastResult: js.Any = js.native
    
    var _tmpImpostorsArray: js.Any = js.native
    
    var _tmpPositionVector: js.Any = js.native
    
    var _useDeltaForWorldStep: js.Any = js.native
    
    def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
    
    def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  }
}
