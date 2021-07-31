package typings.baseui.anon

import typings.baseui.baseuiStrings.HU
import typings.baseui.baseuiStrings.Plussign36
import typings.baseui.baseuiStrings.`Hungary LeftparenthesisMagyarországRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var dialCode: Plussign36
  
  var id: HU
  
  var label: `Hungary LeftparenthesisMagyarországRightparenthesis`
}
object `89` {
  
  @scala.inline
  def apply(): `89` = {
    val __obj = js.Dynamic.literal(dialCode = "+36", id = "HU", label = "Hungary (Magyarorsz\u00E1g)")
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit class `89MutableBuilder`[Self <: `89`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign36): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Hungary LeftparenthesisMagyarországRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
