package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WeightedSound")
@js.native
open class WeightedSound protected ()
  extends typings.babylonjs.legacyLegacyMod.WeightedSound {
  /**
    * Creates a new WeightedSound from the list of sounds given.
    * @param loop When true a Sound will be selected and played when the current playing Sound completes.
    * @param sounds Array of Sounds that will be selected from.
    * @param weights Array of number values for selection weights; length must equal sounds, values will be normalized to 1
    */
  def this(loop: Boolean, sounds: js.Array[typings.babylonjs.audioSoundMod.Sound], weights: js.Array[Double]) = this()
}
