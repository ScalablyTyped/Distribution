package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInIntentSummary extends StObject {
  
  /**
    * The description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The signature of the built-in intent. Use this to specify the parent intent of a derived intent.
    */
  var intentSignature: js.UndefOr[IntentSignature] = js.undefined
}
object BuiltInIntentSummary {
  
  inline def apply(): BuiltInIntentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltInIntentSummary]
  }
  
  extension [Self <: BuiltInIntentSummary](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIntentSignature(value: IntentSignature): Self = StObject.set(x, "intentSignature", value.asInstanceOf[js.Any])
    
    inline def setIntentSignatureUndefined: Self = StObject.set(x, "intentSignature", js.undefined)
  }
}
