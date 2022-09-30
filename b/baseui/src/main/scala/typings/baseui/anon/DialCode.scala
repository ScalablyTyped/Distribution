package typings.baseui.anon

import typings.baseui.baseuiStrings.AF
import typings.baseui.baseuiStrings.Plussign93
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialCode extends StObject {
  
  val dialCode: Plussign93
  
  val id: AF
  
  val label: String
}
object DialCode {
  
  inline def apply(): DialCode = {
    val __obj = js.Dynamic.literal(dialCode = "+93", id = "AF", label = "Afghanistan (\u202B\u0627\u0641\u063A\u0627\u0646\u0633\u062A\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[DialCode]
  }
  
  extension [Self <: DialCode](x: Self) {
    
    inline def setDialCode(value: Plussign93): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
