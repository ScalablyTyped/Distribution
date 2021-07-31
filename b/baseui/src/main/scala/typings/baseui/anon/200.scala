package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.SJ
import typings.baseui.baseuiStrings.`Svalbard and Jan Mayen`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  var dialCode: Plussign47
  
  var id: SJ
  
  var label: `Svalbard and Jan Mayen`
}
object `200` {
  
  @scala.inline
  def apply(): `200` = {
    val __obj = js.Dynamic.literal(dialCode = "+47", id = "SJ", label = "Svalbard and Jan Mayen")
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit class `200MutableBuilder`[Self <: `200`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign47): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Svalbard and Jan Mayen`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
