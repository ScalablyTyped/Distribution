package typings.baseui.anon

import typings.baseui.baseuiStrings.MH
import typings.baseui.baseuiStrings.Plussign692
import typings.baseui.baseuiStrings.`Marshall Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  val dialCode: Plussign692
  
  val id: MH
  
  val label: `Marshall Islands`
}
object `143` {
  
  inline def apply(): `143` = {
    val __obj = js.Dynamic.literal(dialCode = "+692", id = "MH", label = "Marshall Islands")
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `143`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign692): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Marshall Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
