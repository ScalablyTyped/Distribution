package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalNumber extends StObject {
  
  /**
    * The scale that determines where the decimal point falls in the unscaled value.
    */
  var Scale: Integer
  
  /**
    * The unscaled numeric value.
    */
  var UnscaledValue: _Blob
}
object DecimalNumber {
  
  @scala.inline
  def apply(Scale: Integer, UnscaledValue: _Blob): DecimalNumber = {
    val __obj = js.Dynamic.literal(Scale = Scale.asInstanceOf[js.Any], UnscaledValue = UnscaledValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalNumber]
  }
  
  @scala.inline
  implicit class DecimalNumberMutableBuilder[Self <: DecimalNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Integer): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnscaledValue(value: _Blob): Self = StObject.set(x, "UnscaledValue", value.asInstanceOf[js.Any])
  }
}
