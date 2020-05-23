package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorGradient extends IValueGradient {
  /**
    * Gets or sets first associated color
    */
  var color1: Color4
  /**
    * Gets or sets second associated color
    */
  var color2: js.UndefOr[Color4] = js.undefined
  /**
    * Will get a color picked randomly between color1 and color2.
    * If color2 is undefined then color1 will be used
    * @param result defines the target Color4 to store the result in
    */
  def getColorToRef(result: Color4): Unit
}

object ColorGradient {
  @scala.inline
  def apply(color1: Color4, getColorToRef: Color4 => Unit, gradient: Double, color2: Color4 = null): ColorGradient = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], getColorToRef = js.Any.fromFunction1(getColorToRef), gradient = gradient.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorGradient]
  }
}

