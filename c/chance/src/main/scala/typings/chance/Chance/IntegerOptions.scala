package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerOptions extends StObject {
  
  var max: Double
  
  var min: Double
}
object IntegerOptions {
  
  @scala.inline
  def apply(max: Double, min: Double): IntegerOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerOptions]
  }
  
  @scala.inline
  implicit class IntegerOptionsMutableBuilder[Self <: IntegerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
