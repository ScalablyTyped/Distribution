package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sub emitter class used to emit particles from an existing particle
  */
@JSImport("babylonjs", "SubEmitter")
@js.native
class SubEmitter protected ()
  extends babylonjsLib.BABYLONNs.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: babylonjsLib.BABYLONNs.ParticleSystem) = this()
}

/**
  * Sub emitter class used to emit particles from an existing particle
  */
@JSImport("babylonjs", "SubEmitter")
@js.native
object SubEmitter extends js.Object {
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param scene defines the hosting scene
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  def Parse(serializationObject: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.SubEmitter = js.native
}

