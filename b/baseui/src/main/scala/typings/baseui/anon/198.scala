package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign249
import typings.baseui.baseuiStrings.SD
import typings.baseui.baseuiStrings.`Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  var dialCode: Plussign249
  
  var id: SD
  
  var label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`
}
object `198` {
  
  @scala.inline
  def apply(): `198` = {
    val __obj = js.Dynamic.literal(dialCode = "+249", id = "SD", label = "Sudan (\u202B\u0627\u0644\u0633\u0648\u062F\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit class `198MutableBuilder`[Self <: `198`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign249): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
