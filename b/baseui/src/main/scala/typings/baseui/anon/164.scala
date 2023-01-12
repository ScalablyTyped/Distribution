package typings.baseui.anon

import typings.baseui.baseuiStrings.NI
import typings.baseui.baseuiStrings.Nicaragua
import typings.baseui.baseuiStrings.Plussign505
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  val dialCode: Plussign505
  
  val id: NI
  
  val label: Nicaragua
}
object `164` {
  
  inline def apply(): `164` = {
    val __obj = js.Dynamic.literal(dialCode = "+505", id = "NI", label = "Nicaragua")
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `164`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign505): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Nicaragua): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
