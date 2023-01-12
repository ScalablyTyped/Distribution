package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcBorderRadius extends StObject {
  
  var innerEnd: Double
  
  var innerStart: Double
  
  var outerEnd: Double
  
  var outerStart: Double
}
object ArcBorderRadius {
  
  inline def apply(innerEnd: Double, innerStart: Double, outerEnd: Double, outerStart: Double): ArcBorderRadius = {
    val __obj = js.Dynamic.literal(innerEnd = innerEnd.asInstanceOf[js.Any], innerStart = innerStart.asInstanceOf[js.Any], outerEnd = outerEnd.asInstanceOf[js.Any], outerStart = outerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcBorderRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcBorderRadius] (val x: Self) extends AnyVal {
    
    inline def setInnerEnd(value: Double): Self = StObject.set(x, "innerEnd", value.asInstanceOf[js.Any])
    
    inline def setInnerStart(value: Double): Self = StObject.set(x, "innerStart", value.asInstanceOf[js.Any])
    
    inline def setOuterEnd(value: Double): Self = StObject.set(x, "outerEnd", value.asInstanceOf[js.Any])
    
    inline def setOuterStart(value: Double): Self = StObject.set(x, "outerStart", value.asInstanceOf[js.Any])
  }
}
