package typings.baseui.anon

import typings.baseui.baseuiStrings.IM
import typings.baseui.baseuiStrings.Plussign44
import typings.baseui.baseuiStrings.`Isle of Man`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  val dialCode: Plussign44
  
  val id: IM
  
  val label: `Isle of Man`
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "IM", label = "Isle of Man")
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Isle of Man`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
