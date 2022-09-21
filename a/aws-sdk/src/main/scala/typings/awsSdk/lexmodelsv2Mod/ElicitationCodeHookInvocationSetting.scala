package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElicitationCodeHookInvocationSetting extends StObject {
  
  /**
    * Indicates whether a Lambda function should be invoked for the dialog.
    */
  var enableCodeHookInvocation: BoxedBoolean
  
  /**
    * A label that indicates the dialog step from which the dialog code hook is happening.
    */
  var invocationLabel: js.UndefOr[Name] = js.undefined
}
object ElicitationCodeHookInvocationSetting {
  
  inline def apply(enableCodeHookInvocation: BoxedBoolean): ElicitationCodeHookInvocationSetting = {
    val __obj = js.Dynamic.literal(enableCodeHookInvocation = enableCodeHookInvocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElicitationCodeHookInvocationSetting]
  }
  
  extension [Self <: ElicitationCodeHookInvocationSetting](x: Self) {
    
    inline def setEnableCodeHookInvocation(value: BoxedBoolean): Self = StObject.set(x, "enableCodeHookInvocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationLabel(value: Name): Self = StObject.set(x, "invocationLabel", value.asInstanceOf[js.Any])
    
    inline def setInvocationLabelUndefined: Self = StObject.set(x, "invocationLabel", js.undefined)
  }
}
