package typings.babylonjs.gradientsMod

import typings.babylonjs.mathColorMod.Color4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/gradients", "ColorGradient")
@js.native
class ColorGradient protected () extends IValueGradient {
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
  
  /**
    * Gets or sets first associated color
    */
  var color1: Color4 = js.native
  
  /**
    * Gets or sets second associated color
    */
  var color2: js.UndefOr[Color4] = js.native
  
  /**
    * Will get a color picked randomly between color1 and color2.
    * If color2 is undefined then color1 will be used
    * @param result defines the target Color4 to store the result in
    */
  def getColorToRef(result: Color4): Unit = js.native
}
