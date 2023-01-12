package typings.blueprintjsSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetOnQuery extends StObject {
  
  var disabled: Boolean
  
  var resetOnQuery: Boolean
}
object ResetOnQuery {
  
  inline def apply(disabled: Boolean, resetOnQuery: Boolean): ResetOnQuery = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], resetOnQuery = resetOnQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetOnQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetOnQuery] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
  }
}
