package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign677
import typings.baseui.baseuiStrings.SB
import typings.baseui.baseuiStrings.`Solomon Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var dialCode: Plussign677
  
  var id: SB
  
  var label: `Solomon Islands`
}
object `191` {
  
  @scala.inline
  def apply(): `191` = {
    val __obj = js.Dynamic.literal(dialCode = "+677", id = "SB", label = "Solomon Islands")
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit class `191MutableBuilder`[Self <: `191`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign677): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Solomon Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
