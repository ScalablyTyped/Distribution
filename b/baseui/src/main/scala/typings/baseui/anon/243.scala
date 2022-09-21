package typings.baseui.anon

import typings.baseui.baseuiStrings.GB
import typings.baseui.baseuiStrings.Plussign44
import typings.baseui.baseuiStrings.`United Kingdom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  val dialCode: Plussign44
  
  val id: GB
  
  val label: `United Kingdom`
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "GB", label = "United Kingdom")
    __obj.asInstanceOf[`243`]
  }
  
  extension [Self <: `243`](x: Self) {
    
    inline def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `United Kingdom`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
