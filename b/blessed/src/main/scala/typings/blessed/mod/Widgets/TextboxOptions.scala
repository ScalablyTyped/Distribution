package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextboxOptions
  extends StObject
     with TextareaOptions {
  
  /**
    * Replace text with asterisks (*).
    */
  var censor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Completely hide text.
    */
  var secret: js.UndefOr[Boolean] = js.undefined
}
object TextboxOptions {
  
  inline def apply(): TextboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextboxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextboxOptions] (val x: Self) extends AnyVal {
    
    inline def setCensor(value: Boolean): Self = StObject.set(x, "censor", value.asInstanceOf[js.Any])
    
    inline def setCensorUndefined: Self = StObject.set(x, "censor", js.undefined)
    
    inline def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
