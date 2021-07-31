package typings.baseui.anon

import typings.baseui.baseuiStrings.CO
import typings.baseui.baseuiStrings.Colombia
import typings.baseui.baseuiStrings.Plussign57
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var dialCode: Plussign57
  
  var id: CO
  
  var label: Colombia
}
object `40` {
  
  @scala.inline
  def apply(): `40` = {
    val __obj = js.Dynamic.literal(dialCode = "+57", id = "CO", label = "Colombia")
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign57): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Colombia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
