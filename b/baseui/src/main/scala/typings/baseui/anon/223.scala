package typings.baseui.anon

import typings.baseui.baseuiStrings.GB
import typings.baseui.baseuiStrings.Plussign44
import typings.baseui.baseuiStrings.`United Kingdom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  var dialCode: Plussign44
  
  var id: GB
  
  var label: `United Kingdom`
}
object `223` {
  
  @scala.inline
  def apply(): `223` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "GB", label = "United Kingdom")
    __obj.asInstanceOf[`223`]
  }
  
  @scala.inline
  implicit class `223MutableBuilder`[Self <: `223`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `United Kingdom`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
