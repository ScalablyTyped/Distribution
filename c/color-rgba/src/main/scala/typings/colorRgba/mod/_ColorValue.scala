package typings.colorRgba.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ColorValue extends js.Object
object _ColorValue {
  
  @scala.inline
  def RGBColor(b: Double, g: Double, r: Double): _ColorValue = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValue]
  }
  
  @scala.inline
  def RGBKeyedColor(blue: Double, green: Double, red: Double): _ColorValue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValue]
  }
  
  @scala.inline
  def HSL(h: Double, l: Double, s: Double): _ColorValue = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValue]
  }
}
