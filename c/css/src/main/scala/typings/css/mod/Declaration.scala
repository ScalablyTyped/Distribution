package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declaration
  extends StObject
     with Node {
  
  /** The property name, trimmed from whitespace and comments. May not be empty. */
  var property: js.UndefOr[String] = js.undefined
  
  /** The value of the property, trimmed from whitespace and comments. Empty values are allowed. */
  var value: js.UndefOr[String] = js.undefined
}
object Declaration {
  
  inline def apply(): Declaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Declaration] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
