package typings.baseui.anon

import typings.baseui.baseuiStrings.PM
import typings.baseui.baseuiStrings.Plussign508
import typings.baseui.baseuiStrings.`Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  var dialCode: Plussign508
  
  var id: PM
  
  var label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
}
object `177` {
  
  inline def apply(): `177` = {
    val __obj = js.Dynamic.literal(dialCode = "+508", id = "PM", label = "Saint Pierre and Miquelon (Saint-Pierre-et-Miquelon)")
    __obj.asInstanceOf[`177`]
  }
  
  extension [Self <: `177`](x: Self) {
    
    inline def setDialCode(value: Plussign508): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
