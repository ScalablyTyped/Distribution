package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign597
import typings.baseui.baseuiStrings.SR
import typings.baseui.baseuiStrings.Suriname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  var dialCode: Plussign597
  
  var id: SR
  
  var label: Suriname
}
object `199` {
  
  @scala.inline
  def apply(): `199` = {
    val __obj = js.Dynamic.literal(dialCode = "+597", id = "SR", label = "Suriname")
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit class `199MutableBuilder`[Self <: `199`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign597): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Suriname): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
