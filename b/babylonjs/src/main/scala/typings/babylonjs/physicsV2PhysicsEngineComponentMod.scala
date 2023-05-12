package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsEngineComponentMod {
  
  /* augmented module */
  object babylonjsMeshesTransformNodeAugmentingMod {
    
    /**
      *
      */
    /** @internal */
    trait TransformNode extends StObject {
      
      /** @internal */
      var _disposePhysicsObserver: Nullable[Observer[Node]]
      
      /** @internal */
      var _physicsBody: Nullable[PhysicsBody]
      
      /** Apply a physic impulse to the mesh
        * @param force defines the force to apply
        * @param contactPoint defines where to apply the force
        * @returns the current mesh
        */
      def applyImpulse(force: Vector3, contactPoint: Vector3): TransformNode
      
      /**
        *
        */
      def getPhysicsBody(): Nullable[PhysicsBody]
      
      /**
        * @see
        */
      var physicsBody: Nullable[PhysicsBody]
    }
    object TransformNode {
      
      inline def apply(applyImpulse: (Vector3, Vector3) => TransformNode, getPhysicsBody: () => Nullable[PhysicsBody]): TransformNode = {
        val __obj = js.Dynamic.literal(applyImpulse = js.Any.fromFunction2(applyImpulse), getPhysicsBody = js.Any.fromFunction0(getPhysicsBody), _disposePhysicsObserver = null, _physicsBody = null, physicsBody = null)
        __obj.asInstanceOf[TransformNode]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TransformNode] (val x: Self) extends AnyVal {
        
        inline def setApplyImpulse(value: (Vector3, Vector3) => TransformNode): Self = StObject.set(x, "applyImpulse", js.Any.fromFunction2(value))
        
        inline def setGetPhysicsBody(value: () => Nullable[PhysicsBody]): Self = StObject.set(x, "getPhysicsBody", js.Any.fromFunction0(value))
        
        inline def setPhysicsBody(value: Nullable[PhysicsBody]): Self = StObject.set(x, "physicsBody", value.asInstanceOf[js.Any])
        
        inline def setPhysicsBodyNull: Self = StObject.set(x, "physicsBody", null)
        
        inline def set_disposePhysicsObserver(value: Nullable[Observer[Node]]): Self = StObject.set(x, "_disposePhysicsObserver", value.asInstanceOf[js.Any])
        
        inline def set_disposePhysicsObserverNull: Self = StObject.set(x, "_disposePhysicsObserver", null)
        
        inline def set_physicsBody(value: Nullable[PhysicsBody]): Self = StObject.set(x, "_physicsBody", value.asInstanceOf[js.Any])
        
        inline def set_physicsBodyNull: Self = StObject.set(x, "_physicsBody", null)
      }
    }
  }
}
