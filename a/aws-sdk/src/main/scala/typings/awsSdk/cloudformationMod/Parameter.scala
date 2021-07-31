package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.undefined
  
  /**
    * The input value associated with the parameter.
    */
  var ParameterValue: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterValue] = js.undefined
  
  /**
    * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for  SSM parameter types in the template.
    */
  var ResolvedValue: js.UndefOr[ParameterValue] = js.undefined
  
  /**
    * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you specify true, do not specify a parameter value.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.cloudformationMod.UsePreviousValue] = js.undefined
}
object Parameter {
  
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterKey(value: ParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterKeyUndefined: Self = StObject.set(x, "ParameterKey", js.undefined)
    
    @scala.inline
    def setParameterValue(value: ParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
    
    @scala.inline
    def setResolvedValue(value: ParameterValue): Self = StObject.set(x, "ResolvedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedValueUndefined: Self = StObject.set(x, "ResolvedValue", js.undefined)
    
    @scala.inline
    def setUsePreviousValue(value: UsePreviousValue): Self = StObject.set(x, "UsePreviousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePreviousValueUndefined: Self = StObject.set(x, "UsePreviousValue", js.undefined)
  }
}
