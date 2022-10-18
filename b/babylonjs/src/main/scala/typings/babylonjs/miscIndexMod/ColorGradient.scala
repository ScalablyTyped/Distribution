package typings.babylonjs.miscIndexMod

import typings.babylonjs.mathsMathDotcolorMod.Color4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "ColorGradient")
@js.native
open class ColorGradient protected ()
  extends typings.babylonjs.miscGradientsMod.ColorGradient {
  /**
    * Creates a new color4 gradient
    * @param gradient gets or sets the gradient value (between 0 and 1)
    * @param color1 gets or sets first associated color
    * @param color2 gets or sets first second color
    */
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets first associated color
    */
  color1: Color4
  ) = this()
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets first associated color
    */
  color1: Color4,
    /**
    * Gets or sets second associated color
    */
  color2: Color4
  ) = this()
}
