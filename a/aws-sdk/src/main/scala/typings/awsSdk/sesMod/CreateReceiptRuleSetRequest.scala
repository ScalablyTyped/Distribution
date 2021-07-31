package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var RuleSetName: ReceiptRuleSetName
}
object CreateReceiptRuleSetRequest {
  
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): CreateReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReceiptRuleSetRequest]
  }
  
  @scala.inline
  implicit class CreateReceiptRuleSetRequestMutableBuilder[Self <: CreateReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
