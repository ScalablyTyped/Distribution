package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxNumber extends StObject {
  
  /**
    * The number of tick texts will be adjusted to less than this value.
    */
  var max: Double
}
object MaxNumber {
  
  @scala.inline
  def apply(max: Double): MaxNumber = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNumber]
  }
  
  @scala.inline
  implicit class MaxNumberMutableBuilder[Self <: MaxNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
