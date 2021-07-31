package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign65
import typings.baseui.baseuiStrings.SG
import typings.baseui.baseuiStrings.Singapore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  var dialCode: Plussign65
  
  var id: SG
  
  var label: Singapore
}
object `187` {
  
  @scala.inline
  def apply(): `187` = {
    val __obj = js.Dynamic.literal(dialCode = "+65", id = "SG", label = "Singapore")
    __obj.asInstanceOf[`187`]
  }
  
  @scala.inline
  implicit class `187MutableBuilder`[Self <: `187`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign65): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Singapore): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
