package typings.babylonjs

import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsPhysicsJointMod.IMotorEnabledJoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPluginsCannonJSPluginMod {
  
  @JSImport("babylonjs/Physics/Plugins/cannonJSPlugin", "CannonJSPlugin")
  @js.native
  open class CannonJSPlugin ()
    extends StObject
       with IPhysicsEnginePlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, cannonInjection: Any) = this()
    
    var BJSCANNON: Any = js.native
    
    /* private */ var _addMaterial: Any = js.native
    
    /* private */ var _cannonRaycastResult: Any = js.native
    
    /* private */ var _checkWithEpsilon: Any = js.native
    
    /* private */ var _createHeightmap: Any = js.native
    
    /* private */ var _createShape: Any = js.native
    
    /* private */ var _extendNamespace: Any = js.native
    
    /* private */ var _firstFrame: Any = js.native
    
    /* private */ var _fixedTimeStep: Any = js.native
    
    /* private */ var _minus90X: Any = js.native
    
    /* private */ var _physicsBodiesToRemoveAfterStep: Any = js.native
    
    /* private */ var _physicsMaterials: Any = js.native
    
    /* private */ var _plus90X: Any = js.native
    
    /* private */ var _processChildMeshes: Any = js.native
    
    /* private */ var _raycastResult: Any = js.native
    
    /* private */ var _removeMarkedPhysicsBodiesFromWorld: Any = js.native
    
    /* private */ var _tmpDeltaPosition: Any = js.native
    
    /* private */ var _tmpPosition: Any = js.native
    
    /* private */ var _tmpQuaternion: Any = js.native
    
    /* private */ var _tmpUnityRotation: Any = js.native
    
    /* private */ var _updatePhysicsBodyTransformation: Any = js.native
    
    /* private */ var _useDeltaForWorldStep: Any = js.native
    
    def setMotor(joint: IMotorEnabledJoint): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Double, motorIndex: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Unit, motorIndex: Double): Unit = js.native
  }
}
