package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the rule set to clone.
    */
  var OriginalRuleSetName: ReceiptRuleSetName
  
  /**
    * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var RuleSetName: ReceiptRuleSetName
}
object CloneReceiptRuleSetRequest {
  
  inline def apply(OriginalRuleSetName: ReceiptRuleSetName, RuleSetName: ReceiptRuleSetName): CloneReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(OriginalRuleSetName = OriginalRuleSetName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneReceiptRuleSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    inline def setOriginalRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "OriginalRuleSetName", value.asInstanceOf[js.Any])
    
    inline def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
