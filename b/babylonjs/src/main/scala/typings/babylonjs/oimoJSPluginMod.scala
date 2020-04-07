package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/Plugins/oimoJSPlugin", JSImport.Namespace)
@js.native
object oimoJSPluginMod extends js.Object {
  @js.native
  class OimoJSPlugin () extends IPhysicsEnginePlugin {
    def this(iterations: Double) = this()
    def this(iterations: Double, oimoInjection: js.Any) = this()
    var BJSOIMO: js.Any = js.native
    var _raycastResult: js.Any = js.native
    var _tmpImpostorsArray: js.Any = js.native
    var _tmpPositionVector: js.Any = js.native
    def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
    def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  }
  
}

