package typings.baseui.anon

import typings.baseui.baseuiStrings.MH
import typings.baseui.baseuiStrings.Plussign692
import typings.baseui.baseuiStrings.`Marshall Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  val dialCode: Plussign692
  
  val id: MH
  
  val label: `Marshall Islands`
}
object `146` {
  
  inline def apply(): `146` = {
    val __obj = js.Dynamic.literal(dialCode = "+692", id = "MH", label = "Marshall Islands")
    __obj.asInstanceOf[`146`]
  }
  
  extension [Self <: `146`](x: Self) {
    
    inline def setDialCode(value: Plussign692): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Marshall Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
