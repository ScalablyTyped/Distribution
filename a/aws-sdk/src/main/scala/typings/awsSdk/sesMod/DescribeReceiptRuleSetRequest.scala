package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the receipt rule set to describe.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}
object DescribeReceiptRuleSetRequest {
  
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleSetRequest]
  }
  
  @scala.inline
  implicit class DescribeReceiptRuleSetRequestMutableBuilder[Self <: DescribeReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
