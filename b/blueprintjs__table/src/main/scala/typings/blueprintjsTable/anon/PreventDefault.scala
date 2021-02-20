package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreventDefault extends StObject {
  
  var preventDefault: Boolean = js.native
  
  var stopPropagation: Boolean = js.native
}
object PreventDefault {
  
  @scala.inline
  def apply(preventDefault: Boolean, stopPropagation: Boolean): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventDefault]
  }
  
  @scala.inline
  implicit class PreventDefaultMutableBuilder[Self <: PreventDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
  }
}
