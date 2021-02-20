package typings.baseui.anon

import typings.baseui.baseuiStrings.PM
import typings.baseui.baseuiStrings.Plussign508
import typings.baseui.baseuiStrings.`Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `177` extends StObject {
  
  var dialCode: Plussign508 = js.native
  
  var id: PM = js.native
  
  var label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis` = js.native
}
object `177` {
  
  @scala.inline
  def apply(
    dialCode: Plussign508,
    id: PM,
    label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
  ): `177` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit class `177MutableBuilder`[Self <: `177`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign508): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
