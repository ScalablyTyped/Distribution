package typings.babylonjs

import typings.babylonjs.cullingBoundingBoxMod.BoundingBox
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeParameters
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType
import typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterial
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsShapeMod {
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShape")
  @js.native
  open class PhysicsShape protected () extends StObject {
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
    
    /* private */ var _material: Any = js.native
    
    /**
      * The V2 plugin used to create and manage this Physics Body
      */
    /* private */ var _physicsPlugin: Any = js.native
    
    /**
      * V2 Physics plugin private data for single shape
      */
    var _pluginData: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    /**
      * Adds a child shape to a container with an optional transform
      * @param newChild The new PhysicsShape to add
      * @param translation Optional position of the child shape relative to this shape
      * @param rotation Optional rotation of the child shape relative to this shape
      * @param scale Optional scale of the child shape relative to this shape
      */
    def addChild(newChild: PhysicsShape): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Unit, rotation: Unit, scale: Vector3): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Unit, rotation: Quaternion): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Unit, rotation: Quaternion, scale: Vector3): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Vector3): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Vector3, rotation: Unit, scale: Vector3): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Vector3, rotation: Quaternion): Unit = js.native
    def addChild(newChild: PhysicsShape, translation: Vector3, rotation: Quaternion, scale: Vector3): Unit = js.native
    
    /**
      * Utility to add a child shape to this container,
      * automatically computing the relative transform between
      * the container shape and the child instance.
      *
      * @param parentTransform The transform node associated with this shape
      * @param newChild The new PhysicsShape to add
      * @param childTransform The transform node associated with the child shape
      */
    def addChildFromParent(parentTransform: TransformNode, newChild: PhysicsShape, childTransform: TransformNode): Unit = js.native
    
    /**
      *
      */
    def density: Double = js.native
    /**
      *
      * @param density
      */
    def density_=(density: Double): Unit = js.native
    
    /**
      *
      */
    def dispose(): Unit = js.native
    
    /**
      *
      * @returns Bitmask of categories that this shape should collide with
      */
    def filterCollideMask: Double = js.native
    /**
      * Sets the collide mask of a shape. This is a bitfield of arbitrary
      * "categories" to which this shape collides with. Given two shapes,
      * the engine will check if the collide mask and membership overlap:
      * shapeA.filterMembershipMask & shapeB.filterCollideMask
      *
      * If this value is zero (i.e. shapeB only collides with categories
      * which shapeA is _not_ a member of) then the shapes will not collide.
      *
      * Note, the engine will also perform the same test with shapeA and
      * shapeB swapped; the shapes will not collide if either shape has
      * a collideMask which prevents collision with the other shape.
      *
      * @param collideMask Bitmask of categories this shape should collide with
      */
    def filterCollideMask_=(collideMask: Double): Unit = js.native
    
    /**
      * Get the membership mask of a shape.
      * @returns Bitmask of categories which this shape is a member of.
      */
    def filterMembershipMask: Double = js.native
    /**
      * Set the membership mask of a shape. This is a bitfield of arbitrary
      * "categories" to which the shape is a member. This is used in combination
      * with the collide mask to determine if this shape should collide with
      * another.
      *
      * @param membershipMask Bitfield of categories of this shape.
      */
    def filterMembershipMask_=(membershipMask: Double): Unit = js.native
    
    /**
      *
      */
    def getBoundingBox(): BoundingBox = js.native
    
    /**
      * Returns the string "PhysicsShape".
      * @returns "PhysicsShape"
      */
    def getClassName(): String = js.native
    
    /**
      *
      * @returns
      */
    def getNumChildren(): Double = js.native
    
    /**
      *
      * @returns
      */
    def material: PhysicsMaterial = js.native
    /**
      *
      * @param material
      */
    def material_=(material: PhysicsMaterial): Unit = js.native
    
    /**
      *
      * @param childIndex
      */
    def removeChild(childIndex: Double): Unit = js.native
    
    /**
      *
      */
    def `type`: PhysicsShapeType = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeBox")
  @js.native
  open class PhysicsShapeBox protected () extends PhysicsShape {
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
    
    @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @param mesh
      * @returns PhysicsShapeBox
      */
    inline def FromMesh(mesh: AbstractMesh): PhysicsShapeBox = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[PhysicsShapeBox]
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeCapsule")
  @js.native
  open class PhysicsShapeCapsule protected () extends PhysicsShape {
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
    
    @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeCapsule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Derive an approximate capsule from the transform node. Note, this is
      * not the optimal bounding capsule.
      * @param TransformNode node Node from which to derive a cylinder shape
      */
    inline def FromMesh(mesh: AbstractMesh): PhysicsShapeCapsule = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[PhysicsShapeCapsule]
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeContainer")
  @js.native
  open class PhysicsShapeContainer protected () extends PhysicsShape {
    /**
      * Constructor of the Shape container
      * @param scene scene to attach to
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeConvexHull")
  @js.native
  open class PhysicsShapeConvexHull protected () extends PhysicsShape {
    /**
      *
      * @param mesh the mesh to be used as topology infos for the convex hull
      * @param scene scene to attach to
      */
    def this(mesh: Mesh, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeCylinder")
  @js.native
  open class PhysicsShapeCylinder protected () extends PhysicsShape {
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
    
    @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeCylinder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Derive an approximate cylinder from the transform node. Note, this is
      * not the optimal bounding cylinder.
      * @param TransformNode node Node from which to derive a cylinder shape
      */
    inline def FromMesh(mesh: AbstractMesh): PhysicsShapeCylinder = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[PhysicsShapeCylinder]
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeMesh")
  @js.native
  open class PhysicsShapeMesh protected () extends PhysicsShape {
    /**
      *
      * @param mesh the mesh topology that will be used to create the shape
      * @param scene scene to attach to
      */
    def this(mesh: Mesh, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeSphere")
  @js.native
  open class PhysicsShapeSphere protected () extends PhysicsShape {
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
    
    @JSImport("babylonjs/Physics/v2/physicsShape", "PhysicsShapeSphere")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @param mesh
      * @returns PhysicsShapeSphere
      */
    inline def FromMesh(mesh: AbstractMesh): PhysicsShapeSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[PhysicsShapeSphere]
  }
  
  trait PhysicShapeOptions extends StObject {
    
    /**
      * The parameters of the shape. Varies depending of the shape type.
      */
    var parameters: js.UndefOr[PhysicsShapeParameters] = js.undefined
    
    /**
      * Reference to an already existing physics shape in the plugin.
      */
    var pluginData: js.UndefOr[Any] = js.undefined
    
    /**
      * The type of the shape. This can be one of the following: SPHERE, BOX, CAPSULE, CYLINDER, CONVEX_HULL, MESH, HEIGHTFIELD, CONTAINER
      */
    var `type`: js.UndefOr[PhysicsShapeType] = js.undefined
  }
  object PhysicShapeOptions {
    
    inline def apply(): PhysicShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicShapeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicShapeOptions] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: PhysicsShapeParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
      
      inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
      
      inline def setType(value: PhysicsShapeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
