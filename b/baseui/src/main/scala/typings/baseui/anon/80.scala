package typings.baseui.anon

import typings.baseui.baseuiStrings.GU
import typings.baseui.baseuiStrings.Guam
import typings.baseui.baseuiStrings.Plussign1671
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  var dialCode: Plussign1671
  
  var id: GU
  
  var label: Guam
}
object `80` {
  
  @scala.inline
  def apply(): `80` = {
    val __obj = js.Dynamic.literal(dialCode = "+1671", id = "GU", label = "Guam")
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit class `80MutableBuilder`[Self <: `80`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1671): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guam): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
