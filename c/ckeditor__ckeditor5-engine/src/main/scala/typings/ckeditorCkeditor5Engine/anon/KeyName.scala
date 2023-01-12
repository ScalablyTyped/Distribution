package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyName extends StObject {
  
  var key: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.RegExp | String | (js.Function1[/* value */ Any, Boolean]) | Styles] = js.undefined
}
object KeyName {
  
  inline def apply(key: String): KeyName = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyName] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: js.RegExp | String | (js.Function1[/* value */ Any, Boolean]) | Styles): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction1(value: /* value */ Any => Boolean): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
