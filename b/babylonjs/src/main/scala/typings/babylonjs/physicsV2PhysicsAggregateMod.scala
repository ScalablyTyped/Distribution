package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterial
import typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsAggregateMod {
  
  @JSImport("babylonjs/Physics/v2/physicsAggregate", "PhysicsAggregate")
  @js.native
  open class PhysicsAggregate protected () extends StObject {
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType,
      _options: PhysicsAggregateParameters
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape,
      _options: PhysicsAggregateParameters
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType,
      _options: Unit,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType,
      _options: PhysicsAggregateParameters,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape,
      _options: Unit,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape,
      _options: PhysicsAggregateParameters,
      _scene: Scene
    ) = this()
    
    /* private */ var _addSizeOptions: Any = js.native
    
    /* private */ var _disposeShapeWhenDisposed: Any = js.native
    
    /* private */ var _getObjectBoundingBox: Any = js.native
    
    /* private */ var _nodeDisposeObserver: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * The body that is associated with this aggregate
      */
    var body: PhysicsBody = js.native
    
    /**
      * Releases the body, shape and material
      */
    def dispose(): Unit = js.native
    
    /**
      * The material that is associated with this aggregate
      */
    var material: PhysicsMaterial = js.native
    
    /**
      * The shape that is associated with this aggregate
      */
    var shape: PhysicsShape = js.native
    
    /**
      * The physics-enabled object used as the physics aggregate
      */
    var transformNode: TransformNode = js.native
    
    /**
      * The type of the physics aggregate
      */
    var `type`: PhysicsShapeType | PhysicsShape = js.native
  }
  
  trait PhysicsAggregateParameters extends StObject {
    
    /**
      * mesh local center
      */
    var center: js.UndefOr[Vector3] = js.undefined
    
    /**
      * Extents for box
      */
    var extents: js.UndefOr[Vector3] = js.undefined
    
    /**
      * The friction of the physics aggregate
      */
    var friction: js.UndefOr[Double] = js.undefined
    
    /**
      * The mass of the physics aggregate
      */
    var mass: Double
    
    /**
      * mesh object. Used for mesh and convex hull aggregates.
      */
    var mesh: js.UndefOr[Mesh] = js.undefined
    
    /**
      * Starting point for cylinder/capsule
      */
    var pointA: js.UndefOr[Vector3] = js.undefined
    
    /**
      * Ending point for cylinder/capsule
      */
    var pointB: js.UndefOr[Vector3] = js.undefined
    
    /**
      * Radius for sphere, cylinder and capsule
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * The coefficient of restitution of the physics aggregate
      */
    var restitution: js.UndefOr[Double] = js.undefined
    
    /**
      * Orientation for box
      */
    var rotation: js.UndefOr[Quaternion] = js.undefined
    
    /**
      * Physics engine will try to make this body sleeping and not active
      */
    var startAsleep: js.UndefOr[Boolean] = js.undefined
  }
  object PhysicsAggregateParameters {
    
    inline def apply(mass: Double): PhysicsAggregateParameters = {
      val __obj = js.Dynamic.literal(mass = mass.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsAggregateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsAggregateParameters] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: Vector3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setExtents(value: Vector3): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
      
      inline def setExtentsUndefined: Self = StObject.set(x, "extents", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMesh(value: Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
      
      inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
      
      inline def setPointA(value: Vector3): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
      
      inline def setPointAUndefined: Self = StObject.set(x, "pointA", js.undefined)
      
      inline def setPointB(value: Vector3): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
      
      inline def setPointBUndefined: Self = StObject.set(x, "pointB", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
      
      inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
      
      inline def setRotation(value: Quaternion): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStartAsleep(value: Boolean): Self = StObject.set(x, "startAsleep", value.asInstanceOf[js.Any])
      
      inline def setStartAsleepUndefined: Self = StObject.set(x, "startAsleep", js.undefined)
    }
  }
}
