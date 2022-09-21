package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign228
import typings.baseui.baseuiStrings.TG
import typings.baseui.baseuiStrings.Togo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `230` extends StObject {
  
  val dialCode: Plussign228
  
  val id: TG
  
  val label: Togo
}
object `230` {
  
  inline def apply(): `230` = {
    val __obj = js.Dynamic.literal(dialCode = "+228", id = "TG", label = "Togo")
    __obj.asInstanceOf[`230`]
  }
  
  extension [Self <: `230`](x: Self) {
    
    inline def setDialCode(value: Plussign228): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Togo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
