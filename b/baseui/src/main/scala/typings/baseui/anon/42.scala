package typings.baseui.anon

import typings.baseui.baseuiStrings.CD
import typings.baseui.baseuiStrings.Plussign243
import typings.baseui.baseuiStrings.`Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var dialCode: Plussign243
  
  var id: CD
  
  var label: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
}
object `42` {
  
  @scala.inline
  def apply(): `42` = {
    val __obj = js.Dynamic.literal(dialCode = "+243", id = "CD", label = "Congo (DRC) (Jamhuri ya Kisoemokrasia ya Kongo)")
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit class `42MutableBuilder`[Self <: `42`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign243): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(
      value: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
