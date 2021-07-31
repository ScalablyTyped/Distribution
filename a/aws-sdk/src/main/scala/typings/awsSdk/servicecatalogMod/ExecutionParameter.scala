package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionParameter extends StObject {
  
  /**
    * The default values for the execution parameter.
    */
  var DefaultValues: js.UndefOr[ExecutionParameterValueList] = js.undefined
  
  /**
    * The name of the execution parameter.
    */
  var Name: js.UndefOr[ExecutionParameterKey] = js.undefined
  
  /**
    * The execution parameter type.
    */
  var Type: js.UndefOr[ExecutionParameterType] = js.undefined
}
object ExecutionParameter {
  
  @scala.inline
  def apply(): ExecutionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionParameter]
  }
  
  @scala.inline
  implicit class ExecutionParameterMutableBuilder[Self <: ExecutionParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValues(value: ExecutionParameterValueList): Self = StObject.set(x, "DefaultValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesUndefined: Self = StObject.set(x, "DefaultValues", js.undefined)
    
    @scala.inline
    def setDefaultValuesVarargs(value: ExecutionParameterValue*): Self = StObject.set(x, "DefaultValues", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ExecutionParameterKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setType(value: ExecutionParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
