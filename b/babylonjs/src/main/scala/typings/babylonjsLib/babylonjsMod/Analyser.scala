package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to work with sound analyzer using fast fourier transform (FFT)
     * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
     */
@JSImport("babylonjs", "Analyser")
@js.native
class Analyser protected ()
  extends babylonjsLib.BABYLONNs.Analyser {
  /**
           * Creates a new analyser
           * @param scene defines hosting scene
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

