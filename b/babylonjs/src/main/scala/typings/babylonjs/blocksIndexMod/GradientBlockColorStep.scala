package typings.babylonjs.blocksIndexMod

import typings.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/index", "GradientBlockColorStep")
@js.native
class GradientBlockColorStep protected ()
  extends typings.babylonjs.gradientBlockMod.GradientBlockColorStep {
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
  color: Color3
  ) = this()
}

