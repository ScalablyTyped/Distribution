package typings.babylonjs

import typings.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.particleMod.Particle
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/EmitterTypes/customParticleEmitter", JSImport.Namespace)
@js.native
object customParticleEmitterMod extends js.Object {
  
  @js.native
  /**
    * Creates a new instance CustomParticleEmitter
    */
  class CustomParticleEmitter () extends IParticleEmitterType {
    
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      */
    def parse(serializationObject: js.Any): Unit = js.native
    
    /**
      * Gets or sets the destination generator that will create the final destination of each particle.
      *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
      */
    def particleDestinationGenerator(index: Double, particle: Nullable[Particle], outDestination: Vector3): Unit = js.native
    
    /**
      * Gets or sets the position generator that will create the inital position of each particle.
      * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
      */
    def particlePositionGenerator(index: Double, particle: Nullable[Particle], outPosition: Vector3): Unit = js.native
  }
}
