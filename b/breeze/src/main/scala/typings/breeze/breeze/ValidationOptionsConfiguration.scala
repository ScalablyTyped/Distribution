package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptionsConfiguration extends StObject {
  
  var validateOnAttach: js.UndefOr[Boolean] = js.undefined
  
  var validateOnPropertyChange: js.UndefOr[Boolean] = js.undefined
  
  var validateOnQuery: js.UndefOr[Boolean] = js.undefined
  
  var validateOnSave: js.UndefOr[Boolean] = js.undefined
}
object ValidationOptionsConfiguration {
  
  @scala.inline
  def apply(): ValidationOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptionsConfiguration]
  }
  
  @scala.inline
  implicit class ValidationOptionsConfigurationMutableBuilder[Self <: ValidationOptionsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidateOnAttach(value: Boolean): Self = StObject.set(x, "validateOnAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnAttachUndefined: Self = StObject.set(x, "validateOnAttach", js.undefined)
    
    @scala.inline
    def setValidateOnPropertyChange(value: Boolean): Self = StObject.set(x, "validateOnPropertyChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnPropertyChangeUndefined: Self = StObject.set(x, "validateOnPropertyChange", js.undefined)
    
    @scala.inline
    def setValidateOnQuery(value: Boolean): Self = StObject.set(x, "validateOnQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnQueryUndefined: Self = StObject.set(x, "validateOnQuery", js.undefined)
    
    @scala.inline
    def setValidateOnSave(value: Boolean): Self = StObject.set(x, "validateOnSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnSaveUndefined: Self = StObject.set(x, "validateOnSave", js.undefined)
  }
}
