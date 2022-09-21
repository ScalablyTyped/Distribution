package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionState extends StObject {
  
  /**
    * One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active, Amazon Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
    */
  var activeContexts: js.UndefOr[ActiveContextsList] = js.undefined
  
  /**
    * The next step that Amazon Lex V2 should take in the conversation with a user.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  
  /**
    * The active intent that Amazon Lex V2 is processing.
    */
  var intent: js.UndefOr[Intent] = js.undefined
  
  /**
    * A unique identifier for a specific request.
    */
  var originatingRequestId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Hints for phrases that a customer is likely to use for a slot. Amazon Lex V2 uses the hints to help determine the correct value of a slot.
    */
  var runtimeHints: js.UndefOr[RuntimeHints] = js.undefined
  
  /**
    * Map of key/value pairs representing session-specific context information. It contains application information passed between Amazon Lex V2 and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
}
object SessionState {
  
  inline def apply(): SessionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionState]
  }
  
  extension [Self <: SessionState](x: Self) {
    
    inline def setActiveContexts(value: ActiveContextsList): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    inline def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    inline def setActiveContextsVarargs(value: ActiveContext*): Self = StObject.set(x, "activeContexts", js.Array(value*))
    
    inline def setDialogAction(value: DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
    
    inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setOriginatingRequestId(value: NonEmptyString): Self = StObject.set(x, "originatingRequestId", value.asInstanceOf[js.Any])
    
    inline def setOriginatingRequestIdUndefined: Self = StObject.set(x, "originatingRequestId", js.undefined)
    
    inline def setRuntimeHints(value: RuntimeHints): Self = StObject.set(x, "runtimeHints", value.asInstanceOf[js.Any])
    
    inline def setRuntimeHintsUndefined: Self = StObject.set(x, "runtimeHints", js.undefined)
    
    inline def setSessionAttributes(value: StringMap): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
  }
}
