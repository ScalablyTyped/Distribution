package typings.baseui.anon

import typings.baseui.baseuiStrings.HT
import typings.baseui.baseuiStrings.Haiti
import typings.baseui.baseuiStrings.Plussign509
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  var dialCode: Plussign509
  
  var id: HT
  
  var label: Haiti
}
object `86` {
  
  @scala.inline
  def apply(): `86` = {
    val __obj = js.Dynamic.literal(dialCode = "+509", id = "HT", label = "Haiti")
    __obj.asInstanceOf[`86`]
  }
  
  @scala.inline
  implicit class `86MutableBuilder`[Self <: `86`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign509): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Haiti): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
