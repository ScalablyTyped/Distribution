package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderOptions extends StObject {
  
  var color: Color
  
  /**
    * @default []
    */
  var dash: Scriptable[js.Array[Double], ScriptableScaleContext]
  
  /**
    * @default 0
    */
  var dashOffset: Scriptable[Double, ScriptableScaleContext]
  
  /**
    * @default true
    */
  var display: Boolean
  
  var width: Double
  
  var z: Double
}
object BorderOptions {
  
  inline def apply(
    color: Color,
    dash: Scriptable[js.Array[Double], ScriptableScaleContext],
    dashOffset: Scriptable[Double, ScriptableScaleContext],
    display: Boolean,
    width: Double,
    z: Double
  ): BorderOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], dashOffset = dashOffset.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDash(value: Scriptable[js.Array[Double], ScriptableScaleContext]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "dash", js.Any.fromFunction2(value))
    
    inline def setDashOffset(value: Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
    
    inline def setDashOffsetFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "dashOffset", js.Any.fromFunction2(value))
    
    inline def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value*))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
