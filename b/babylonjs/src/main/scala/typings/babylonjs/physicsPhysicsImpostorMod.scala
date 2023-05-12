package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.physicsV1PhysicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostorParameters
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPhysicsImpostorMod {
  
  @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor")
  @js.native
  open class PhysicsImpostor protected ()
    extends typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostor {
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
    
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Box-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.BoxImpostor")
    @js.native
    def BoxImpostor: Double = js.native
    inline def BoxImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoxImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Capsule-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.CapsuleImpostor")
    @js.native
    def CapsuleImpostor: Double = js.native
    inline def CapsuleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CapsuleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cloth-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.ClothImpostor")
    @js.native
    def ClothImpostor: Double = js.native
    inline def ClothImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClothImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * ConvexHull-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.ConvexHullImpostor")
    @js.native
    def ConvexHullImpostor: Double = js.native
    inline def ConvexHullImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvexHullImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Custom-Imposter type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.CustomImpostor")
    @js.native
    def CustomImpostor: Double = js.native
    inline def CustomImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cylinder-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.CylinderImpostor")
    @js.native
    def CylinderImpostor: Double = js.native
    inline def CylinderImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CylinderImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The default object size of the imposter
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.DEFAULT_OBJECT_SIZE")
    @js.native
    def DEFAULT_OBJECT_SIZE: Vector3 = js.native
    inline def DEFAULT_OBJECT_SIZE_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OBJECT_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * Heightmap-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.HeightmapImpostor")
    @js.native
    def HeightmapImpostor: Double = js.native
    inline def HeightmapImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeightmapImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The identity quaternion of the imposter
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.IDENTITY_QUATERNION")
    @js.native
    def IDENTITY_QUATERNION: Quaternion = js.native
    inline def IDENTITY_QUATERNION_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY_QUATERNION")(x.asInstanceOf[js.Any])
    
    /**
      * Mesh-imposter type (Only available to objects with vertices data)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.MeshImpostor")
    @js.native
    def MeshImpostor: Double = js.native
    inline def MeshImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MeshImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * No-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.NoImpostor")
    @js.native
    def NoImpostor: Double = js.native
    inline def NoImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Particle-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.ParticleImpostor")
    @js.native
    def ParticleImpostor: Double = js.native
    inline def ParticleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParticleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Plane-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.PlaneImpostor")
    @js.native
    def PlaneImpostor: Double = js.native
    inline def PlaneImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlaneImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Rope-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.RopeImpostor")
    @js.native
    def RopeImpostor: Double = js.native
    inline def RopeImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RopeImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Softbody-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.SoftbodyImpostor")
    @js.native
    def SoftbodyImpostor: Double = js.native
    inline def SoftbodyImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SoftbodyImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Sphere-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.SphereImpostor")
    @js.native
    def SphereImpostor: Double = js.native
    inline def SphereImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SphereImpostor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
}
