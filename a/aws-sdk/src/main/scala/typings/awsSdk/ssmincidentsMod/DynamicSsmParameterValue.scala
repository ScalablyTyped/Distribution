package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicSsmParameterValue extends StObject {
  
  /**
    * Variable dynamic parameters. A parameter value is determined when an incident is created.
    */
  var variable: js.UndefOr[VariableType] = js.undefined
}
object DynamicSsmParameterValue {
  
  inline def apply(): DynamicSsmParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSsmParameterValue]
  }
  
  extension [Self <: DynamicSsmParameterValue](x: Self) {
    
    inline def setVariable(value: VariableType): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
