package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsJointMod.IMotorEnabledJoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cannonJSPluginMod {
  
  @JSImport("babylonjs/Physics/Plugins/cannonJSPlugin", "CannonJSPlugin")
  @js.native
  class CannonJSPlugin ()
    extends StObject
       with IPhysicsEnginePlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, cannonInjection: js.Any) = this()
    
    var BJSCANNON: js.Any = js.native
    
    /* private */ var _addMaterial: js.Any = js.native
    
    /* private */ var _cannonRaycastResult: js.Any = js.native
    
    /* private */ var _checkWithEpsilon: js.Any = js.native
    
    /* private */ var _createHeightmap: js.Any = js.native
    
    /* private */ var _createShape: js.Any = js.native
    
    /* private */ var _extendNamespace: js.Any = js.native
    
    /* private */ var _firstFrame: js.Any = js.native
    
    /* private */ var _fixedTimeStep: js.Any = js.native
    
    /* private */ var _minus90X: js.Any = js.native
    
    /* private */ var _physicsBodysToRemoveAfterStep: js.Any = js.native
    
    /* private */ var _physicsMaterials: js.Any = js.native
    
    /* private */ var _plus90X: js.Any = js.native
    
    /* private */ var _processChildMeshes: js.Any = js.native
    
    /* private */ var _raycastResult: js.Any = js.native
    
    /* private */ var _removeMarkedPhysicsBodiesFromWorld: js.Any = js.native
    
    /* private */ var _tmpDeltaPosition: js.Any = js.native
    
    /* private */ var _tmpPosition: js.Any = js.native
    
    /* private */ var _tmpUnityRotation: js.Any = js.native
    
    /* private */ var _updatePhysicsBodyTransformation: js.Any = js.native
    
    /* private */ var _useDeltaForWorldStep: js.Any = js.native
    
    def setMotor(joint: IMotorEnabledJoint): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Double, motorIndex: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Unit, motorIndex: Double): Unit = js.native
  }
}
