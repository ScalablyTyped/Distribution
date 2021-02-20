package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRuleMetadataRequest extends StObject {
  
  /**
    * The rule description.
    */
  var description: typings.awsSdk.frauddetectorMod.description = js.native
  
  /**
    * The rule to update.
    */
  var rule: Rule = js.native
}
object UpdateRuleMetadataRequest {
  
  @scala.inline
  def apply(description: description, rule: Rule): UpdateRuleMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleMetadataRequest]
  }
  
  @scala.inline
  implicit class UpdateRuleMetadataRequestMutableBuilder[Self <: UpdateRuleMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
