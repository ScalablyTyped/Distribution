package typings.babylonjs

import typings.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxParticleEmitterMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/boxParticleEmitter", "BoxParticleEmitter")
  @js.native
  /**
    * Creates a new instance BoxParticleEmitter
    */
  class BoxParticleEmitter () extends IParticleEmitterType {
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction1: Vector3 = js.native
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction2: Vector3 = js.native
    
    /**
      * Maximum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
      */
    var maxEmitBox: Vector3 = js.native
    
    /**
      * Minimum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
      */
    var minEmitBox: Vector3 = js.native
    
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      */
    def parse(serializationObject: js.Any): Unit = js.native
  }
}
