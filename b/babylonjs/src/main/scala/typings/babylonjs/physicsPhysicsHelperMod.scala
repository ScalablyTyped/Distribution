package typings.babylonjs

import typings.babylonjs.anon.DiameterSegments
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPhysicsHelperMod {
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsHelper")
  @js.native
  open class PhysicsHelper protected () extends StObject {
    /**
      * Initializes the Physics helper
      * @param scene Babylon.js scene
      */
    def this(scene: Scene) = this()
    
    /* private */ var _applicationForBodies: Any = js.native
    
    /* private */ var _copyPhysicsHitData: Any = js.native
    
    /* private */ var _hitData: Any = js.native
    
    /* private */ var _physicsEngine: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * Applies a radial explosion force
      * @param origin the origin of the explosion
      * @param radiusOrEventOptions the radius or the options of radial explosion
      * @param strength the explosion strength
      * @param falloff possible options: Constant & Linear. Defaults to Constant
      * @returns A physics radial explosion event, or null
      */
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Unit,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Unit,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    
    /**
      * Applies a radial explosion impulse
      * @param origin the origin of the explosion
      * @param radiusOrEventOptions the radius or the options of radial explosion
      * @param strength the explosion strength
      * @param falloff possible options: Constant & Linear. Defaults to Constant
      * @returns A physics radial explosion event, or null
      */
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Unit,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Unit,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    
    /**
      * Creates a gravitational field
      * @param origin the origin of the gravitational field
      * @param radiusOrEventOptions the radius or the options of radial gravitational field
      * @param strength the gravitational field strength
      * @param falloff possible options: Constant & Linear. Defaults to Constant
      * @returns A physics gravitational field event, or null
      */
    def gravitationalField(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Unit,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Unit,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    
    /**
      * Creates a physics updraft event
      * @param origin the origin of the updraft
      * @param radiusOrEventOptions the radius or the options of the updraft
      * @param strength the strength of the updraft
      * @param height the height of the updraft
      * @param updraftMode possible options: Center & Perpendicular. Defaults to Center
      * @returns A physics updraft event, or null
      */
    def updraft(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Double, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      height: Unit,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Unit, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Unit,
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Unit,
      height: Unit,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions, strength: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Double,
      height: Double
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Double,
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Double,
      height: Unit,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions, strength: Unit, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Unit,
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Unit,
      height: Unit,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    
    /**
      * Creates a physics vortex event
      * @param origin the of the vortex
      * @param radiusOrEventOptions the radius or the options of the vortex
      * @param strength the strength of the vortex
      * @param height   the height of the vortex
      * @returns a Physics vortex event, or null
      * A physics vortex event or null
      */
    def vortex(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Double, height: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Unit, height: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Double, height: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Unit, height: Double): Nullable[PhysicsVortexEvent] = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsRadialExplosionEventOptions")
  @js.native
  open class PhysicsRadialExplosionEventOptions () extends StObject {
    
    /**
      * Sphere options for the radial explosion.
      */
    def affectedBodiesCallback(affectedBodiesWithData: js.Array[PhysicsAffectedBodyWithData]): Unit = js.native
    
    /**
      * Sphere options for the radial explosion.
      */
    def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
    
    /**
      * The strength of the force in correspondence to the distance of the affected object
      */
    var falloff: PhysicsRadialImpulseFalloff = js.native
    
    /**
      * The radius of the sphere for the radial explosion.
      */
    var radius: Double = js.native
    
    /**
      * Sphere options for the radial explosion.
      */
    var sphere: DiameterSegments = js.native
    
    /**
      * The strength of the explosion.
      */
    var strength: Double = js.native
  }
  
  @js.native
  sealed trait PhysicsRadialImpulseFalloff extends StObject
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsRadialImpulseFalloff")
  @js.native
  object PhysicsRadialImpulseFalloff extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicsRadialImpulseFalloff & Double] = js.native
    
    /** Defines that impulse is constant in strength across it's whole radius */
    @js.native
    sealed trait Constant
      extends StObject
         with PhysicsRadialImpulseFalloff
    /* 0 */ val Constant: typings.babylonjs.physicsPhysicsHelperMod.PhysicsRadialImpulseFalloff.Constant & Double = js.native
    
    /** Defines that impulse gets weaker if it's further from the origin */
    @js.native
    sealed trait Linear
      extends StObject
         with PhysicsRadialImpulseFalloff
    /* 1 */ val Linear: typings.babylonjs.physicsPhysicsHelperMod.PhysicsRadialImpulseFalloff.Linear & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsUpdraftEventOptions")
  @js.native
  open class PhysicsUpdraftEventOptions () extends StObject {
    
    /**
      * The height of the cylinder for the updraft.
      */
    var height: Double = js.native
    
    /**
      * The radius of the cylinder for the vortex
      */
    var radius: Double = js.native
    
    /**
      * The strength of the updraft.
      */
    var strength: Double = js.native
    
    /**
      * The mode for the the updraft.
      */
    var updraftMode: PhysicsUpdraftMode = js.native
  }
  
  @js.native
  sealed trait PhysicsUpdraftMode extends StObject
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsUpdraftMode")
  @js.native
  object PhysicsUpdraftMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicsUpdraftMode & Double] = js.native
    
    /** Defines that the upstream forces will pull towards the top center of the cylinder */
    @js.native
    sealed trait Center
      extends StObject
         with PhysicsUpdraftMode
    /* 0 */ val Center: typings.babylonjs.physicsPhysicsHelperMod.PhysicsUpdraftMode.Center & Double = js.native
    
    /** Defines that once a impostor is inside the cylinder, it will shoot out perpendicular from the ground of the cylinder */
    @js.native
    sealed trait Perpendicular
      extends StObject
         with PhysicsUpdraftMode
    /* 1 */ val Perpendicular: typings.babylonjs.physicsPhysicsHelperMod.PhysicsUpdraftMode.Perpendicular & Double = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsVortexEventOptions")
  @js.native
  open class PhysicsVortexEventOptions () extends StObject {
    
    /**
      * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the threshold.
      */
    var centrifugalForceMultiplier: Double = js.native
    
    /**
      * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the threshold.
      */
    var centripetalForceMultiplier: Double = js.native
    
    /**
      * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
      */
    var centripetalForceThreshold: Double = js.native
    
    /**
      * The height of the cylinder for the vortex.
      */
    var height: Double = js.native
    
    /**
      * The radius of the cylinder for the vortex
      */
    var radius: Double = js.native
    
    /**
      * The strength of the vortex.
      */
    var strength: Double = js.native
    
    /**
      * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
      */
    var updraftForceMultiplier: Double = js.native
  }
  
  trait PhysicsAffectedBodyWithData extends StObject {
    
    /**
      * The impostor affected by the effect
      */
    var body: PhysicsBody
    
    /**
      * The data about the hit/force from the explosion
      */
    var hitData: PhysicsHitData
  }
  object PhysicsAffectedBodyWithData {
    
    inline def apply(body: PhysicsBody, hitData: PhysicsHitData): PhysicsAffectedBodyWithData = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hitData = hitData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsAffectedBodyWithData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsAffectedBodyWithData] (val x: Self) extends AnyVal {
      
      inline def setBody(value: PhysicsBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHitData(value: PhysicsHitData): Self = StObject.set(x, "hitData", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhysicsAffectedImpostorWithData extends StObject {
    
    /**
      * The data about the hit/force from the explosion
      */
    var hitData: PhysicsHitData
    
    /**
      * The impostor affected by the effect
      */
    var impostor: PhysicsImpostor
  }
  object PhysicsAffectedImpostorWithData {
    
    inline def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
      val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsAffectedImpostorWithData] (val x: Self) extends AnyVal {
      
      inline def setHitData(value: PhysicsHitData): Self = StObject.set(x, "hitData", value.asInstanceOf[js.Any])
      
      inline def setImpostor(value: PhysicsImpostor): Self = StObject.set(x, "impostor", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a gravitational field event
    */
  @js.native
  trait PhysicsGravitationalFieldEvent extends StObject {
    
    /* private */ var _dataFetched: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _origin: Any = js.native
    
    /* private */ var _physicsHelper: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _sphere: Any = js.native
    
    /* private */ var _tick: Any = js.native
    
    /* private */ var _tickCallback: Any = js.native
    
    /**
      * Disables the gravitational field.
      */
    def disable(): Unit = js.native
    
    /**
      * Disposes the sphere.
      * @param force The force to dispose from the gravitational field event
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Enables the gravitational field.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the data related to the gravitational field event (sphere).
      * @returns A gravitational field event
      */
    def getData(): PhysicsGravitationalFieldEventData = js.native
  }
  
  trait PhysicsGravitationalFieldEventData extends StObject {
    
    /**
      * A sphere mesh used for the gravitational field event
      */
    var sphere: Mesh
  }
  object PhysicsGravitationalFieldEventData {
    
    inline def apply(sphere: Mesh): PhysicsGravitationalFieldEventData = {
      val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsGravitationalFieldEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsGravitationalFieldEventData] (val x: Self) extends AnyVal {
      
      inline def setSphere(value: Mesh): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhysicsHitData extends StObject {
    
    /**
      * The contact point
      */
    var contactPoint: Vector3
    
    /**
      * The distance from the origin to the contact point
      */
    var distanceFromOrigin: Double
    
    /**
      * The force applied at the contact point
      */
    var force: Vector3
    
    /**
      * For an instanced physics body (mesh with thin instances), the index of the thin instance the hit applies to
      */
    var instanceIndex: js.UndefOr[Double] = js.undefined
  }
  object PhysicsHitData {
    
    inline def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
      val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsHitData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsHitData] (val x: Self) extends AnyVal {
      
      inline def setContactPoint(value: Vector3): Self = StObject.set(x, "contactPoint", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromOrigin(value: Double): Self = StObject.set(x, "distanceFromOrigin", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Vector3): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setInstanceIndex(value: Double): Self = StObject.set(x, "instanceIndex", value.asInstanceOf[js.Any])
      
      inline def setInstanceIndexUndefined: Self = StObject.set(x, "instanceIndex", js.undefined)
    }
  }
  
  /**
    * Represents a physics radial explosion event
    */
  @js.native
  trait PhysicsRadialExplosionEvent extends StObject {
    
    /* private */ var _dataFetched: Any = js.native
    
    /* private */ var _getHitData: Any = js.native
    
    /* private */ var _intersectsWithSphere: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /*** Helpers ***/
    /* private */ var _prepareSphere: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _sphere: Any = js.native
    
    /**
      * Disposes the sphere.
      * @param force Specifies if the sphere should be disposed by force
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Returns the force and contact point of the body or false, if the body is not affected by the force/impulse.
      * @param body A physics body where the transform node is an AbstractMesh
      * @param origin the origin of the explosion
      * @param data the data of the hit
      * @param instanceIndex the instance index of the body
      * @returns if there was a hit
      */
    def getBodyHitData(body: PhysicsBody, origin: Vector3, data: PhysicsHitData): Boolean = js.native
    def getBodyHitData(body: PhysicsBody, origin: Vector3, data: PhysicsHitData, instanceIndex: Double): Boolean = js.native
    
    /**
      * Returns the data related to the radial explosion event (sphere).
      * @returns The radial explosion event data
      */
    def getData(): PhysicsRadialExplosionEventData = js.native
    
    /**
      * Returns the force and contact point of the impostor or false, if the impostor is not affected by the force/impulse.
      * @param impostor A physics imposter
      * @param origin the origin of the explosion
      * @returns A physics force and contact point, or null
      */
    def getImpostorHitData(impostor: PhysicsImpostor, origin: Vector3, data: PhysicsHitData): Boolean = js.native
    
    /**
      * Triggers affected bodies callbacks
      * @param affectedBodiesWithData defines the list of affected bodies (including associated data)
      */
    def triggerAffectedBodiesCallback(affectedBodiesWithData: js.Array[PhysicsAffectedBodyWithData]): Unit = js.native
    
    /**
      * Triggers affected impostors callbacks
      * @param affectedImpostorsWithData defines the list of affected impostors (including associated data)
      */
    def triggerAffectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
  }
  
  trait PhysicsRadialExplosionEventData extends StObject {
    
    /**
      * A sphere used for the radial explosion event
      */
    var sphere: Mesh
  }
  object PhysicsRadialExplosionEventData {
    
    inline def apply(sphere: Mesh): PhysicsRadialExplosionEventData = {
      val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsRadialExplosionEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsRadialExplosionEventData] (val x: Self) extends AnyVal {
      
      inline def setSphere(value: Mesh): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a physics updraft event
    */
  @js.native
  trait PhysicsUpdraftEvent extends StObject {
    
    /* private */ var _cylinder: Any = js.native
    
    /* private */ var _cylinderPosition: Any = js.native
    
    /* private */ var _dataFetched: Any = js.native
    
    /* private */ var _getBodyHitData: Any = js.native
    
    /* private */ var _getHitData: Any = js.native
    
    /* private */ var _getImpostorHitData: Any = js.native
    
    /* private */ var _intersectsWithCylinder: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _origin: Any = js.native
    
    /* private */ var _originDirection: Any = js.native
    
    /* private */ var _originTop: Any = js.native
    
    /* private */ var _physicsEngine: Any = js.native
    
    /*** Helpers ***/
    /* private */ var _prepareCylinder: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _tick: Any = js.native
    
    /* private */ var _tickCallback: Any = js.native
    
    /**
      * Disables the updraft.
      */
    def disable(): Unit = js.native
    
    /**
      * Disposes the cylinder.
      * @param force Specifies if the updraft should be disposed by force
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Enables the updraft.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the data related to the updraft event (cylinder).
      * @returns A physics updraft event
      */
    def getData(): PhysicsUpdraftEventData = js.native
  }
  
  trait PhysicsUpdraftEventData extends StObject {
    
    /**
      * A cylinder used for the updraft event
      */
    var cylinder: js.UndefOr[Mesh] = js.undefined
  }
  object PhysicsUpdraftEventData {
    
    inline def apply(): PhysicsUpdraftEventData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsUpdraftEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsUpdraftEventData] (val x: Self) extends AnyVal {
      
      inline def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
      
      inline def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
    }
  }
  
  /**
    * Represents a physics vortex event
    */
  @js.native
  trait PhysicsVortexEvent extends StObject {
    
    /* private */ var _cylinder: Any = js.native
    
    /* private */ var _cylinderPosition: Any = js.native
    
    /* private */ var _dataFetched: Any = js.native
    
    /* private */ var _getBodyHitData: Any = js.native
    
    /* private */ var _getHitData: Any = js.native
    
    /* private */ var _getImpostorHitData: Any = js.native
    
    /* private */ var _intersectsWithCylinder: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _origin: Any = js.native
    
    /* private */ var _originTop: Any = js.native
    
    /* private */ var _physicsEngine: Any = js.native
    
    /*** Helpers ***/
    /* private */ var _prepareCylinder: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _tick: Any = js.native
    
    /* private */ var _tickCallback: Any = js.native
    
    /**
      * Disables the cortex.
      */
    def disable(): Unit = js.native
    
    /**
      * Disposes the sphere.
      * @param force
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Enables the vortex.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the data related to the vortex event (cylinder).
      * @returns The physics vortex event data
      */
    def getData(): PhysicsVortexEventData = js.native
  }
  
  trait PhysicsVortexEventData extends StObject {
    
    /**
      * A cylinder used for the vortex event
      */
    var cylinder: Mesh
  }
  object PhysicsVortexEventData {
    
    inline def apply(cylinder: Mesh): PhysicsVortexEventData = {
      val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsVortexEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsVortexEventData] (val x: Self) extends AnyVal {
      
      inline def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    }
  }
}
