package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintParameters
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType
import typings.babylonjs.physicsV2PhysicsAggregateMod.PhysicsAggregateParameters
import typings.babylonjs.physicsV2PhysicsEngineMod.PhysicsEngine
import typings.babylonjs.physicsV2PhysicsShapeMod.PhysicShapeOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2IndexMod {
  
  @JSImport("babylonjs/Physics/v2/index", "BallAndSocketConstraint")
  @js.native
  open class BallAndSocketConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.BallAndSocketConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "DistanceConstraint")
  @js.native
  open class DistanceConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.DistanceConstraint {
    def this(maxDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "HavokPlugin")
  @js.native
  open class HavokPlugin ()
    extends typings.babylonjs.physicsV2PluginsIndexMod.HavokPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, hpInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, hpInjection: Any) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "HingeConstraint")
  @js.native
  open class HingeConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.HingeConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "LockConstraint")
  @js.native
  open class LockConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.LockConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "Physics6DoFConstraint")
  @js.native
  open class Physics6DoFConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.Physics6DoFConstraint {
    def this(
      constraintParams: PhysicsConstraintParameters,
      limits: js.Array[typings.babylonjs.physicsV2PhysicsConstraintMod.Physics6DoFLimit],
      scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "Physics6DoFLimit")
  @js.native
  open class Physics6DoFLimit ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.Physics6DoFLimit
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsAggregate")
  @js.native
  open class PhysicsAggregate protected ()
    extends typings.babylonjs.physicsV2PhysicsAggregateMod.PhysicsAggregate {
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
    `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape
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
    `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape,
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
    `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape,
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
    `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape,
      _options: PhysicsAggregateParameters,
      _scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsBody")
  @js.native
  open class PhysicsBody protected ()
    extends typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody {
    /**
      * Constructs a new physics body for the given node.
      * @param transformNode - The Transform Node to construct the physics body for.
      * @param motionType - The motion type of the physics body. The options are:
      *  - PhysicsMotionType.STATIC - Static bodies are not moving and unaffected by forces or collisions. They are good for level boundaries or terrain.
      *  - PhysicsMotionType.DYNAMIC - Dynamic bodies are fully simulated. They can move and collide with other objects.
      *  - PhysicsMotionType.ANIMATED - They behave like dynamic bodies, but they won't be affected by other bodies, but still push other bodies out of the way.
      * @param startsAsleep - Whether the physics body should start in a sleeping state (not a guarantee). Defaults to false.
      * @param scene - The scene containing the physics engine.
      *
      * This code is useful for creating a physics body for a given Transform Node in a scene.
      * It checks the version of the physics engine and the physics plugin, and initializes the body accordingly.
      * It also sets the node's rotation quaternion if it is not already set. Finally, it adds the body to the physics engine.
      */
    def this(transformNode: TransformNode, motionType: PhysicsMotionType, startsAsleep: Boolean, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsConstraint")
  @js.native
  open class PhysicsConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.PhysicsConstraint {
    /**
      * Constructs a new constraint for the physics constraint.
      * @param type The type of constraint to create.
      * @param options The options for the constraint.
      * @param scene The scene the constraint belongs to.
      *
      * This code is useful for creating a new constraint for the physics engine. It checks if the scene has a physics engine, and if the plugin version is correct.
      * If all checks pass, it initializes the constraint with the given type and options.
      */
    def this(`type`: PhysicsConstraintType, options: PhysicsConstraintParameters, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsConstraintAxis")
  @js.native
  object PhysicsConstraintAxis extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis & Double
      ] = js.native
    
    /* 3 */ val ANGULAR_X: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.ANGULAR_X & Double = js.native
    
    /* 4 */ val ANGULAR_Y: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.ANGULAR_Y & Double = js.native
    
    /* 5 */ val ANGULAR_Z: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.ANGULAR_Z & Double = js.native
    
    /* 6 */ val LINEAR_DISTANCE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_DISTANCE & Double = js.native
    
    /* 0 */ val LINEAR_X: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_X & Double = js.native
    
    /* 1 */ val LINEAR_Y: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_Y & Double = js.native
    
    /* 2 */ val LINEAR_Z: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_Z & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsConstraintAxisLimitMode")
  @js.native
  object PhysicsConstraintAxisLimitMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode & Double
      ] = js.native
    
    /* 0 */ val FREE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode.FREE & Double = js.native
    
    /* 1 */ val LIMITED: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode.LIMITED & Double = js.native
    
    /* 2 */ val LOCKED: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode.LOCKED & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsConstraintMotorType")
  @js.native
  object PhysicsConstraintMotorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType & Double
      ] = js.native
    
    /* 0 */ val NONE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType.NONE & Double = js.native
    
    /* 2 */ val POSITION: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType.POSITION & Double = js.native
    
    /* 1 */ val VELOCITY: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType.VELOCITY & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsConstraintType")
  @js.native
  object PhysicsConstraintType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType & Double
      ] = js.native
    
    /* 1 */ val BALL_AND_SOCKET: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.BALL_AND_SOCKET & Double = js.native
    
    /* 2 */ val DISTANCE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.DISTANCE & Double = js.native
    
    /* 3 */ val HINGE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.HINGE & Double = js.native
    
    /* 5 */ val LOCK: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.LOCK & Double = js.native
    
    /* 6 */ val PRISMATIC: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.PRISMATIC & Double = js.native
    
    /* 7 */ val SIX_DOF: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.SIX_DOF & Double = js.native
    
    /* 4 */ val SLIDER: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.SLIDER & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsEngineV2")
  @js.native
  open class PhysicsEngineV2 protected () extends PhysicsEngine {
    /**
      * Creates a new Physics Engine
      * @param gravity defines the gravity vector used by the simulation
      * @param _physicsPlugin defines the plugin to use (CannonJS by default)
      */
    def this(gravity: Nullable[Vector3]) = this()
    def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePluginV2) = this()
  }
  /* static members */
  object PhysicsEngineV2 {
    
    @JSImport("babylonjs/Physics/v2/index", "PhysicsEngineV2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory used to create the default physics plugin.
      * @returns The default physics plugin
      */
    inline def DefaultPluginFactory(): IPhysicsEnginePluginV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPluginFactory")().asInstanceOf[IPhysicsEnginePluginV2]
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsMaterialCombineMode")
  @js.native
  object PhysicsMaterialCombineMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode & Double
      ] = js.native
    
    /* 3 */ val ARITHMETIC_MEAN: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.ARITHMETIC_MEAN & Double = js.native
    
    /* 0 */ val GEOMETRIC_MEAN: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.GEOMETRIC_MEAN & Double = js.native
    
    /* 2 */ val MAXIMUM: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.MAXIMUM & Double = js.native
    
    /* 1 */ val MINIMUM: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.MINIMUM & Double = js.native
    
    /* 4 */ val MULTIPLY: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.MULTIPLY & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsMotionType")
  @js.native
  object PhysicsMotionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType & Double] = js.native
    
    /* 1 */ val ANIMATED: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType.ANIMATED & Double = js.native
    
    /* 2 */ val DYNAMIC: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType.DYNAMIC & Double = js.native
    
    /* 0 */ val STATIC: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType.STATIC & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShape")
  @js.native
  open class PhysicsShape protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape {
    /**
      * Constructs a new physics shape.
      * @param options The options for the physics shape. These are:
      *  * type: The type of the shape. This can be one of the following: SPHERE, BOX, CAPSULE, CYLINDER, CONVEX_HULL, MESH, HEIGHTFIELD, CONTAINER
      *  * parameters: The parameters of the shape.
      *  * pluginData: The plugin data of the shape. This is used if you already have a reference to the object on the plugin side.
      * You need to specify either type or pluginData.
      * @param scene The scene the shape belongs to.
      *
      * This code is useful for creating a new physics shape with the given type, options, and scene.
      * It also checks that the physics engine and plugin version are correct.
      * If not, it throws an error. This ensures that the shape is created with the correct parameters and is compatible with the physics engine.
      */
    def this(options: PhysicShapeOptions, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeBox")
  @js.native
  open class PhysicsShapeBox protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox {
    /**
      *
      * @param center local center of the sphere
      * @param rotation local orientation
      * @param extents size of the box in each direction
      * @param scene scene to attach to
      */
    def this(center: Vector3, rotation: Quaternion, extents: Vector3, scene: Scene) = this()
  }
  /* static members */
  object PhysicsShapeBox {
    
    @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @param mesh
      * @returns PhysicsShapeBox
      */
    inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox]
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeCapsule")
  @js.native
  open class PhysicsShapeCapsule protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCapsule {
    /**
      *
      * @param pointA Starting point that defines the capsule segment
      * @param pointB ending point of that same segment
      * @param radius radius
      * @param scene scene to attach to
      */
    def this(pointA: Vector3, pointB: Vector3, radius: Double, scene: Scene) = this()
  }
  /* static members */
  object PhysicsShapeCapsule {
    
    @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeCapsule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Derive an approximate capsule from the transform node. Note, this is
      * not the optimal bounding capsule.
      * @param TransformNode node Node from which to derive a cylinder shape
      */
    inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCapsule = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCapsule]
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeContainer")
  @js.native
  open class PhysicsShapeContainer protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeContainer {
    /**
      * Constructor of the Shape container
      * @param scene scene to attach to
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeConvexHull")
  @js.native
  open class PhysicsShapeConvexHull protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeConvexHull {
    /**
      *
      * @param mesh the mesh to be used as topology infos for the convex hull
      * @param scene scene to attach to
      */
    def this(mesh: Mesh, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeCylinder")
  @js.native
  open class PhysicsShapeCylinder protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCylinder {
    /**
      *
      * @param pointA Starting point that defines the cylinder segment
      * @param pointB ending point of that same segment
      * @param radius radius
      * @param scene scene to attach to
      */
    def this(pointA: Vector3, pointB: Vector3, radius: Double, scene: Scene) = this()
  }
  /* static members */
  object PhysicsShapeCylinder {
    
    @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeCylinder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Derive an approximate cylinder from the transform node. Note, this is
      * not the optimal bounding cylinder.
      * @param TransformNode node Node from which to derive a cylinder shape
      */
    inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCylinder = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCylinder]
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeMesh")
  @js.native
  open class PhysicsShapeMesh protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeMesh {
    /**
      *
      * @param mesh the mesh topology that will be used to create the shape
      * @param scene scene to attach to
      */
    def this(mesh: Mesh, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeSphere")
  @js.native
  open class PhysicsShapeSphere protected ()
    extends typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere {
    /**
      * Constructor for the Sphere Shape
      * @param center local center of the sphere
      * @param radius radius
      * @param scene scene to attach to
      */
    def this(center: Vector3, radius: Double, scene: Scene) = this()
  }
  /* static members */
  object PhysicsShapeSphere {
    
    @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeSphere")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @param mesh
      * @returns PhysicsShapeSphere
      */
    inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere]
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PhysicsShapeType")
  @js.native
  object PhysicsShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType & Double] = js.native
    
    /* 3 */ val BOX: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.BOX & Double = js.native
    
    /* 1 */ val CAPSULE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CAPSULE & Double = js.native
    
    /* 5 */ val CONTAINER: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CONTAINER & Double = js.native
    
    /* 4 */ val CONVEX_HULL: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CONVEX_HULL & Double = js.native
    
    /* 2 */ val CYLINDER: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CYLINDER & Double = js.native
    
    /* 7 */ val HEIGHTFIELD: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.HEIGHTFIELD & Double = js.native
    
    /* 6 */ val MESH: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.MESH & Double = js.native
    
    /* 0 */ val SPHERE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.SPHERE & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/index", "PrismaticConstraint")
  @js.native
  open class PrismaticConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.PrismaticConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/index", "SliderConstraint")
  @js.native
  open class SliderConstraint protected ()
    extends typings.babylonjs.physicsV2PhysicsConstraintMod.SliderConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
}
