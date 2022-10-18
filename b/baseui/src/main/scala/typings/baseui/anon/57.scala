package typings.baseui.anon

import typings.baseui.baseuiStrings.CO
import typings.baseui.baseuiStrings.Colombia
import typings.baseui.baseuiStrings.Plussign57
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  val dialCode: Plussign57
  
  val id: CO
  
  val label: Colombia
}
object `57` {
  
  inline def apply(): `57` = {
    val __obj = js.Dynamic.literal(dialCode = "+57", id = "CO", label = "Colombia")
    __obj.asInstanceOf[`57`]
  }
  
  extension [Self <: `57`](x: Self) {
    
    inline def setDialCode(value: Plussign57): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Colombia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
