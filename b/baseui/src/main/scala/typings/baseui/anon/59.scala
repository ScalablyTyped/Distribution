package typings.baseui.anon

import typings.baseui.baseuiStrings.GQ
import typings.baseui.baseuiStrings.Plussign240
import typings.baseui.baseuiStrings.`Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var dialCode: Plussign240
  
  var id: GQ
  
  var label: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`
}
object `59` {
  
  @scala.inline
  def apply(): `59` = {
    val __obj = js.Dynamic.literal(dialCode = "+240", id = "GQ", label = "Equatorial Guinea (Guinea Ecuatorial)")
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit class `59MutableBuilder`[Self <: `59`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign240): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GQ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
