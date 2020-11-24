package typings.babylonjs

import typings.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.particleMod.Particle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/EmitterTypes/sphereParticleEmitter", JSImport.Namespace)
@js.native
object sphereParticleEmitterMod extends js.Object {
  
  @js.native
  /**
    * Creates a new instance SphereDirectedParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  class SphereDirectedParticleEmitter () extends SphereParticleEmitter {
    def this(radius: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(radius: Double, /**
      * The min limit of the emission direction.
      */
    direction1: Vector3) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    
    /**
      * The min limit of the emission direction.
      */
    var direction1: Vector3 = js.native
    
    /**
      * The max limit of the emission direction.
      */
    var direction2: Vector3 = js.native
    
    /**
      * Called by the particle System when the direction is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param directionToUpdate is the direction vector to update with the result
      * @param particle is the particle we are computed the direction for
      */
    def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle): Unit = js.native
  }
  
  @js.native
  /**
    * Creates a new instance SphereParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class SphereParticleEmitter () extends IParticleEmitterType {
    def this(/**
      * The radius of the emission sphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    
    /**
      * How much to randomize the particle direction [0-1].
      */
    var directionRandomizer: Double = js.native
    
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      */
    def parse(serializationObject: js.Any): Unit = js.native
    
    /**
      * The radius of the emission sphere.
      */
    var radius: Double = js.native
    
    /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    var radiusRange: Double = js.native
  }
}
