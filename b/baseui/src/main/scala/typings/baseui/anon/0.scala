package typings.baseui.anon

import typings.baseui.baseuiStrings.AO
import typings.baseui.baseuiStrings.Angola
import typings.baseui.baseuiStrings.Plussign244
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var dialCode: Plussign244
  
  var id: AO
  
  var label: Angola
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal(dialCode = "+244", id = "AO", label = "Angola")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign244): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Angola): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
