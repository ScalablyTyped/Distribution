package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContextKeysForPolicyResponse extends StObject {
  
  /**
    * The list of context keys that are referenced in the input policies.
    */
  var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.native
}
object GetContextKeysForPolicyResponse {
  
  @scala.inline
  def apply(): GetContextKeysForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContextKeysForPolicyResponse]
  }
  
  @scala.inline
  implicit class GetContextKeysForPolicyResponseMutableBuilder[Self <: GetContextKeysForPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextKeyNames(value: ContextKeyNamesResultListType): Self = StObject.set(x, "ContextKeyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextKeyNamesUndefined: Self = StObject.set(x, "ContextKeyNames", js.undefined)
    
    @scala.inline
    def setContextKeyNamesVarargs(value: ContextKeyNameType*): Self = StObject.set(x, "ContextKeyNames", js.Array(value :_*))
  }
}
