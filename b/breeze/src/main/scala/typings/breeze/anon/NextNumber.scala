package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextNumber extends StObject {
  
  var nextNumber: Double
  
  var nextNumberIncrement: Double
  
  var stringPrefix: String
}
object NextNumber {
  
  @scala.inline
  def apply(nextNumber: Double, nextNumberIncrement: Double, stringPrefix: String): NextNumber = {
    val __obj = js.Dynamic.literal(nextNumber = nextNumber.asInstanceOf[js.Any], nextNumberIncrement = nextNumberIncrement.asInstanceOf[js.Any], stringPrefix = stringPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextNumber]
  }
  
  @scala.inline
  implicit class NextNumberMutableBuilder[Self <: NextNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextNumber(value: Double): Self = StObject.set(x, "nextNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNumberIncrement(value: Double): Self = StObject.set(x, "nextNumberIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringPrefix(value: String): Self = StObject.set(x, "stringPrefix", value.asInstanceOf[js.Any])
  }
}
