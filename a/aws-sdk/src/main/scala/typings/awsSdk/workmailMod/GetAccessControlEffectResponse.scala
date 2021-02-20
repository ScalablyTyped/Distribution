package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessControlEffectResponse extends StObject {
  
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.native
  
  /**
    * The rules that match the given parameters, resulting in an effect.
    */
  var MatchedRules: js.UndefOr[AccessControlRuleNameList] = js.native
}
object GetAccessControlEffectResponse {
  
  @scala.inline
  def apply(): GetAccessControlEffectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessControlEffectResponse]
  }
  
  @scala.inline
  implicit class GetAccessControlEffectResponseMutableBuilder[Self <: GetAccessControlEffectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: AccessControlRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    @scala.inline
    def setMatchedRules(value: AccessControlRuleNameList): Self = StObject.set(x, "MatchedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedRulesUndefined: Self = StObject.set(x, "MatchedRules", js.undefined)
    
    @scala.inline
    def setMatchedRulesVarargs(value: AccessControlRuleName*): Self = StObject.set(x, "MatchedRules", js.Array(value :_*))
  }
}
