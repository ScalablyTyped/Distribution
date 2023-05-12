package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesGeometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineProps extends StObject {
  
  var points: js.Array[Point]
}
object LineProps {
  
  inline def apply(points: js.Array[Point]): LineProps = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
