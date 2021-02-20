package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReceiptRuleSetResponse extends StObject {
  
  /**
    * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.native
  
  /**
    * A list of the receipt rules that belong to the specified receipt rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.native
}
object DescribeReceiptRuleSetResponse {
  
  @scala.inline
  def apply(): DescribeReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReceiptRuleSetResponse]
  }
  
  @scala.inline
  implicit class DescribeReceiptRuleSetResponseMutableBuilder[Self <: DescribeReceiptRuleSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: ReceiptRuleSetMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setRules(value: ReceiptRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ReceiptRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
