package typings.bizcharts.mod

import typings.bizcharts.bizchartsStrings.x
import typings.bizcharts.bizchartsStrings.y
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordProps
  extends StObject
     with Props[js.Any] {
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var innerRadius: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var reflect: js.UndefOr[x | y] = js.undefined
  
  var rotate: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var transpose: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[CoordType] = js.undefined
}
object CoordProps {
  
  inline def apply(): CoordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordProps]
  }
  
  extension [Self <: CoordProps](x: Self) {
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setReflect(value: typings.bizcharts.bizchartsStrings.x | y): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    inline def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
    
    inline def setType(value: CoordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
