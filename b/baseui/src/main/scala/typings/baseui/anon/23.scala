package typings.baseui.anon

import typings.baseui.baseuiStrings.AU
import typings.baseui.baseuiStrings.Australia
import typings.baseui.baseuiStrings.Plussign61
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  val dialCode: Plussign61
  
  val id: AU
  
  val label: Australia
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(dialCode = "+61", id = "AU", label = "Australia")
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign61): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Australia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
