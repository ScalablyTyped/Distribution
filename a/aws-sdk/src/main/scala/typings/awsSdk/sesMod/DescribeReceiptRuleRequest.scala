package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReceiptRuleRequest extends StObject {
  
  /**
    * The name of the receipt rule.
    */
  var RuleName: ReceiptRuleName = js.native
  
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}
object DescribeReceiptRuleRequest {
  
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleRequest]
  }
  
  @scala.inline
  implicit class DescribeReceiptRuleRequestMutableBuilder[Self <: DescribeReceiptRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: ReceiptRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
