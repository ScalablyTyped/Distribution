package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.US
import typings.baseui.baseuiStrings.`United States`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `224` extends StObject {
  
  var dialCode: Plussign1
  
  var id: US
  
  var label: `United States`
}
object `224` {
  
  @scala.inline
  def apply(): `224` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "US", label = "United States")
    __obj.asInstanceOf[`224`]
  }
  
  @scala.inline
  implicit class `224MutableBuilder`[Self <: `224`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: US): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `United States`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
