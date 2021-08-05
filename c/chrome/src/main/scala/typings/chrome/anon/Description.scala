package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var suggested_key: js.UndefOr[Chromeos] = js.undefined
}
object Description {
  
  inline def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setSuggested_key(value: Chromeos): Self = StObject.set(x, "suggested_key", value.asInstanceOf[js.Any])
    
    inline def setSuggested_keyUndefined: Self = StObject.set(x, "suggested_key", js.undefined)
  }
}
