package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typings.babylonjs.BABYLON.ParticleSystemSet {
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
object ParticleSystemSet extends js.Object {
  /**
    * Gets or sets base Assets URL
    */
  var BaseAssetsUrl: String = js.native
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @returns a new ParticleSystemSet
    */
  def Parse(data: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.ParticleSystemSet = js.native
  def Parse(data: js.Any, scene: typings.babylonjs.BABYLON.Scene, gpu: Boolean): typings.babylonjs.BABYLON.ParticleSystemSet = js.native
}

