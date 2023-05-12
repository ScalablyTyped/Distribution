package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofelements extends StObject {
  
  var ArcElement: TypeofArcElement
  
  var BarElement: TypeofBarElement
  
  var LineElement: TypeofLineElement
  
  var PointElement: TypeofPointElement
}
object Typeofelements {
  
  inline def apply(
    ArcElement: TypeofArcElement,
    BarElement: TypeofBarElement,
    LineElement: TypeofLineElement,
    PointElement: TypeofPointElement
  ): Typeofelements = {
    val __obj = js.Dynamic.literal(ArcElement = ArcElement.asInstanceOf[js.Any], BarElement = BarElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], PointElement = PointElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofelements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofelements] (val x: Self) extends AnyVal {
    
    inline def setArcElement(value: TypeofArcElement): Self = StObject.set(x, "ArcElement", value.asInstanceOf[js.Any])
    
    inline def setBarElement(value: TypeofBarElement): Self = StObject.set(x, "BarElement", value.asInstanceOf[js.Any])
    
    inline def setLineElement(value: TypeofLineElement): Self = StObject.set(x, "LineElement", value.asInstanceOf[js.Any])
    
    inline def setPointElement(value: TypeofPointElement): Self = StObject.set(x, "PointElement", value.asInstanceOf[js.Any])
  }
}
