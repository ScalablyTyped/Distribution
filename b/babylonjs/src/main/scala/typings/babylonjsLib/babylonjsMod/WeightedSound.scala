package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Wraps one or more Sound objects and selects one with random weight for playback.
     */
@JSImport("babylonjs", "WeightedSound")
@js.native
class WeightedSound protected ()
  extends babylonjsLib.BABYLONNs.WeightedSound {
  /**
           * Creates a new WeightedSound from the list of sounds given.
           * @param loop When true a Sound will be selected and played when the current playing Sound completes.
           * @param sounds Array of Sounds that will be selected from.
           * @param weights Array of number values for selection weights; length must equal sounds, values will be normalized to 1
           */
  def this(loop: scala.Boolean, sounds: js.Array[babylonjsLib.BABYLONNs.Sound], weights: js.Array[scala.Double]) = this()
}

