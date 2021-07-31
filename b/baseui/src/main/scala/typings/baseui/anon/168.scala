package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.RE
import typings.baseui.baseuiStrings.`Réunion LeftparenthesisLa RéunionRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var dialCode: Plussign262
  
  var id: RE
  
  var label: `Réunion LeftparenthesisLa RéunionRightparenthesis`
}
object `168` {
  
  @scala.inline
  def apply(): `168` = {
    val __obj = js.Dynamic.literal(dialCode = "+262", id = "RE", label = "R\u00E9union (La R\u00E9union)")
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit class `168MutableBuilder`[Self <: `168`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign262): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Réunion LeftparenthesisLa RéunionRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
