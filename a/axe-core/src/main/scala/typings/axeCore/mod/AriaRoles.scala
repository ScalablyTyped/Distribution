package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaRoles extends StObject {
  
  var allowedAttrs: js.UndefOr[js.Array[String]] = js.undefined
  
  var nameFromContent: js.UndefOr[Boolean] = js.undefined
  
  var requiredAttrs: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredContext: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredOwned: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: AriaRolesType | DpubRolesType
  
  var unsupported: js.UndefOr[Boolean] = js.undefined
}
object AriaRoles {
  
  inline def apply(`type`: AriaRolesType | DpubRolesType): AriaRoles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaRoles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaRoles] (val x: Self) extends AnyVal {
    
    inline def setAllowedAttrs(value: js.Array[String]): Self = StObject.set(x, "allowedAttrs", value.asInstanceOf[js.Any])
    
    inline def setAllowedAttrsUndefined: Self = StObject.set(x, "allowedAttrs", js.undefined)
    
    inline def setAllowedAttrsVarargs(value: String*): Self = StObject.set(x, "allowedAttrs", js.Array(value*))
    
    inline def setNameFromContent(value: Boolean): Self = StObject.set(x, "nameFromContent", value.asInstanceOf[js.Any])
    
    inline def setNameFromContentUndefined: Self = StObject.set(x, "nameFromContent", js.undefined)
    
    inline def setRequiredAttrs(value: js.Array[String]): Self = StObject.set(x, "requiredAttrs", value.asInstanceOf[js.Any])
    
    inline def setRequiredAttrsUndefined: Self = StObject.set(x, "requiredAttrs", js.undefined)
    
    inline def setRequiredAttrsVarargs(value: String*): Self = StObject.set(x, "requiredAttrs", js.Array(value*))
    
    inline def setRequiredContext(value: js.Array[String]): Self = StObject.set(x, "requiredContext", value.asInstanceOf[js.Any])
    
    inline def setRequiredContextUndefined: Self = StObject.set(x, "requiredContext", js.undefined)
    
    inline def setRequiredContextVarargs(value: String*): Self = StObject.set(x, "requiredContext", js.Array(value*))
    
    inline def setRequiredOwned(value: js.Array[String]): Self = StObject.set(x, "requiredOwned", value.asInstanceOf[js.Any])
    
    inline def setRequiredOwnedUndefined: Self = StObject.set(x, "requiredOwned", js.undefined)
    
    inline def setRequiredOwnedVarargs(value: String*): Self = StObject.set(x, "requiredOwned", js.Array(value*))
    
    inline def setType(value: AriaRolesType | DpubRolesType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedUndefined: Self = StObject.set(x, "unsupported", js.undefined)
  }
}
