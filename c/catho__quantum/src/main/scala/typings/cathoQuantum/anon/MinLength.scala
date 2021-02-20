package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinLength extends StObject {
  
  var minLength: js.UndefOr[String | Double] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object MinLength {
  
  @scala.inline
  def apply(): MinLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinLength]
  }
  
  @scala.inline
  implicit class MinLengthMutableBuilder[Self <: MinLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinLength(value: String | Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
