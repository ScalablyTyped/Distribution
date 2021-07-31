package typings.baseui.anon

import typings.baseui.baseuiStrings.PG
import typings.baseui.baseuiStrings.Plussign675
import typings.baseui.baseuiStrings.`Papua New Guinea`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var dialCode: Plussign675
  
  var id: PG
  
  var label: `Papua New Guinea`
}
object `160` {
  
  @scala.inline
  def apply(): `160` = {
    val __obj = js.Dynamic.literal(dialCode = "+675", id = "PG", label = "Papua New Guinea")
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit class `160MutableBuilder`[Self <: `160`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign675): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Papua New Guinea`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
