package typings.baseui.anon

import typings.baseui.baseuiStrings.GT
import typings.baseui.baseuiStrings.Guatemala
import typings.baseui.baseuiStrings.Plussign502
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var dialCode: Plussign502
  
  var id: GT
  
  var label: Guatemala
}
object `81` {
  
  @scala.inline
  def apply(): `81` = {
    val __obj = js.Dynamic.literal(dialCode = "+502", id = "GT", label = "Guatemala")
    __obj.asInstanceOf[`81`]
  }
  
  @scala.inline
  implicit class `81MutableBuilder`[Self <: `81`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign502): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guatemala): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
