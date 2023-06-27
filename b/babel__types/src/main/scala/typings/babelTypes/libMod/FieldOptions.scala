package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOptions extends StObject {
  
  var default: js.UndefOr[String | Double | Boolean | js.Array[Any]] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var validate: js.UndefOr[Validator] = js.undefined
}
object FieldOptions {
  
  inline def apply(): FieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldOptions] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String | Double | Boolean | js.Array[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setValidate(value: Validator): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateFunction3(value: (/* node */ Node, /* key */ String, /* val */ Any) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
