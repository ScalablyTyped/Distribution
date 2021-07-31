package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateParameter extends StObject {
  
  /**
    * The default value associated with the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
  
  /**
    * User defined description associated with the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
    */
  var NoEcho: js.UndefOr[typings.awsSdk.cloudformationMod.NoEcho] = js.undefined
  
  /**
    * The name associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.undefined
}
object TemplateParameter {
  
  @scala.inline
  def apply(): TemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateParameter]
  }
  
  @scala.inline
  implicit class TemplateParameterMutableBuilder[Self <: TemplateParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: ParameterValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setNoEcho(value: NoEcho): Self = StObject.set(x, "NoEcho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEchoUndefined: Self = StObject.set(x, "NoEcho", js.undefined)
    
    @scala.inline
    def setParameterKey(value: ParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterKeyUndefined: Self = StObject.set(x, "ParameterKey", js.undefined)
  }
}
