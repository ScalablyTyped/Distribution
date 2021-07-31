package typings.baseui.anon

import typings.baseui.baseuiStrings.KE
import typings.baseui.baseuiStrings.Kenya
import typings.baseui.baseuiStrings.Plussign254
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var dialCode: Plussign254
  
  var id: KE
  
  var label: Kenya
}
object `104` {
  
  @scala.inline
  def apply(): `104` = {
    val __obj = js.Dynamic.literal(dialCode = "+254", id = "KE", label = "Kenya")
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit class `104MutableBuilder`[Self <: `104`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign254): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Kenya): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
