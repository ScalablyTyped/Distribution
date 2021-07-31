package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign263
import typings.baseui.baseuiStrings.ZW
import typings.baseui.baseuiStrings.Zimbabwe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var dialCode: Plussign263
  
  var id: ZW
  
  var label: Zimbabwe
}
object `234` {
  
  @scala.inline
  def apply(): `234` = {
    val __obj = js.Dynamic.literal(dialCode = "+263", id = "ZW", label = "Zimbabwe")
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit class `234MutableBuilder`[Self <: `234`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign263): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Zimbabwe): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
