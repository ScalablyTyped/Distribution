package typings.chartJs.mod

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.inner
import typings.chartJs.typesColorMod.Color
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcOptions
  extends StObject
     with CommonElementOptions {
  
  /**
    * Arc stroke alignment.
    */
  var borderAlign: center | inner
  
  /**
    * Line join style. See MDN. Default is 'round' when `borderAlign` is 'inner', else 'bevel'.
    */
  var borderJoinStyle: CanvasLineJoin
  
  /**
    * Sets the border radius for arcs
    * @default 0
    */
  var borderRadius: Double | ArcBorderRadius
  
  /**
    * If false, Arc will be flat.
    * @default true
    */
  var circular: Boolean
  
  /**
    * Arc offset (in pixels).
    */
  var offset: Double
}
object ArcOptions {
  
  inline def apply(
    backgroundColor: Color,
    borderAlign: center | inner,
    borderColor: Color,
    borderJoinStyle: CanvasLineJoin,
    borderRadius: Double | ArcBorderRadius,
    borderWidth: Double,
    circular: Boolean,
    offset: Double
  ): ArcOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcOptions] (val x: Self) extends AnyVal {
    
    inline def setBorderAlign(value: center | inner): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    inline def setBorderJoinStyle(value: CanvasLineJoin): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double | ArcBorderRadius): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
