package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogState extends StObject {
  
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  
  var intent: js.UndefOr[IntentOverride] = js.undefined
  
  /**
    * Map of key/value pairs representing session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
}
object DialogState {
  
  inline def apply(): DialogState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogState]
  }
  
  extension [Self <: DialogState](x: Self) {
    
    inline def setDialogAction(value: DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
    
    inline def setIntent(value: IntentOverride): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setSessionAttributes(value: StringMap): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
  }
}
