package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign378
import typings.baseui.baseuiStrings.SM
import typings.baseui.baseuiStrings.`San Marino`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  var dialCode: Plussign378
  
  var id: SM
  
  var label: `San Marino`
}
object `180` {
  
  @scala.inline
  def apply(): `180` = {
    val __obj = js.Dynamic.literal(dialCode = "+378", id = "SM", label = "San Marino")
    __obj.asInstanceOf[`180`]
  }
  
  @scala.inline
  implicit class `180MutableBuilder`[Self <: `180`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign378): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `San Marino`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
