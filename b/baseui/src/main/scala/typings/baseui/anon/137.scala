package typings.baseui.anon

import typings.baseui.baseuiStrings.MS
import typings.baseui.baseuiStrings.Montserrat
import typings.baseui.baseuiStrings.Plussign1664
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137` extends StObject {
  
  var dialCode: Plussign1664
  
  var id: MS
  
  var label: Montserrat
}
object `137` {
  
  @scala.inline
  def apply(): `137` = {
    val __obj = js.Dynamic.literal(dialCode = "+1664", id = "MS", label = "Montserrat")
    __obj.asInstanceOf[`137`]
  }
  
  @scala.inline
  implicit class `137MutableBuilder`[Self <: `137`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1664): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Montserrat): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
