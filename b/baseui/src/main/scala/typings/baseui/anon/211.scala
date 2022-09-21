package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign677
import typings.baseui.baseuiStrings.SB
import typings.baseui.baseuiStrings.`Solomon Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `211` extends StObject {
  
  val dialCode: Plussign677
  
  val id: SB
  
  val label: `Solomon Islands`
}
object `211` {
  
  inline def apply(): `211` = {
    val __obj = js.Dynamic.literal(dialCode = "+677", id = "SB", label = "Solomon Islands")
    __obj.asInstanceOf[`211`]
  }
  
  extension [Self <: `211`](x: Self) {
    
    inline def setDialCode(value: Plussign677): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Solomon Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
