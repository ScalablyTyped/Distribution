package typings.baseui.anon

import typings.baseui.baseuiStrings.NF
import typings.baseui.baseuiStrings.Plussign672
import typings.baseui.baseuiStrings.`Norfolk Island`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  var dialCode: Plussign672
  
  var id: NF
  
  var label: `Norfolk Island`
}
object `151` {
  
  @scala.inline
  def apply(): `151` = {
    val __obj = js.Dynamic.literal(dialCode = "+672", id = "NF", label = "Norfolk Island")
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit class `151MutableBuilder`[Self <: `151`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign672): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Norfolk Island`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
