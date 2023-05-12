package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.inner
import typings.chartJs.distTypesColorMod.Color
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
    * Line dash. See MDN.
    * @default []
    */
  var borderDash: js.Array[Double]
  
  /**
    * Line dash offset. See MDN.
    * @default 0.0
    */
  var borderDashOffset: Double
  
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
  
  /**
    * Spacing between arcs
    */
  var spacing: Double
}
object ArcOptions {
  
  inline def apply(
    backgroundColor: Color,
    borderAlign: center | inner,
    borderColor: Color,
    borderDash: js.Array[Double],
    borderDashOffset: Double,
    borderJoinStyle: CanvasLineJoin,
    borderRadius: Double | ArcBorderRadius,
    borderWidth: Double,
    circular: Boolean,
    offset: Double,
    spacing: Double
  ): ArcOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcOptions] (val x: Self) extends AnyVal {
    
    inline def setBorderAlign(value: center | inner): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    inline def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(value: CanvasLineJoin): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double | ArcBorderRadius): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
