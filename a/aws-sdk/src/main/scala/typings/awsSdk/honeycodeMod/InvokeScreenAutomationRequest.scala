package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeScreenAutomationRequest extends StObject {
  
  /**
    * The ID of the app that contains the screen automation.
    */
  var appId: ResourceId
  
  /**
    *  The request token for performing the automation action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will return the response of the previous call rather than performing the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    *  The row ID for the automation if the automation is defined inside a block with source or list. 
    */
  var rowId: js.UndefOr[RowId] = js.undefined
  
  /**
    * The ID of the automation action to be performed.
    */
  var screenAutomationId: ResourceId
  
  /**
    * The ID of the screen that contains the screen automation.
    */
  var screenId: ResourceId
  
  /**
    *  Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. Any variables defined in a screen are required to be passed in the call. 
    */
  var variables: js.UndefOr[VariableValueMap] = js.undefined
  
  /**
    * The ID of the workbook that contains the screen automation.
    */
  var workbookId: ResourceId
}
object InvokeScreenAutomationRequest {
  
  inline def apply(appId: ResourceId, screenAutomationId: ResourceId, screenId: ResourceId, workbookId: ResourceId): InvokeScreenAutomationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], screenAutomationId = screenAutomationId.asInstanceOf[js.Any], screenId = screenId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeScreenAutomationRequest]
  }
  
  extension [Self <: InvokeScreenAutomationRequest](x: Self) {
    
    inline def setAppId(value: ResourceId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setRowId(value: RowId): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    inline def setScreenAutomationId(value: ResourceId): Self = StObject.set(x, "screenAutomationId", value.asInstanceOf[js.Any])
    
    inline def setScreenId(value: ResourceId): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: VariableValueMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
