package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends StObject {
  
  def setAsDefault(): ValidationOptions = js.native
  
  def using(config: ValidationOptionsConfiguration): ValidationOptions = js.native
  
  var validateOnAttach: Boolean = js.native
  
  var validateOnPropertyChange: Boolean = js.native
  
  var validateOnQuery: Boolean = js.native
  
  var validateOnSave: Boolean = js.native
}
object ValidationOptions {
  
  @scala.inline
  def apply(
    setAsDefault: () => ValidationOptions,
    using: ValidationOptionsConfiguration => ValidationOptions,
    validateOnAttach: Boolean,
    validateOnPropertyChange: Boolean,
    validateOnQuery: Boolean,
    validateOnSave: Boolean
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault), using = js.Any.fromFunction1(using), validateOnAttach = validateOnAttach.asInstanceOf[js.Any], validateOnPropertyChange = validateOnPropertyChange.asInstanceOf[js.Any], validateOnQuery = validateOnQuery.asInstanceOf[js.Any], validateOnSave = validateOnSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAsDefault(value: () => ValidationOptions): Self = StObject.set(x, "setAsDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsing(value: ValidationOptionsConfiguration => ValidationOptions): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateOnAttach(value: Boolean): Self = StObject.set(x, "validateOnAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnPropertyChange(value: Boolean): Self = StObject.set(x, "validateOnPropertyChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnQuery(value: Boolean): Self = StObject.set(x, "validateOnQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnSave(value: Boolean): Self = StObject.set(x, "validateOnSave", value.asInstanceOf[js.Any])
  }
}
