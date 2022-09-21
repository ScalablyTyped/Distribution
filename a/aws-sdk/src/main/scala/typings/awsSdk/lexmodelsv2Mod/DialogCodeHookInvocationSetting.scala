package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCodeHookInvocationSetting extends StObject {
  
  /**
    * Determines whether a dialog code hook is used when the intent is activated.
    */
  var active: BoxedBoolean
  
  /**
    * Indicates whether a Lambda function should be invoked for the dialog.
    */
  var enableCodeHookInvocation: BoxedBoolean
  
  /**
    * A label that indicates the dialog step from which the dialog code hook is happening.
    */
  var invocationLabel: js.UndefOr[Name] = js.undefined
  
  /**
    * Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
    */
  var postCodeHookSpecification: PostDialogCodeHookInvocationSpecification
}
object DialogCodeHookInvocationSetting {
  
  inline def apply(
    active: BoxedBoolean,
    enableCodeHookInvocation: BoxedBoolean,
    postCodeHookSpecification: PostDialogCodeHookInvocationSpecification
  ): DialogCodeHookInvocationSetting = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], enableCodeHookInvocation = enableCodeHookInvocation.asInstanceOf[js.Any], postCodeHookSpecification = postCodeHookSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCodeHookInvocationSetting]
  }
  
  extension [Self <: DialogCodeHookInvocationSetting](x: Self) {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setEnableCodeHookInvocation(value: BoxedBoolean): Self = StObject.set(x, "enableCodeHookInvocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationLabel(value: Name): Self = StObject.set(x, "invocationLabel", value.asInstanceOf[js.Any])
    
    inline def setInvocationLabelUndefined: Self = StObject.set(x, "invocationLabel", js.undefined)
    
    inline def setPostCodeHookSpecification(value: PostDialogCodeHookInvocationSpecification): Self = StObject.set(x, "postCodeHookSpecification", value.asInstanceOf[js.Any])
  }
}
