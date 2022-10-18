package typings.baseui.anon

import typings.baseui.baseuiStrings.CR
import typings.baseui.baseuiStrings.Plussign506
import typings.baseui.baseuiStrings.`Costa Rica`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  val dialCode: Plussign506
  
  val id: CR
  
  val label: `Costa Rica`
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal(dialCode = "+506", id = "CR", label = "Costa Rica")
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setDialCode(value: Plussign506): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Costa Rica`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
