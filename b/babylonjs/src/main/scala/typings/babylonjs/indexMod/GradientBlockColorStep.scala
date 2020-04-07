package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "GradientBlockColorStep")
@js.native
class GradientBlockColorStep protected ()
  extends typings.babylonjs.materialsIndexMod.GradientBlockColorStep {
  /**
    * Creates a new GradientBlockColorStep
    * @param step defines a value indicating which step this color is associated with (between 0 and 1)
    * @param color defines the color associated with this step
    */
  def this(
    /**
    * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
    */
  step: Double,
    /**
    * Gets or sets the color associated with this step
    */
  color: typings.babylonjs.mathColorMod.Color3
  ) = this()
}

