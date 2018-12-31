package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the sound scene component responsible to manage any sounds
  * in a given scene.
  */
@JSImport("babylonjs", "AudioSceneComponent")
@js.native
class AudioSceneComponent protected ()
  extends babylonjsLib.BABYLONNs.AudioSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

