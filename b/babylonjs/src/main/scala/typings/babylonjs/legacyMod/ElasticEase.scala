package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "ElasticEase")
@js.native
/**
  * Instantiates an elastic easing function
  * @see https://easings.net/#easeInElastic
  * @param oscillations Defines the number of oscillations
  * @param springiness Defines the amplitude of the oscillations
  */
class ElasticEase ()
  extends typings.babylonjs.indexMod.ElasticEase {
  def this(/** Defines the number of oscillations*/
  oscillations: Double) = this()
  def this(
    /** Defines the number of oscillations*/
  oscillations: Double,
    /** Defines the amplitude of the oscillations*/
  springiness: Double
  ) = this()
}

