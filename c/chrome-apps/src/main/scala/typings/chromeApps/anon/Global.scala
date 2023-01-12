package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  /** Command description */
  var description: js.UndefOr[String] = js.undefined
  
  /** Global scope? */
  var global: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Keys can be provided matching this pattern:
    * ^(Ctrl|Command|MacCtrl|Alt|Option)\\+(Shift\\+)?[A-Z]
    * @example
    * 'suggested_key': {
    *     'default': 'Ctrl+Shift+Y',
    *     'mac': 'Command+Shift+Y'
    * },
    */
  var suggested_key: js.UndefOr[Chromeos] = js.undefined
}
object Global {
  
  inline def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setSuggested_key(value: Chromeos): Self = StObject.set(x, "suggested_key", value.asInstanceOf[js.Any])
    
    inline def setSuggested_keyUndefined: Self = StObject.set(x, "suggested_key", js.undefined)
  }
}
