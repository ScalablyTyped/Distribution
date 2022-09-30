package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEngine
import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsImpostorMod.PhysicsImpostorParameters
import typings.babylonjs.physicsJointMod.DistanceJointData
import typings.babylonjs.physicsJointMod.PhysicsJointData
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsIndexMod {
  
  @JSImport("babylonjs/Physics/index", "AmmoJSPlugin")
  @js.native
  /**
    * Initializes the ammoJS plugin
    * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
    * @param ammoInjection can be used to inject your own ammo reference
    * @param overlappingPairCache can be used to specify your own overlapping pair cache
    */
  open class AmmoJSPlugin ()
    extends typings.babylonjs.physicsPluginsIndexMod.AmmoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Any, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Unit, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Any, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Unit, overlappingPairCache: Any) = this()
  }
  /* static members */
  object AmmoJSPlugin {
    
    @JSImport("babylonjs/Physics/index", "AmmoJSPlugin._DISABLE_COLLISION_FLAG")
    @js.native
    val _DISABLE_COLLISION_FLAG: Any = js.native
    
    @JSImport("babylonjs/Physics/index", "AmmoJSPlugin._DISABLE_DEACTIVATION_FLAG")
    @js.native
    val _DISABLE_DEACTIVATION_FLAG: Any = js.native
    
    @JSImport("babylonjs/Physics/index", "AmmoJSPlugin._KINEMATIC_FLAG")
    @js.native
    val _KINEMATIC_FLAG: Any = js.native
  }
  
  @JSImport("babylonjs/Physics/index", "CannonJSPlugin")
  @js.native
  open class CannonJSPlugin ()
    extends typings.babylonjs.physicsPluginsIndexMod.CannonJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, cannonInjection: Any) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "DistanceJoint")
  @js.native
  open class DistanceJoint protected ()
    extends typings.babylonjs.physicsJointMod.DistanceJoint {
    /**
      *
      * @param jointData The data for the Distance-Joint
      */
    def this(jointData: DistanceJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "Hinge2Joint")
  @js.native
  open class Hinge2Joint protected ()
    extends typings.babylonjs.physicsJointMod.Hinge2Joint {
    /**
      * Initializes the Hinge2-Joint
      * @param jointData The joint data for the Hinge2-Joint
      */
    def this(jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "HingeJoint")
  @js.native
  open class HingeJoint protected ()
    extends typings.babylonjs.physicsJointMod.HingeJoint {
    /**
      * Initializes the Hinge-Joint
      * @param jointData The joint data for the Hinge-Joint
      */
    def this(jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "MotorEnabledJoint")
  @js.native
  open class MotorEnabledJoint protected ()
    extends typings.babylonjs.physicsJointMod.MotorEnabledJoint {
    /**
      * Initializes the Motor-Enabled Joint
      * @param type The type of the joint
      * @param jointData The physical joint data for the joint
      */
    def this(`type`: Double, jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "OimoJSPlugin")
  @js.native
  open class OimoJSPlugin ()
    extends typings.babylonjs.physicsPluginsIndexMod.OimoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, oimoInjection: Any) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsEngine")
  @js.native
  open class PhysicsEngine protected ()
    extends typings.babylonjs.physicsEngineMod.PhysicsEngine {
    /**
      * Creates a new Physics Engine
      * @param gravity defines the gravity vector used by the simulation
      * @param _physicsPlugin defines the plugin to use (CannonJS by default)
      */
    def this(gravity: Nullable[Vector3]) = this()
    def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
  }
  /* static members */
  object PhysicsEngine {
    
    @JSImport("babylonjs/Physics/index", "PhysicsEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory used to create the default physics plugin.
      * @returns The default physics plugin
      */
    inline def DefaultPluginFactory(): IPhysicsEnginePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPluginFactory")().asInstanceOf[IPhysicsEnginePlugin]
    
    /**
      * Global value used to control the smallest number supported by the simulation
      */
    @JSImport("babylonjs/Physics/index", "PhysicsEngine.Epsilon")
    @js.native
    def Epsilon: Double = js.native
    inline def Epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsEngineSceneComponent")
  @js.native
  open class PhysicsEngineSceneComponent protected ()
    extends typings.babylonjs.physicsEngineComponentMod.PhysicsEngineSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsHelper")
  @js.native
  open class PhysicsHelper protected ()
    extends typings.babylonjs.physicsHelperMod.PhysicsHelper {
    /**
      * Initializes the Physics helper
      * @param scene Babylon.js scene
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsImpostor")
  @js.native
  open class PhysicsImpostor protected ()
    extends typings.babylonjs.physicsImpostorMod.PhysicsImpostor {
    /**
      * Initializes the physics imposter
      * @param object The physics-enabled object used as the physics imposter
      * @param type The type of the physics imposter. Types are available as static members of this class.
      * @param _options The options for the physics imposter
      * @param _scene The Babylon scene
      */
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double,
      _options: PhysicsImpostorParameters
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double,
      _options: Unit,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double,
      _options: PhysicsImpostorParameters,
      _scene: Scene
    ) = this()
  }
  /* static members */
  object PhysicsImpostor {
    
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Box-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.BoxImpostor")
    @js.native
    def BoxImpostor: Double = js.native
    inline def BoxImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoxImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Capsule-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.CapsuleImpostor")
    @js.native
    def CapsuleImpostor: Double = js.native
    inline def CapsuleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CapsuleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cloth-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.ClothImpostor")
    @js.native
    def ClothImpostor: Double = js.native
    inline def ClothImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClothImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * ConvexHull-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.ConvexHullImpostor")
    @js.native
    def ConvexHullImpostor: Double = js.native
    inline def ConvexHullImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvexHullImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Custom-Imposter type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.CustomImpostor")
    @js.native
    def CustomImpostor: Double = js.native
    inline def CustomImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cylinder-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.CylinderImpostor")
    @js.native
    def CylinderImpostor: Double = js.native
    inline def CylinderImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CylinderImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The default object size of the imposter
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.DEFAULT_OBJECT_SIZE")
    @js.native
    def DEFAULT_OBJECT_SIZE: Vector3 = js.native
    inline def DEFAULT_OBJECT_SIZE_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OBJECT_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * Heightmap-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.HeightmapImpostor")
    @js.native
    def HeightmapImpostor: Double = js.native
    inline def HeightmapImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeightmapImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The identity quaternion of the imposter
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.IDENTITY_QUATERNION")
    @js.native
    def IDENTITY_QUATERNION: Quaternion = js.native
    inline def IDENTITY_QUATERNION_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY_QUATERNION")(x.asInstanceOf[js.Any])
    
    /**
      * Mesh-imposter type (Only available to objects with vertices data)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.MeshImpostor")
    @js.native
    def MeshImpostor: Double = js.native
    inline def MeshImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MeshImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * No-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.NoImpostor")
    @js.native
    def NoImpostor: Double = js.native
    inline def NoImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Particle-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.ParticleImpostor")
    @js.native
    def ParticleImpostor: Double = js.native
    inline def ParticleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParticleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Plane-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.PlaneImpostor")
    @js.native
    def PlaneImpostor: Double = js.native
    inline def PlaneImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlaneImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Rope-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.RopeImpostor")
    @js.native
    def RopeImpostor: Double = js.native
    inline def RopeImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RopeImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Softbody-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.SoftbodyImpostor")
    @js.native
    def SoftbodyImpostor: Double = js.native
    inline def SoftbodyImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SoftbodyImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Sphere-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.SphereImpostor")
    @js.native
    def SphereImpostor: Double = js.native
    inline def SphereImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SphereImpostor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsJoint")
  @js.native
  open class PhysicsJoint protected ()
    extends typings.babylonjs.physicsJointMod.PhysicsJoint {
    /**
      * Initializes the physics joint
      * @param type The type of the physics joint
      * @param jointData The data for the physics joint
      */
    def this(
      /**
      * The type of the physics joint
      */
    `type`: Double,
      /**
      * The data for the physics joint
      */
    jointData: PhysicsJointData
    ) = this()
  }
  /* static members */
  object PhysicsJoint {
    
    @JSImport("babylonjs/Physics/index", "PhysicsJoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Ball-and-Socket joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.BallAndSocketJoint")
    @js.native
    def BallAndSocketJoint: Double = js.native
    inline def BallAndSocketJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BallAndSocketJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Distance-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.DistanceJoint")
    @js.native
    def DistanceJoint: Double = js.native
    inline def DistanceJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DistanceJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Hinge-Joint 2 type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.Hinge2Joint")
    @js.native
    def Hinge2Joint: Double = js.native
    inline def Hinge2Joint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hinge2Joint")(x.asInstanceOf[js.Any])
    
    /**
      * Hinge-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.HingeJoint")
    @js.native
    def HingeJoint: Double = js.native
    inline def HingeJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HingeJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Lock-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.LockJoint")
    @js.native
    def LockJoint: Double = js.native
    inline def LockJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LockJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.PointToPointJoint")
    @js.native
    def PointToPointJoint: Double = js.native
    inline def PointToPointJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointToPointJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Prismatic-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.PrismaticJoint")
    @js.native
    def PrismaticJoint: Double = js.native
    inline def PrismaticJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrismaticJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Slider-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.SliderJoint")
    @js.native
    def SliderJoint: Double = js.native
    inline def SliderJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Spring-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.SpringJoint")
    @js.native
    def SpringJoint: Double = js.native
    inline def SpringJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpringJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Universal-Joint type
      * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.UniversalJoint")
    @js.native
    def UniversalJoint: Double = js.native
    inline def UniversalJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniversalJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Wheel-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.WheelJoint")
    @js.native
    def WheelJoint: Double = js.native
    inline def WheelJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelJoint")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsRadialExplosionEventOptions")
  @js.native
  open class PhysicsRadialExplosionEventOptions ()
    extends typings.babylonjs.physicsHelperMod.PhysicsRadialExplosionEventOptions
  
  @JSImport("babylonjs/Physics/index", "PhysicsRadialImpulseFalloff")
  @js.native
  object PhysicsRadialImpulseFalloff extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff & Double] = js.native
    
    /* 0 */ val Constant: typings.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff.Constant & Double = js.native
    
    /* 1 */ val Linear: typings.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff.Linear & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsUpdraftEventOptions")
  @js.native
  open class PhysicsUpdraftEventOptions ()
    extends typings.babylonjs.physicsHelperMod.PhysicsUpdraftEventOptions
  
  @JSImport("babylonjs/Physics/index", "PhysicsUpdraftMode")
  @js.native
  object PhysicsUpdraftMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.physicsHelperMod.PhysicsUpdraftMode & Double] = js.native
    
    /* 0 */ val Center: typings.babylonjs.physicsHelperMod.PhysicsUpdraftMode.Center & Double = js.native
    
    /* 1 */ val Perpendicular: typings.babylonjs.physicsHelperMod.PhysicsUpdraftMode.Perpendicular & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsVortexEventOptions")
  @js.native
  open class PhysicsVortexEventOptions ()
    extends typings.babylonjs.physicsHelperMod.PhysicsVortexEventOptions
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /** @internal */
      var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
      
      /** @internal */
      var _physicsImpostor: Nullable[typings.babylonjs.physicsImpostorMod.PhysicsImpostor] = js.native
      
      /** Apply a physic impulse to the mesh
        * @param force defines the force to apply
        * @param contactPoint defines where to apply the force
        * @returns the current mesh
        * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
        */
      def applyImpulse(force: Vector3, contactPoint: Vector3): typings.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
      
      /**
        * Gets the current physics impostor
        * @see https://doc.babylonjs.com/features/physics_engine
        * @returns a physics impostor or null
        */
      def getPhysicsImpostor(): Nullable[typings.babylonjs.physicsImpostorMod.PhysicsImpostor] = js.native
      
      /**
        * Gets or sets impostor used for physic simulation
        * @see https://doc.babylonjs.com/features/physics_engine
        */
      var physicsImpostor: Nullable[typings.babylonjs.physicsImpostorMod.PhysicsImpostor] = js.native
      
      /**
        * Creates a physic joint between two meshes
        * @param otherMesh defines the other mesh to use
        * @param pivot1 defines the pivot to use on this mesh
        * @param pivot2 defines the pivot to use on the other mesh
        * @param options defines additional options (can be plugin dependent)
        * @returns the current mesh
        * @see https://www.babylonjs-playground.com/#0BS5U0#0
        */
      def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): typings.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
      def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: Any): typings.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
      var _physicsEngine: Nullable[IPhysicsEngine] = js.native
      
      /** @internal */
      var _physicsTimeAccumulator: Double = js.native
      
      /**
        * Deletes a physics compound impostor
        * @param compound defines the compound to delete
        */
      def deleteCompoundImpostor(compound: Any): Unit = js.native
      
      /**
        * Disables and disposes the physics engine associated with the scene
        */
      def disablePhysicsEngine(): Unit = js.native
      
      /**
        * Enables physics to the current scene
        * @param gravity defines the scene's gravity for the physics engine. defaults to real earth gravity : (0, -9.81, 0)
        * @param plugin defines the physics engine to be used. defaults to CannonJS.
        * @returns a boolean indicating if the physics engine was initialized
        */
      def enablePhysics(): Boolean = js.native
      def enablePhysics(gravity: Unit, plugin: IPhysicsEnginePlugin): Boolean = js.native
      def enablePhysics(gravity: Nullable[Vector3]): Boolean = js.native
      def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePlugin): Boolean = js.native
      
      /**
        * Gets the current physics engine
        * @returns a IPhysicsEngine or null if none attached
        */
      def getPhysicsEngine(): Nullable[IPhysicsEngine] = js.native
      
      /**
        * Gets a boolean indicating if there is an active physics engine
        * @returns a boolean indicating if there is an active physics engine
        */
      def isPhysicsEnabled(): Boolean = js.native
      
      /**
        * An event triggered when physic simulation has been done
        */
      var onAfterPhysicsObservable: Observable[typings.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
      
      /**
        * An event triggered when physic simulation is about to be run
        */
      var onBeforePhysicsObservable: Observable[typings.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
    }
  }
}
