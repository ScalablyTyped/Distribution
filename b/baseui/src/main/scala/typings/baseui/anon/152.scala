package typings.baseui.anon

import typings.baseui.baseuiStrings.KP
import typings.baseui.baseuiStrings.Plussign850
import typings.baseui.baseuiStrings.`North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `152` extends StObject {
  
  var dialCode: Plussign850 = js.native
  
  var id: KP = js.native
  
  var label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis` = js.native
}
object `152` {
  
  @scala.inline
  def apply(dialCode: Plussign850, id: KP, label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): `152` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`152`]
  }
  
  @scala.inline
  implicit class `152MutableBuilder`[Self <: `152`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign850): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
