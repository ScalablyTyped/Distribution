package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptions extends StObject {
  
  def setAsDefault(): ValidationOptions
  
  def `using`(config: ValidationOptionsConfiguration): ValidationOptions
  
  var validateOnAttach: Boolean
  
  var validateOnPropertyChange: Boolean
  
  var validateOnQuery: Boolean
  
  var validateOnSave: Boolean
}
object ValidationOptions {
  
  inline def apply(
    setAsDefault: () => ValidationOptions,
    `using`: ValidationOptionsConfiguration => ValidationOptions,
    validateOnAttach: Boolean,
    validateOnPropertyChange: Boolean,
    validateOnQuery: Boolean,
    validateOnSave: Boolean
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault), validateOnAttach = validateOnAttach.asInstanceOf[js.Any], validateOnPropertyChange = validateOnPropertyChange.asInstanceOf[js.Any], validateOnQuery = validateOnQuery.asInstanceOf[js.Any], validateOnSave = validateOnSave.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
    inline def setSetAsDefault(value: () => ValidationOptions): Self = StObject.set(x, "setAsDefault", js.Any.fromFunction0(value))
    
    inline def setUsing(value: ValidationOptionsConfiguration => ValidationOptions): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    inline def setValidateOnAttach(value: Boolean): Self = StObject.set(x, "validateOnAttach", value.asInstanceOf[js.Any])
    
    inline def setValidateOnPropertyChange(value: Boolean): Self = StObject.set(x, "validateOnPropertyChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnQuery(value: Boolean): Self = StObject.set(x, "validateOnQuery", value.asInstanceOf[js.Any])
    
    inline def setValidateOnSave(value: Boolean): Self = StObject.set(x, "validateOnSave", value.asInstanceOf[js.Any])
  }
}
