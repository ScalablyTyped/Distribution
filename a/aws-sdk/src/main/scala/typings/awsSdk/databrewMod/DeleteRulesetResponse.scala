package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRulesetResponse extends StObject {
  
  /**
    * The name of the deleted ruleset.
    */
  var Name: RulesetName
}
object DeleteRulesetResponse {
  
  inline def apply(Name: RulesetName): DeleteRulesetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRulesetResponse]
  }
  
  extension [Self <: DeleteRulesetResponse](x: Self) {
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
