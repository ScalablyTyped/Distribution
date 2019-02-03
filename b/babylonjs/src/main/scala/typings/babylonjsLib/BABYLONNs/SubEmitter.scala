package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sub emitter class used to emit particles from an existing particle
  */
@JSGlobal("BABYLON.SubEmitter")
@js.native
class SubEmitter protected () extends js.Object {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: ParticleSystem) = this()
  /**
    * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
    * Note: This only is supported when using an emitter of type Mesh
    */
  var inheritDirection: scala.Boolean = js.native
  /**
    * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
    */
  var inheritedVelocityAmount: scala.Double = js.native
  /**
    * the particle system to be used by the sub emitter
    */
  var particleSystem: ParticleSystem = js.native
  /**
    * Type of the submitter (Default: END)
    */
  var `type`: SubEmitterType = js.native
  /** Release associated resources */
  def dispose(): scala.Unit = js.native
  /**
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.SubEmitter")
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

