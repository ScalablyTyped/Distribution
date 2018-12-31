package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents the default audio engine used in babylon.
  * It is responsible to play, synchronize and analyse sounds throughout the  application.
  * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
  */
@JSImport("babylonjs", "AudioEngine")
@js.native
/**
  * Instantiates a new audio engine.
  *
  * There should be only one per page as some browsers restrict the number
  * of audio contexts you can create.
  * @param hostElement defines the host element where to display the mute icon if necessary
  */
class AudioEngine ()
  extends babylonjsLib.BABYLONNs.AudioEngine {
  def this(hostElement: babylonjsLib.BABYLONNs.Nullable[stdLib.HTMLElement]) = this()
}

