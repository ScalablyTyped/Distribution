package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropOptions extends StObject {
  
  /**
    * Color of label backdrops.
    */
  var color: Scriptable[Color, ScriptableScaleContext]
  
  /**
    * Height of backdrop in pixels
    */
  var height: Double
  
  /**
    * Left position of backdrop as pixel
    */
  var left: Double
  
  /**
    * Top position of backdrop as pixel
    */
  var top: Double
  
  /**
    * Width of backdrop in pixels
    */
  var width: Double
}
object BackdropOptions {
  
  inline def apply(
    color: Scriptable[Color, ScriptableScaleContext],
    height: Double,
    left: Double,
    top: Double,
    width: Double
  ): BackdropOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackdropOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackdropOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Scriptable[Color, ScriptableScaleContext]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
