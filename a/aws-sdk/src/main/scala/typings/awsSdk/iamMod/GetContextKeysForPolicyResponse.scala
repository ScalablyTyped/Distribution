package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContextKeysForPolicyResponse extends StObject {
  
  /**
    * The list of context keys that are referenced in the input policies.
    */
  var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
}
object GetContextKeysForPolicyResponse {
  
  inline def apply(): GetContextKeysForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContextKeysForPolicyResponse]
  }
  
  extension [Self <: GetContextKeysForPolicyResponse](x: Self) {
    
    inline def setContextKeyNames(value: ContextKeyNamesResultListType): Self = StObject.set(x, "ContextKeyNames", value.asInstanceOf[js.Any])
    
    inline def setContextKeyNamesUndefined: Self = StObject.set(x, "ContextKeyNames", js.undefined)
    
    inline def setContextKeyNamesVarargs(value: ContextKeyNameType*): Self = StObject.set(x, "ContextKeyNames", js.Array(value*))
  }
}
