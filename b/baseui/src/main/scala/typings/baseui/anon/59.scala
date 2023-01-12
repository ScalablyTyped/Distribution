package typings.baseui.anon

import typings.baseui.baseuiStrings.CD
import typings.baseui.baseuiStrings.Plussign243
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  val dialCode: Plussign243
  
  val id: CD
  
  val label: /* Congo (DRC) (Jamhuri ya Kisoemokrasia ya Kongo) */ String
}
object `59` {
  
  inline def apply(): `59` = {
    val __obj = js.Dynamic.literal(dialCode = "+243", id = "CD", label = "Congo (DRC) (Jamhuri ya Kisoemokrasia ya Kongo)")
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `59`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign243): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Congo (DRC) (Jamhuri ya Kisoemokrasia ya Kongo) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
