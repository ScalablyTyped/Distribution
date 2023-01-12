package typings.cloudflare.anon

import typings.cloudflare.cloudflareStrings.full
import typings.cloudflare.cloudflareStrings.partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: IdString
  
  var jump_start: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var `type`: js.UndefOr[full | partial] = js.undefined
}
object Action {
  
  inline def apply(action: IdString, name: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: IdString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setJump_start(value: Boolean): Self = StObject.set(x, "jump_start", value.asInstanceOf[js.Any])
    
    inline def setJump_startUndefined: Self = StObject.set(x, "jump_start", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: full | partial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
