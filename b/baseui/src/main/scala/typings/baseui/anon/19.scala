package typings.baseui.anon

import typings.baseui.baseuiStrings.AG
import typings.baseui.baseuiStrings.Plussign1268
import typings.baseui.baseuiStrings.`Antigua and Barbuda`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  val dialCode: Plussign1268
  
  val id: AG
  
  val label: `Antigua and Barbuda`
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(dialCode = "+1268", id = "AG", label = "Antigua and Barbuda")
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign1268): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Antigua and Barbuda`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
