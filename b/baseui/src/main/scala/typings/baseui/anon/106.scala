package typings.baseui.anon

import typings.baseui.baseuiStrings.HT
import typings.baseui.baseuiStrings.Haiti
import typings.baseui.baseuiStrings.Plussign509
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  val dialCode: Plussign509
  
  val id: HT
  
  val label: Haiti
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal(dialCode = "+509", id = "HT", label = "Haiti")
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setDialCode(value: Plussign509): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Haiti): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
