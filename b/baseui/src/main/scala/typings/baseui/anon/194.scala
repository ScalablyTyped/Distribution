package typings.baseui.anon

import typings.baseui.baseuiStrings.KN
import typings.baseui.baseuiStrings.Plussign1869
import typings.baseui.baseuiStrings.`Saint Kitts and Nevis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  val dialCode: Plussign1869
  
  val id: KN
  
  val label: `Saint Kitts and Nevis`
}
object `194` {
  
  inline def apply(): `194` = {
    val __obj = js.Dynamic.literal(dialCode = "+1869", id = "KN", label = "Saint Kitts and Nevis")
    __obj.asInstanceOf[`194`]
  }
  
  extension [Self <: `194`](x: Self) {
    
    inline def setDialCode(value: Plussign1869): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Kitts and Nevis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
