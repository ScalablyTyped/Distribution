package typings.baseui.anon

import typings.baseui.baseuiStrings.MQ
import typings.baseui.baseuiStrings.Martinique
import typings.baseui.baseuiStrings.Plussign596
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var dialCode: Plussign596
  
  var id: MQ
  
  var label: Martinique
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal(dialCode = "+596", id = "MQ", label = "Martinique")
    __obj.asInstanceOf[`127`]
  }
  
  extension [Self <: `127`](x: Self) {
    
    inline def setDialCode(value: Plussign596): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MQ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Martinique): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
