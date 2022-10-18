package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign993
import typings.baseui.baseuiStrings.TM
import typings.baseui.baseuiStrings.Turkmenistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  val dialCode: Plussign993
  
  val id: TM
  
  val label: Turkmenistan
}
object `233` {
  
  inline def apply(): `233` = {
    val __obj = js.Dynamic.literal(dialCode = "+993", id = "TM", label = "Turkmenistan")
    __obj.asInstanceOf[`233`]
  }
  
  extension [Self <: `233`](x: Self) {
    
    inline def setDialCode(value: Plussign993): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Turkmenistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
