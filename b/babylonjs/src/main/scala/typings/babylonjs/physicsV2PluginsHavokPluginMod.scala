package typings.babylonjs

import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMassProperties
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.physicsV2PhysicsConstraintMod.PhysicsConstraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PluginsHavokPluginMod {
  
  @JSImport("babylonjs/Physics/v2/Plugins/havokPlugin", "HavokPlugin")
  @js.native
  open class HavokPlugin ()
    extends StObject
       with IPhysicsEnginePluginV2 {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, hpInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, hpInjection: Any) = this()
    
    /* private */ var _applyToBodyOrInstances: Any = js.native
    
    /* private */ var _bQuatToV4: Any = js.native
    
    /* private */ var _bVecToV3: Any = js.native
    
    /* private */ var _bodies: Any = js.native
    
    /* private */ var _bodyBuffer: Any = js.native
    
    /* private */ var _bodyCollisionObservable: Any = js.native
    
    /* private */ var _constraintAxisToNative: Any = js.native
    
    /* private */ var _constraintMotorTypeToNative: Any = js.native
    
    /* private */ var _createOrUpdateBodyInstances: Any = js.native
    
    /* private */ var _fixedTimeStep: Any = js.native
    
    /* private */ var _fromMassPropertiesTuple: Any = js.native
    
    /**
      * Returns a reference to the first instance of the plugin data for a physics body.
      * @param body
      * @param instanceIndex
      * @returns a reference to the first instance
      */
    /* private */ var _getPluginReference: Any = js.native
    
    /**
      * Gets the transform infos of a given transform node.
      * @param node - The transform node.
      * @returns An array containing the position and orientation of the node.
      * This code is useful for getting the position and orientation of a given transform node.
      * It first checks if the node has a rotation quaternion, and if not, it creates one from the node's rotation.
      * It then creates an array containing the position and orientation of the node and returns it.
      */
    /* private */ var _getTransformInfos: Any = js.native
    
    /**
      * Reference to the WASM library
      */
    var _hknp: Any = js.native
    
    /* private */ var _internalComputeMassProperties: Any = js.native
    
    def _internalSetMotionType(pluginData: BodyPluginData, motionType: PhysicsMotionType): Unit = js.native
    
    /* private */ var _internalUpdateMassProperties: Any = js.native
    
    /* private */ var _limitModeToNative: Any = js.native
    
    /* private */ var _materialCombineToNative: Any = js.native
    
    /* private */ var _nativeToLimitMode: Any = js.native
    
    /* private */ var _nativeToMotorType: Any = js.native
    
    /**
      * Runs thru all detected collisions and filter by body
      */
    /* private */ var _notifyCollisions: Any = js.native
    
    /**
      * We only have a single raycast in-flight right now
      */
    /* private */ var _queryCollector: Any = js.native
    
    /* private */ var _timeStep: Any = js.native
    
    /* private */ var _tmpVec3: Any = js.native
    
    /* private */ var _useDeltaForWorldStep: Any = js.native
    
    /* private */ var _v3ToBvecRef: Any = js.native
    
    def initConstraint(constraint: PhysicsConstraint, body: PhysicsBody, childBody: PhysicsBody, instanceIndex: Double): Unit = js.native
    def initConstraint(
      constraint: PhysicsConstraint,
      body: PhysicsBody,
      childBody: PhysicsBody,
      instanceIndex: Double,
      childInstanceIndex: Double
    ): Unit = js.native
    def initConstraint(
      constraint: PhysicsConstraint,
      body: PhysicsBody,
      childBody: PhysicsBody,
      instanceIndex: Unit,
      childInstanceIndex: Double
    ): Unit = js.native
    
    /**
      * If this plugin is supported
      * @returns true if its supported
      */
    def isSupported(): Boolean = js.native
    
    /**
      * Gets the number of bodies in the world
      */
    def numBodies: Any = js.native
    
    /**
      * Sets the transformation of the given physics body to the given transform node.
      * @param body The physics body to set the transformation for.
      * @param node The transform node to set the transformation from.
      * Sets the transformation of the given physics body to the given transform node.
      *
      * This function is useful for setting the transformation of a physics body to a
      * transform node, which is necessary for the physics engine to accurately simulate
      * the motion of the body. It also takes into account instances of the transform
      * node, which is necessary for accurate simulation of multiple bodies with the
      * same transformation.
      */
    def setPhysicsBodyTransformation(body: PhysicsBody, node: TransformNode): Unit = js.native
  }
  
  trait BodyPluginData extends StObject {
    
    var hpBodyId: Any
    
    var userMassProps: PhysicsMassProperties
    
    var worldTransformOffset: Double
  }
  object BodyPluginData {
    
    inline def apply(hpBodyId: Any, userMassProps: PhysicsMassProperties, worldTransformOffset: Double): BodyPluginData = {
      val __obj = js.Dynamic.literal(hpBodyId = hpBodyId.asInstanceOf[js.Any], userMassProps = userMassProps.asInstanceOf[js.Any], worldTransformOffset = worldTransformOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyPluginData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyPluginData] (val x: Self) extends AnyVal {
      
      inline def setHpBodyId(value: Any): Self = StObject.set(x, "hpBodyId", value.asInstanceOf[js.Any])
      
      inline def setUserMassProps(value: PhysicsMassProperties): Self = StObject.set(x, "userMassProps", value.asInstanceOf[js.Any])
      
      inline def setWorldTransformOffset(value: Double): Self = StObject.set(x, "worldTransformOffset", value.asInstanceOf[js.Any])
    }
  }
}
