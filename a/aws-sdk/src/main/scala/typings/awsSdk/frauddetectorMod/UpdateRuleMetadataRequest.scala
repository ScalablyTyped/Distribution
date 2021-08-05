package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleMetadataRequest extends StObject {
  
  /**
    * The rule description.
    */
  var description: typings.awsSdk.frauddetectorMod.description
  
  /**
    * The rule to update.
    */
  var rule: Rule
}
object UpdateRuleMetadataRequest {
  
  inline def apply(description: description, rule: Rule): UpdateRuleMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleMetadataRequest]
  }
  
  extension [Self <: UpdateRuleMetadataRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
