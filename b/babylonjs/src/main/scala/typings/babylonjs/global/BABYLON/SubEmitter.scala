package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SubEmitter")
@js.native
class SubEmitter protected ()
  extends typings.babylonjs.BABYLON.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typings.babylonjs.BABYLON.ParticleSystem) = this()
  /**
    * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
    * Note: This only is supported when using an emitter of type Mesh
    */
  /* CompleteClass */
  override var inheritDirection: Boolean = js.native
  /**
    * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
    */
  /* CompleteClass */
  override var inheritedVelocityAmount: Double = js.native
  /**
    * the particle system to be used by the sub emitter
    */
  /* CompleteClass */
  override var particleSystem: typings.babylonjs.BABYLON.ParticleSystem = js.native
  /**
    * Type of the submitter (Default: END)
    */
  /* CompleteClass */
  override var `type`: typings.babylonjs.BABYLON.SubEmitterType = js.native
  /** Release associated resources */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
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
  def Parse(serializationObject: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.SubEmitter = js.native
  /** @hidden */
  def _ParseParticleSystem(system: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = js.native
}

