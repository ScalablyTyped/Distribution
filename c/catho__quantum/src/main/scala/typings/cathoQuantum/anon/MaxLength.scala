package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxLength extends StObject {
  
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MaxLength {
  
  @scala.inline
  def apply(): MaxLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxLength]
  }
  
  @scala.inline
  implicit class MaxLengthMutableBuilder[Self <: MaxLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
