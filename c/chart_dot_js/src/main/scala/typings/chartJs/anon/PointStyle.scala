package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointStyle extends StObject {
  
  var pointStyle: typings.chartJs.distChunksHelpersDotcoreMod.PointStyle
  
  var rotation: Double
}
object PointStyle {
  
  inline def apply(pointStyle: typings.chartJs.distChunksHelpersDotcoreMod.PointStyle, rotation: Double): PointStyle = {
    val __obj = js.Dynamic.literal(pointStyle = pointStyle.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStyle]
  }
  
  extension [Self <: PointStyle](x: Self) {
    
    inline def setPointStyle(value: typings.chartJs.distChunksHelpersDotcoreMod.PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
