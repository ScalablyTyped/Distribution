package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign248
import typings.baseui.baseuiStrings.SC
import typings.baseui.baseuiStrings.Seychelles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202` extends StObject {
  
  val dialCode: Plussign248
  
  val id: SC
  
  val label: Seychelles
}
object `202` {
  
  inline def apply(): `202` = {
    val __obj = js.Dynamic.literal(dialCode = "+248", id = "SC", label = "Seychelles")
    __obj.asInstanceOf[`202`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign248): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Seychelles): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
