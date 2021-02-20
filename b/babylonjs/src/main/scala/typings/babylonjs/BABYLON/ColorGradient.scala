package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorGradient extends IValueGradient {
  
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
object ColorGradient {
  
  @scala.inline
  def apply(color1: Color4, getColorToRef: Color4 => Unit, gradient: Double): ColorGradient = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], getColorToRef = js.Any.fromFunction1(getColorToRef), gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorGradient]
  }
  
  @scala.inline
  implicit class ColorGradientMutableBuilder[Self <: ColorGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor1(value: Color4): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor2(value: Color4): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
    
    @scala.inline
    def setGetColorToRef(value: Color4 => Unit): Self = StObject.set(x, "getColorToRef", js.Any.fromFunction1(value))
  }
}
