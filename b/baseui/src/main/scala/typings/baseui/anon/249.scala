package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign967
import typings.baseui.baseuiStrings.YE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `249` extends StObject {
  
  val dialCode: Plussign967
  
  val id: YE
  
  val label: /* Yemen (‫اليمن‬‎) */ String
}
object `249` {
  
  inline def apply(): `249` = {
    val __obj = js.Dynamic.literal(dialCode = "+967", id = "YE", label = "Yemen (\u202B\u0627\u0644\u064A\u0645\u0646\u202C\u200E)")
    __obj.asInstanceOf[`249`]
  }
  
  extension [Self <: `249`](x: Self) {
    
    inline def setDialCode(value: Plussign967): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: YE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Yemen (‫اليمن‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
