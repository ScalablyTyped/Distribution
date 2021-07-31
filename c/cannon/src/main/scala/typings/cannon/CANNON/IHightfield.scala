package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHightfield extends StObject {
  
  var elementSize: Double
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
}
object IHightfield {
  
  @scala.inline
  def apply(elementSize: Double): IHightfield = {
    val __obj = js.Dynamic.literal(elementSize = elementSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHightfield]
  }
  
  @scala.inline
  implicit class IHightfieldMutableBuilder[Self <: IHightfield] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementSize(value: Double): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
