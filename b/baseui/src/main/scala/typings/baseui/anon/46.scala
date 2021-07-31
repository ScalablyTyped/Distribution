package typings.baseui.anon

import typings.baseui.baseuiStrings.CI
import typings.baseui.baseuiStrings.Plussign225
import typings.baseui.baseuiStrings.`Côte dRightsinglequotationmarkIvoire`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var dialCode: Plussign225
  
  var id: CI
  
  var label: `Côte dRightsinglequotationmarkIvoire`
}
object `46` {
  
  @scala.inline
  def apply(): `46` = {
    val __obj = js.Dynamic.literal(dialCode = "+225", id = "CI", label = "C\u00F4te d\u2019Ivoire")
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign225): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Côte dRightsinglequotationmarkIvoire`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
