package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotCaptureSetting extends StObject {
  
  /**
    * A list of conditional branches to evaluate after the slot value is captured.
    */
  var captureConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
    */
  var captureNextStep: js.UndefOr[DialogState] = js.undefined
  
  var captureResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * Code hook called after Amazon Lex successfully captures a slot value.
    */
  var codeHook: js.UndefOr[DialogCodeHookInvocationSetting] = js.undefined
  
  /**
    * Code hook called when Amazon Lex doesn't capture a slot value.
    */
  var elicitationCodeHook: js.UndefOr[ElicitationCodeHookInvocationSetting] = js.undefined
  
  /**
    * A list of conditional branches to evaluate when the slot value isn't captured.
    */
  var failureConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step that the bot runs when the slot value code is not recognized.
    */
  var failureNextStep: js.UndefOr[DialogState] = js.undefined
  
  var failureResponse: js.UndefOr[ResponseSpecification] = js.undefined
}
object SlotCaptureSetting {
  
  inline def apply(): SlotCaptureSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotCaptureSetting]
  }
  
  extension [Self <: SlotCaptureSetting](x: Self) {
    
    inline def setCaptureConditional(value: ConditionalSpecification): Self = StObject.set(x, "captureConditional", value.asInstanceOf[js.Any])
    
    inline def setCaptureConditionalUndefined: Self = StObject.set(x, "captureConditional", js.undefined)
    
    inline def setCaptureNextStep(value: DialogState): Self = StObject.set(x, "captureNextStep", value.asInstanceOf[js.Any])
    
    inline def setCaptureNextStepUndefined: Self = StObject.set(x, "captureNextStep", js.undefined)
    
    inline def setCaptureResponse(value: ResponseSpecification): Self = StObject.set(x, "captureResponse", value.asInstanceOf[js.Any])
    
    inline def setCaptureResponseUndefined: Self = StObject.set(x, "captureResponse", js.undefined)
    
    inline def setCodeHook(value: DialogCodeHookInvocationSetting): Self = StObject.set(x, "codeHook", value.asInstanceOf[js.Any])
    
    inline def setCodeHookUndefined: Self = StObject.set(x, "codeHook", js.undefined)
    
    inline def setElicitationCodeHook(value: ElicitationCodeHookInvocationSetting): Self = StObject.set(x, "elicitationCodeHook", value.asInstanceOf[js.Any])
    
    inline def setElicitationCodeHookUndefined: Self = StObject.set(x, "elicitationCodeHook", js.undefined)
    
    inline def setFailureConditional(value: ConditionalSpecification): Self = StObject.set(x, "failureConditional", value.asInstanceOf[js.Any])
    
    inline def setFailureConditionalUndefined: Self = StObject.set(x, "failureConditional", js.undefined)
    
    inline def setFailureNextStep(value: DialogState): Self = StObject.set(x, "failureNextStep", value.asInstanceOf[js.Any])
    
    inline def setFailureNextStepUndefined: Self = StObject.set(x, "failureNextStep", js.undefined)
    
    inline def setFailureResponse(value: ResponseSpecification): Self = StObject.set(x, "failureResponse", value.asInstanceOf[js.Any])
    
    inline def setFailureResponseUndefined: Self = StObject.set(x, "failureResponse", js.undefined)
  }
}
