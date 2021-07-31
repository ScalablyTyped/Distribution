package typings.baseui.anon

import typings.baseui.baseuiStrings.ID
import typings.baseui.baseuiStrings.Indonesia
import typings.baseui.baseuiStrings.Plussign62
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  var dialCode: Plussign62
  
  var id: ID
  
  var label: Indonesia
}
object `92` {
  
  @scala.inline
  def apply(): `92` = {
    val __obj = js.Dynamic.literal(dialCode = "+62", id = "ID", label = "Indonesia")
    __obj.asInstanceOf[`92`]
  }
  
  @scala.inline
  implicit class `92MutableBuilder`[Self <: `92`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign62): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Indonesia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
