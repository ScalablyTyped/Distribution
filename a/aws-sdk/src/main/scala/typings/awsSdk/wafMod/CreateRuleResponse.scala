package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
  
  /**
    * The Rule returned in the CreateRule response.
    */
  var Rule: js.UndefOr[typings.awsSdk.wafMod.Rule] = js.undefined
}
object CreateRuleResponse {
  
  inline def apply(): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResponse]
  }
  
  extension [Self <: CreateRuleResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setRule(value: Rule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
