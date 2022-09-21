package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRulesetRequest extends StObject {
  
  /**
    * The name of the ruleset to be described.
    */
  var Name: RulesetName
}
object DescribeRulesetRequest {
  
  inline def apply(Name: RulesetName): DescribeRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesetRequest]
  }
  
  extension [Self <: DescribeRulesetRequest](x: Self) {
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
