package typings.baseui.anon

import typings.baseui.baseuiStrings.GA
import typings.baseui.baseuiStrings.Gabon
import typings.baseui.baseuiStrings.Plussign241
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  val dialCode: Plussign241
  
  val id: GA
  
  val label: Gabon
}
object `87` {
  
  inline def apply(): `87` = {
    val __obj = js.Dynamic.literal(dialCode = "+241", id = "GA", label = "Gabon")
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `87`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign241): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Gabon): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
