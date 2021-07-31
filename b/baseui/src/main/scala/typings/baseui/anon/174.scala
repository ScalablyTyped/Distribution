package typings.baseui.anon

import typings.baseui.baseuiStrings.KN
import typings.baseui.baseuiStrings.Plussign1869
import typings.baseui.baseuiStrings.`Saint Kitts and Nevis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  var dialCode: Plussign1869
  
  var id: KN
  
  var label: `Saint Kitts and Nevis`
}
object `174` {
  
  @scala.inline
  def apply(): `174` = {
    val __obj = js.Dynamic.literal(dialCode = "+1869", id = "KN", label = "Saint Kitts and Nevis")
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit class `174MutableBuilder`[Self <: `174`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1869): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Kitts and Nevis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
